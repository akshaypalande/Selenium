package com.selenium.Bridzlab;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException , InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get("https://www.facebook.com/");
		WebElement unTB = webdriver.findElement(By.id("email"));
		
		Robot robot = new Robot();
		// Mouse move
		robot.mouseMove(1000, 200);
		Thread.sleep(2000);
		robot.mouseWheel(1);
		Thread.sleep(2000);
        robot.mouseWheel(-1);
		Thread.sleep(2000);

		// Keyboard
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		
		webdriver.close();
	}

}