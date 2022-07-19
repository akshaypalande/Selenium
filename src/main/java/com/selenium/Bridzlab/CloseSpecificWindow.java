package com.selenium.Bridzlab;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Enter the url
		driver.get("https://www.naukri.com/");

		String parentID = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("Register")).click();

		String tittle = driver.getTitle();
		System.out.println("Window tittle: " + tittle);
		String expected_title = "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : " + count);
		for (String windowHandle : allWindowHandles) {
			// switch to each browser window
			driver.switchTo().window(windowHandle);
			String actual_title = driver.getTitle();
			// Checks whether the actual title contains the specified expected title
			if (actual_title.contains(expected_title)) {
				driver.close();
				System.out.println("Specified Browser window with title -->" + actual_title + " --> is closed");
			}
		}
	}
}