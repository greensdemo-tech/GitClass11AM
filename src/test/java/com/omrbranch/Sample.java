package com.omrbranch;

import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	
	
	public void tc1() {

		System.out.println("tc1");
	}
	
	private void tc2() {
		System.out.println("tc2");

	}
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Ctrl+2, L
		
		WebElement txtUser = driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
		txtUser.sendKeys("greens@gmail.com");
		
		WebElement txtpass = driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
		txtpass .sendKeys("Greens@123");
		
		WebElement btnLogin = driver.findElement(By.xpath("//span[text()='Log in']"));
		btnLogin.click();
		
		Thread.sleep(1000);
		
			
		driver.quit();
	}

}
