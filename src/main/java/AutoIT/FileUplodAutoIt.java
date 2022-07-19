package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUplodAutoIt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freepdfconvert.com/");
		driver.findElement(By.xpath("//span[normalize-space()='Choose file']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			Runtime.getRuntime().exec("\"C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Autoit\\FileUploadDemo.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.close();
	}

}
