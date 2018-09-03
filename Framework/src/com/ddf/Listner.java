package com.ddf;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listner extends TestListenerAdapter {
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Testcase Pass");
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("Testcase Fail");
	}

}
