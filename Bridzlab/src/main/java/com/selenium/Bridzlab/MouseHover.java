package com.selenium.Bridzlab;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		Actions action = new Actions(driver);
//movetoElement - used for mouse hover
//Mouse hover on “AREAS OF EXPERTISE” menu
		WebElement AreaOfExpertise = driver.findElement(By.xpath("//a[contains(text(),'AREAS OF EXPERTISE')]"));
		action.moveToElement(AreaOfExpertise).perform();
//Click on “AREAS OF EXPERTISE” menu
		WebElement cloudApp = driver.findElement(By.linkText("Cloud Applications"));
		action.moveToElement(cloudApp).click().perform();
//composite multiple actions can be achieved using the below statement
		driver.close();
	}
}