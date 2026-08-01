package com.omrbranch.Uitility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	
	public static void browserLaunch() {
		driver=new ChromeDriver();
	}
	
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	
	public static void enterUrl(String url) {
		driver.get(url);  
	}
	
	public static WebElement findElementByName(String attValue) {
		WebElement element = driver.findElement(By.name(attValue)); 
		return element;
	}
	
	public static WebElement findElementById(String attValue) {
		WebElement element = driver.findElement(By.id(attValue)); 
		return element;
	}
	
	public static WebElement findElementByXPath(String attValue) {
		WebElement element = driver.findElement(By.xpath(attValue)); 
		return element;
	}
	
	public static void sendKeys(WebElement element, String data) {
		element.sendKeys(data); 
	}
	
	public static void elementClick(WebElement element) {
		element.click();
	}
	public static void browserQuit() {
		driver.quit();
}
}
