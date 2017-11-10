package com.dw.automation.steps;
import static com.scholastic.torque.common.TestBaseProvider.getTestBase;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;


import javax.imageio.ImageIO;

import bsh.commands.dir;

import com.scholastic.torque.cucumber.ScenarioHook;

import org.apache.commons.configuration.Configuration;
import org.apache.http.client.ClientProtocolException;
import org.json.JSONArray;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import com.dw.automation.pages.impl.StudentFlyerOrdersPage;
import com.dw.automation.support.DMClient;
import com.dw.automation.support.PauseUtil;
import com.dw.automation.support.SCHUtils;
import com.saucelabs.saucerest.SauceREST;
import com.scholastic.torque.common.TestBase;
import com.scholastic.torque.common.TestBaseProvider;
import com.tdm.client.TDMClient;
import com.tdm.support.UserEntity;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends ScenarioHook {
	StudentFlyerOrdersPage StudFlyPage=new StudentFlyerOrdersPage();
	TDMClient tdm = new TDMClient(getTestBase().getContext().getString("tdm.server.url"));
	static {
		System.setProperty("webdriver.gecko.driver", "servers/geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette","servers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","servers/IEDriverServer.exe");
	}
	@Before
	public void beforeHook(Scenario scenario) {
		synchronized (this) {
			getTestBase().getContext().setProperty("scenario.obj", scenario);
			TestBase testBase = TestBaseProvider.getTestBase();
			testBase.getContext().clearProperty("tdm.UserProfile");
			testBase.getContext().subset("testexecution").clear();
			String session = testBase.getSessionID();

			if (!session.equalsIgnoreCase("") && !testBase.getContext().getString("sauce")
					.equalsIgnoreCase("false")) {
				SauceREST sClient =
						new SauceREST(testBase.getContext().getString("sauce.username"),
								testBase.getContext().getString("sauce.access.key"));
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("name", scenario.getName());
				sClient.updateJobInfo(session, params);
			}

			testBase.getDriver().manage().deleteAllCookies();
			testBase.getDriver().get(testBase.getString("url"));

			if (!(testBase.getContext().getString("driver.name")
					.equalsIgnoreCase("Android")
					|| testBase.getContext().getString("driver.name")
							.equalsIgnoreCase("IOs")
					|| testBase.getContext().getString("driver.name")
							.equalsIgnoreCase("Remote"))) {
				testBase.getDriver().manage().window().maximize();
			} else {
				PauseUtil.pause(5000);
			}

			String scenarioName = scenario.getName();
			if (!scenarioName.contains("Create New Test Data")) {
				populateTestdata(scenarioName);
				try {
					DMClient client = new DMClient();
					String str = client.getUser(TestBaseProvider.getTestBase()
							.getTestData().getString("tdm.userid").trim());
					JSONArray j = new JSONArray(str);
					getTestBase().getTestData().setProperty("existingprofile.firstname",
							j.getJSONObject(0).getJSONObject("basicProfile")
									.getString("firstName"));
					getTestBase().getTestData().setProperty("existingprofile.lastname",
							j.getJSONObject(0).getJSONObject("basicProfile")
									.getString("lastName"));
					getTestBase().getTestData().setProperty("existingprofile.email",
							j.getJSONObject(0).getJSONObject("basicProfile")
									.getString("email"));
					getTestBase().getTestData().setProperty("existingprofile.phonenumber",
							j.getJSONObject(0).getJSONObject("basicProfile")
									.getJSONObject("phones").getJSONObject("home")
									.getString("phoneNumber"));
				} catch (Exception e) {
				}
			}
			PauseUtil.pause(5000);
			SCHUtils.waitForLoaderToDismiss();
		}
	}

	public static void main(String[] args) {
		String str =
				"[{'realm':'consumer','status':'ACTIVE','identifiers':{'sps':'92517029','ucn':'639506175'},'credentials':{'userName':'parent@parent.in'},'basicProfile':{'title':'na','firstName':'parent','lastName':'parent','dob':{},'gender':'','privacyPolicyAcceptedVer':'true','termsAcceptedVer':'true','poEnabled':false,'email':'parent@parent.in','phones':{'home':{'phoneNumber':'9797554689'}},'addresses':{},'emailStmts':false,'badgeColor':'','userConsentedLatestPrivPolicy':false,'userConsentedLatestTerms':false},'personas':{'consumer':{},'parent':{'children':{'31019570':{'id':'31019570','firstName':'son','lastName':'son','classId':'V3MV8','gender':'','dob':{'monthOfYear':2,'year':1996},'classRoomTeacherFlag':false,'seqNumber':2,'grade':{'value':'1st Grade','key':'first'}},'29157292':{'id':'29157292','firstName':'child','lastName':'child','classId':'V3MV8','gender':'','dob':{'monthOfYear':1,'year':1993},'classRoomTeacherFlag':false,'seqNumber':1,'grade':{'value':'2nd Grade','key':'second'}}}}},'contexts':{'clubs':{'dwPilotParticipantFlag':false,'loggedIntoDwPilotFlag':false,'dwPilotParticipantParent':true,'loggedIntoDwPilotParent':true,'dwPilotParticipantLastModified':'2016-04-11T11:14:22.000Z','loggedIntoDwPilotLastModified':'2016-04-11T11:14:22.000Z','dwPilotParticipantParentLastModified':'2016-04-11T11:14:22.000Z','loggedIntoDwPilotParentLastModified':'2016-04-11T11:14:22.000Z'}},'wallet':{'creditCards':{'0108386499751117':{'cbsToken':'0108386499751117','billingAddress':{'firstName':'v12','lastName':'v13','address1':'Patrick Henry Drive','address2':'St. Mark Place','city':'New York','state':'NY','country':'US','postalCode':'10001'},'source':'customer','cardType':'discover','maskedCardNumber':'************1117','expiration':{'monthOfYear':2,'year':2019},'primary':false,'phoneNumber':'333-333-3333'}}},'offlineAccountFlag':false,'id':'92517029'}]";
		JSONArray j = new JSONArray(str);
		System.out.println(j.getJSONObject(0).getJSONObject("basicProfile")
				.getJSONObject("phones").getJSONObject("home").getString("phoneNumber"));
	}
	@After
	public void afterHook(Scenario scenario)
			throws URISyntaxException, ClientProtocolException, IOException {
		synchronized (this) {
			//StudFlyPage.CSR_signOut_from_Application();		//Commented by Siva because it will be useful when CSR wants to logs out from every scenario.
			WebDriver driver = TestBaseProvider.getTestBase().getDriver();
			Configuration data = TestBaseProvider.getTestBase().getTestData();
			//afterScenario(scenario);
			//takeScreenshot(scenario);
			if (scenario.isFailed()) {
				System.out.println("Method Failed::::::::::::"
						+ TestBaseProvider.getTestBase().getString("Method"));
				try {
					scenario.write("Current Page URL is " + driver.getCurrentUrl());
					/*byte[] screenshot =
							((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
					scenario.embed(screenshot, "image/png");*/
					if (TestBaseProvider.getTestBase().getContext().getString("tdm.data")
							.equalsIgnoreCase("on")) {
						try {
							tdm.releaseUser(data.getString("userid"),
									data.getString("tdm.converttotype"), "Deleted");
						} catch (Exception e) {

						}
					}
				} catch (WebDriverException somePlatformsDontSupportScreenshots) {
					System.err.println(somePlatformsDontSupportScreenshots.getMessage());
				}

			} else {
				if (TestBaseProvider.getTestBase().getContext().getString("tdm.data")
						.equalsIgnoreCase("on")) {
					try {
						if (!data.getString("tdm.converttotype").contains("_")) {
							tdm.releaseUser(data.getString("userid"),
									data.getString("tdm.converttotype"), "Deleted");
						} else {
							tdm.releaseUser(data.getString("userid"),
									data.getString("tdm.converttotype"), "Active");
						}
					} catch (Exception e) {

					}
				}
			}
			String session = TestBaseProvider.getTestBase().getSessionID();
			
			if (!scenario.isFailed())
				System.out.println("ScenarioFailed=" + scenario.getName() + "<>Session="
						+ session + "<>Status=Passed<>Platform=" + TestBaseProvider
								.getTestBase().getContext().getString("driver.name"));
			else
				System.out.println("ScenarioFailed=" + scenario.getName() + "<>Session="
						+ session + "<>Status=Failed<>Platform=" + TestBaseProvider
								.getTestBase().getContext().getString("driver.name"));
			System.out.println("SauceOnDemandSessionID=" + session + " job-name="
					+ scenario.getName());

			takeScreenshot(scenario);

			if (!session.equalsIgnoreCase("") && !TestBaseProvider.getTestBase()
					.getContext().getString("sauce").equalsIgnoreCase("false")) {
				TestBase testBase = TestBaseProvider.getTestBase();
				SauceREST sClient =
						new SauceREST(testBase.getContext().getString("sauce.username"),
								testBase.getContext().getString("sauce.access.key"));
				System.out.println("SessionID::" + session);
				if (scenario.isFailed())
					sClient.jobFailed(session);
				else sClient.jobPassed(session);
			}

			TestBaseProvider.getTestBase().tearDown();
		}


	}
	private void populateTestdata(String scenarioName) {
		String[] nameArray = scenarioName.split(":\\[");
		String testcaseid = null;
		if (nameArray.length == 2) {
			testcaseid = nameArray[1].replace("]", "");
		} else {
			System.out.println("Test data key was not passed");
		}
		TestBaseProvider.getTestBase().getContext().setProperty("testcaseid",
				testcaseid.trim());
		TestBaseProvider.getTestBase().setTestDataFromXml(testcaseid);

		if (getTestBase().getContext().getString("tdm.data").equalsIgnoreCase("on")
				&& testcaseid != null) {
			if (getTestBase().getTestData().containsKey("tdm.type")) {
				try {
					UserEntity profile =
							tdm.getUser(getTestBase().getTestData().getString("tdm.type"),
									getTestBase().getTestData()
											.getBoolean("tdm.isReserved"),
							getTestBase().getTestData()
									.getBoolean("tdm.isBcoeIdRequired"));
					System.out.println("AltTDMUserType="
							+ getTestBase().getTestData().getString("tdm.type"));
					TestBaseProvider.getTestBase().getContext()
							.setProperty("tdm.UserProfile", profile);

					System.out.println(
							"Alternate TDM ==> UserName:: " + profile.getEmail());
					System.out.println(
							"Alternate TDM ==> Password:: " + profile.getPassword());

					if (null != profile) {
						TestBaseProvider.getTestBase().getTestData().setProperty("userid",
								profile.getEmail());
						TestBaseProvider.getTestBase().getTestData()
								.setProperty("password", profile.getPassword());
						TestBaseProvider.getTestBase().getTestData()
								.setProperty("tdm.userid", profile.getEmail());
						TestBaseProvider.getTestBase().getTestData()
								.setProperty("tdm.password", profile.getPassword());
					}
				} catch (Exception ex) {
					System.out.println(
							"---As no Alternate TDM records found, it is going for test data xml file---");
				}
			} else {
				System.out.println(
						"---As no Alternate TDM tag is provided, it is going for test data xml file---");
			}
		} else {
			System.out.println(
					"---As tdm data is off, it is going for test data xml file---");
		}
	}

	@SuppressWarnings("unused")
	private void goForAlternateTDM() {
		if (getTestBase().getTestData().containsKey("tdm.type")) {
			try {
				UserEntity profile = tdm.getUser(
						getTestBase().getTestData().getString("tdm.type"),
						getTestBase().getTestData().getBoolean("tdm.isReserved"),
						getTestBase().getTestData().getBoolean("tdm.isBcoeIdRequired"));
				System.out.println("AltTDMUserType="
						+ getTestBase().getTestData().getString("tdm.type"));
				TestBaseProvider.getTestBase().getContext().setProperty("tdm.UserProfile",
						profile);

				System.out.println("Alternate TDM ==> UserName:: " + profile.getEmail());
				System.out
						.println("Alternate TDM ==> Password:: " + profile.getPassword());

				if (null != profile) {
					TestBaseProvider.getTestBase().getTestData().setProperty("userid",
							profile.getEmail());
					TestBaseProvider.getTestBase().getTestData().setProperty("password",
							profile.getPassword());
					TestBaseProvider.getTestBase().getTestData().setProperty("tdm.userid",
							profile.getEmail());
					TestBaseProvider.getTestBase().getTestData()
							.setProperty("tdm.password", profile.getPassword());
				}
			} catch (Exception ex) {
				System.out.println(
						"---As no Alternate TDM records found, it is going for test data xml file---");
			}
		} else {
			System.out.println(
					"---As no Alternate TDM tag is provided, it is going for test data xml file---");
		}
	}

}