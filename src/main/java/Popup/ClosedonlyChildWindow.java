package Popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosedonlyChildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Enter the url
		driver.get("https://www.naukri.com/");

		String parentID = driver.getWindowHandle();
		driver.findElement(By.linkText("Register for free")).click();
		Set<String> allWindowHnadlesSet = driver.getWindowHandles();
		for (String windowHandle : allWindowHnadlesSet) {
			driver.switchTo().window(windowHandle);
			if (!windowHandle.equals(parentID)) {
				driver.close();
			}
		}
	}
}