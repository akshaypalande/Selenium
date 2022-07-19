package com.selenium.Bridzlab;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToSpecificElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get("https://www.amazon.in/");
		// click on the close icon of the yellow color background pop up
		webdriver.findElement(By.id("pass")).click();
		// find the Applitools element on the webpage
		WebElement ele = webdriver.findElement(By.xpath("//input[@id='pass']"));
		// get the X-coordinate and store in a variable
		int x = ele.getLocation().getX();

		// get the Y-coordinate and store in a variable
		int y = ele.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		// Scroll to Applitools element’s x and y coordinate
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");
		
		System.out.println("done");
		Thread.sleep(3000);
		webdriver.close();

	}
}