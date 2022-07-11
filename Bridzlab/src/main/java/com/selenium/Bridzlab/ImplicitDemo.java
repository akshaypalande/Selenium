package com.selenium.Bridzlab;


import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitDemo {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ImplicitDemo implicitDemo = new ImplicitDemo();
		try {
			ImplicitDemo.implicitTest();
		} catch (InterruptedException | AWTException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void implicitTest() throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();

		webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webdriver.get("https://www.facebook.com/");
		System.out.println(webdriver.getTitle());

		webdriver.findElement(By.partialLinkText("Create New")).click();

		webdriver.findElement(By.name("firstname")).sendKeys("Akshay");

		webdriver.findElement(By.name("lastname")).sendKeys("Palande");

		webdriver.findElement(By.name("reg_email__")).sendKeys("akshaypalande5@gmail.com");

		webdriver.findElement(By.name("reg_email_confirmation__")).sendKeys("akshaypalande5@gmail.com");

		webdriver.findElement(By.name("reg_passwd__")).sendKeys("Akshay234");

		webdriver.findElement(By.name("birthday_day")).sendKeys("06");

		webdriver.findElement(By.name("birthday_month")).sendKeys("June");

		webdriver.findElement(By.name("birthday_year")).sendKeys("1994");

		webdriver.findElements(By.name("sex")).get(0).click();

		webdriver.findElement(By.name("websubmit")).click();

		webdriver.close();
	}

}