package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//Enter the url
		driver.get("https://demoqa.com/alerts");
//find this button : "Say my name"
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
//Switch to alert pop up
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
//print the text present on the alert pop up

		alert.accept();
		Thread.sleep(2000);
		driver.close();

	}
}
