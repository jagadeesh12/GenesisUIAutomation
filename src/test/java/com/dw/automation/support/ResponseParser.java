package com.dw.automation.support;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class ResponseParser {

	private UserProfile profile = null;

	public ResponseParser(String xml) {
		try {
			JAXBContext jc;
			jc = JAXBContext.newInstance("com.dw.automation.support");
			Unmarshaller unmarshaller = jc.createUnmarshaller();

			profile = (UserProfile) unmarshaller.unmarshal(createTempFile(xml));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public UserProfile getProfile() {
		return profile;
	}

	private File createTempFile(String content) {
		try {

			File temp = File.createTempFile("dwresponse", ".xml");

			BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
			bw.write(content);
			bw.close();

			return temp;

		} catch (IOException e) {

			e.printStackTrace();
			return null;

		}
	}
}
