package com.omrbranch.Uitility;

import org.openqa.selenium.WebElement;

public class SampleClass extends BaseClass {
	public static void main(String[] args) {
		//With Object creation 
		
//		BaseClass b=new BaseClass();
//		b.browserLaunch();
//		b.windowMaximize();
//		b.enterUrl("");
//		
//		WebElement txtUser = b.findElementById("");
//		b.sendKeys(txtUser, "");
//		
//		b.elementClick(txtUser);
//		b.browserQuit();
		
		
		//Without object creation 
		browserLaunch();
		windowMaximize();
		enterUrl("https://www.facebook.com/");
		
		WebElement txtUser = findElementById("_R_1h6kqsqppb6amH1_");
		sendKeys(txtUser, "greens@gmail.com");
		
		WebElement txtPass = findElementById("_R_1hmkqsqppb6amH1_");
		sendKeys(txtPass, "Greens@123");
		
		WebElement btnLogin = findElementByXPath("//span[text()='Log in']");
		elementClick(btnLogin);
		
		browserQuit();
	}

}
