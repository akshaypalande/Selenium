package com.selenium.Bridzlab;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownMenu {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tigerdirect.com/");
//find the menu "About Company"
		String xp = "//span[.='About Company']";
		WebElement menu = driver.findElement(By.xpath(xp));
//mouse hover on "About Company" menu
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
//click on submenu "Basic Facts"
		WebElement submenu = driver.findElement(By.linkText("Basic Facts"));
		submenu.click();
	}
}