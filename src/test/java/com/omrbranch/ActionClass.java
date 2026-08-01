package com.omrbranch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		//ClassName objName= new ClassName(refName);
		Actions a=new Actions(driver);
	/*	
		WebElement move = driver.findElement(By.xpath("//a[text()='Courses '] "));
		a.moveToElement(move).perform();
		move.click();
		
		WebElement bigData = driver.findElement(By.xpath("//a[text()='Bigdata Training']"));
		a.moveToElement(bigData).perform();
		String text = bigData.getText();
		System.out.println(text);
		bigData.click();
		
		//Drag and drop
		WebElement src = driver.findElement(By.xpath("//a[text()=' String ']"));
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(src, target).perform();
		
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' List ']"));
		WebElement target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(src1, target1).perform();
		*/
		
		
		
		//Double Click
		WebElement doubleClick = driver.findElement(By.id("doubleBtn"));
		a.doubleClick(doubleClick).perform();
		
		//Right Click
		
		WebElement rightClick = driver.findElement(By.id("rightBtn"));
		a.contextClick(rightClick).perform();

		
		
	}

}
