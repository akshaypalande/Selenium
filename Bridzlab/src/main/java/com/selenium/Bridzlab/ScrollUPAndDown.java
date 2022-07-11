package com.selenium.Bridzlab;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUPAndDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get("http://seleniumhq.org/download");
		// typecasting driver object to JavascriptExecutor interface type
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		for (int i = 1; i < 10; i++) {
			// scroll down on the webpage
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(3000);
		}
		for (int i = 1; i < 10; i++) {
			// scroll up on the webpage
			js.executeScript("window.scrollBy(0, -1000)");
			Thread.sleep(3000);
		}
		webdriver.close();
	}
}