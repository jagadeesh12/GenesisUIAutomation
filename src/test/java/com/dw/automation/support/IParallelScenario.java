package com.dw.automation.support;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import cucumber.runtime.RuntimeOptions;
import cucumber.runtime.RuntimeOptionsFactory;
import cucumber.runtime.io.MultiLoader;
import cucumber.runtime.io.ResourceLoader;
import cucumber.runtime.model.CucumberFeature;
import cucumber.runtime.model.CucumberScenario;
import cucumber.runtime.model.CucumberScenarioOutline;
import cucumber.runtime.model.CucumberTagStatement;

public class IParallelScenario implements IMethodInterceptor, ISuiteListener {

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods,
			ITestContext context) {
		XmlSuite xmlSuite = context.getSuite().getXmlSuite();
		List<XmlTest> oldXmlTests = xmlSuite.getTests();
		List<XmlTest> newXmlTests = new ArrayList<XmlTest>();
		for (XmlTest xmlTest : oldXmlTests) {
			if (!xmlTest.getTestParameters().containsKey("enabled")
					|| xmlTest.getTestParameters().get("enabled").equals("true")) {
				List<CucumberFeature> features = getFeatures(xmlTest);
				String fp = xmlTest.getParameter("features");
				xmlTest.getTestParameters().remove("features");
				for (CucumberFeature feature : features) {
					for (CucumberTagStatement featureElement : feature
							.getFeatureElements()) {
						if (featureElement instanceof CucumberScenario
								|| featureElement instanceof CucumberScenarioOutline) {
							String name = featureElement.getVisualName();
							name =
									name.substring(name.indexOf(":") + 1,
											name.lastIndexOf(":")).trim();
							XmlTest temp = new XmlTest();
							temp.addParameter("scenario", name);
							temp.addParameter("features", fp + "/" + feature.getPath());
							for (Entry<String, String> s : xmlTest.getTestParameters()
									.entrySet()) {
								temp.addParameter(s.getKey(), s.getValue());
							}
							temp.setName(name);

							temp.setClasses(xmlTest.getClasses());
							newXmlTests.add(temp);
						}
					}
				}
			}
		}
		context.getSuite().getXmlSuite().getTests().clear();
		for (XmlTest xmlTest : newXmlTests) {
			context.getSuite().getXmlSuite().addTest(xmlTest);
		}
		try {

			File temp = File.createTempFile("suite", ".xml");
			BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
			bw.write(context.getSuite().getXmlSuite().toXml());
			bw.close();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return methods;
	}

	public List<CucumberFeature> getFeatures(XmlTest xmlTest) {
		ClassLoader classLoader;
		ResourceLoader resourceLoader;
		RuntimeOptions runtimeOptions;

		classLoader = xmlTest.getClass().getClassLoader();
		resourceLoader = new MultiLoader(classLoader);
		RuntimeOptionsFactory runtimeOptionsFactory =
				new RuntimeOptionsFactory(xmlTest.getClass());
		runtimeOptions = runtimeOptionsFactory.create();
		File file = new File(xmlTest.getParameter("features"));
		runtimeOptions.getFeaturePaths().add(file.getPath());
		return runtimeOptions.cucumberFeatures(resourceLoader);
	}

	@Override
	public void onFinish(ISuite suite) {

	}

	@Override
	public void onStart(ISuite s) {

	}
}
