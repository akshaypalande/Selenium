package Popup;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HiddenDivisonforFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		Date d = new Date(0);
		String str = d.toString();
		String[] str2 = str.split(" ");
		String today = str2[2];
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("geo.enabled", false);
		cap.setCapability(FirefoxDriver.PROFILE, profile);
		WebDriver driver = new FirefoxDriver(cap);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("24")).click();
	}

}
