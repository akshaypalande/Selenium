package com.selenium.Bridzlab;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get("D:\\Bridgelabz\\Akshay\\Textbox.html");

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webdriver;
		javascriptExecutor.executeScript("document.getElementById('t1').value='abcd'");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// clear the value in second textbox using javascript
		javascriptExecutor.executeScript("document.getElementById('t2').value=''");
		// enter "manager" in second textbox using javascript
		javascriptExecutor.executeScript("document.getElementById('t2').value='manager'");
		// change the second text box to button type using Javascript
		javascriptExecutor.executeScript("document.getElementById('t2').type='button'");

		webdriver.close();
	}

}