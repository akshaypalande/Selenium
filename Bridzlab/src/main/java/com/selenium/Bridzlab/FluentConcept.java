package com.selenium.Bridzlab;


import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FluentConcept {

	public static void main(String[] args) {
		FluentConcept fluentDemo = new FluentConcept();
		try {
			fluentDemo.fluentTest();
		} catch (InterruptedException | AWTException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void fluentTest() throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get("https://www.facebook.com/");


		webdriver.close();
	}

}