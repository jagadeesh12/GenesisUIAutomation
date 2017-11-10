package com.scholastic.cucumber.uploadResults;
/*************************************
 * @author Rashid
 *
 ************************************/
public class DashBoardModel {
	static String week;
	static int tcTotal;
	static int tcPassed;
	static int tcFailed;
	static int tcSkipped;
	
	public static String getWeek() {
		return week;
	}
	public static void setWeek(String week) {
		DashBoardModel.week = week;
	}
	public static int getTcTotal() {
		return tcTotal;
	}
	public static void setTcTotal(int tcTotal) {
		DashBoardModel.tcTotal = tcTotal;
	}
	public static int getTcPassed() {
		return tcPassed;
	}
	public static void setTcPassed(int tcPassed) {
		DashBoardModel.tcPassed = tcPassed;
	}
	public static int getTcFailed() {
		return tcFailed;
	}
	public static void setTcFailed(int tcFailed) {
		DashBoardModel.tcFailed = tcFailed;
	}
	public static int getTcSkipped() {
		return tcSkipped;
	}
	public static void setTcSkipped(int tcSkipped) {
		DashBoardModel.tcSkipped = tcSkipped;
	}
	
	
}
