package com.selenium.Bridzlab;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPopupChild {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Enter the url
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register for free")).click();
		Set<String> allWindowHnadles = driver.getWindowHandles();
		int count = allWindowHnadles.size();
		System.out.println("Number of browser windows opened on the system is : " + count);
		for (String windowHandle : allWindowHnadles) {
			driver.switchTo().window(windowHandle);
			String tittle = driver.getTitle();
			System.out.println("Window tittle: " + tittle);
			System.out.println("Window Id: " + windowHandle);
		}
		driver.quit();
	}
}