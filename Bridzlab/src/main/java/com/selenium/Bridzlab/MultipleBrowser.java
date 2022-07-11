package com.selenium.Bridzlab;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultipleBrowser {
	
	public static void main(String[] args) {
		 System.out.println("Welcome to Selenium different browser testing Program");
		 choice();
	}
	
	 public static void choice() {
	     @SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
	     System.out.println("Enter 1 For Chrome Browser");
	     System.out.println("Enter 2 For Microscoft Edge Browser");
	     System.out.println("Enter 3 For Firefox Browser ");
	     System.out.println("Enter 4 For Internet Explorer ");
	     System.out.println("Enter 5 for Exit");
	     System.out.println(" Please enter your choice");
		 int UsrIn;
	     UsrIn = scanner.nextInt();
	     while (UsrIn != 0) {
	     switch (UsrIn) {
	     case 1:
	    	 while (UsrIn != 2) {
	    		 try {
					automationTestChoromeDriver();
				} catch (InterruptedException | AWTException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	             System.out.println("Would you like to check other browser? 1: Yes, 2: No"); 
	             UsrIn = scanner.nextInt();
	       }
	     break;
	     case 2:
	    	 try {
				automationTestEdgeDriver();
			} catch (InterruptedException | AWTException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     break;
	     case 3:		
	    	 try {
				automationTestInternetExplorerDriver();
			} catch (InterruptedException | AWTException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     break;
	     default: System.out.println("no valid option");
	     break;
	     }
	}
	     System.out.println("Goodbye!");
	     }

	public static void automationTestChoromeDriver() throws InterruptedException, AWTException,IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get("https://www.facebook.com/");
		System.out.println(webdriver.getTitle());	
		Thread.sleep(2000);
		webdriver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("firstname")).sendKeys("Akshay");
		Thread.sleep(2000);

		webdriver.findElement(By.name("lastname")).sendKeys("Palande");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("reg_email__")).sendKeys("akshaypalande5@gmail.com");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("reg_email_confirmation__")).sendKeys("akshaypalande5@gmail.com");
		Thread.sleep(2000);
		
		
		webdriver.findElement(By.name("reg_passwd__")).sendKeys("Akshay1234");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_day")).sendKeys("06");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("birthday_month")).sendKeys("June");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("birthday_year")).sendKeys("1994");
		Thread.sleep(2000);
		
        webdriver.findElements(By.name("sex")).get(0).click();
        Thread.sleep(2000);
        
		webdriver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		
	    webdriver.close();
	}
	
	public static void automationTestEdgeDriver() throws InterruptedException, AWTException,IOException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\msedgedriver.exe");
		WebDriver webdriver = new EdgeDriver();
		webdriver.get("https://www.facebook.com/");
		System.out.println(webdriver.getTitle());	
		Thread.sleep(2000);
		webdriver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("firstname")).sendKeys("Akshay");
		Thread.sleep(2000);

		webdriver.findElement(By.name("lastname")).sendKeys("Palande");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("reg_email__")).sendKeys("akshaypalande5@gmail.com");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("reg_email_confirmation__")).sendKeys("akshaypalande5@gmail.com");
		Thread.sleep(2000);
		
		
		webdriver.findElement(By.name("reg_passwd__")).sendKeys("Akshay1234");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_day")).sendKeys("06");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("birthday_month")).sendKeys("June");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("birthday_year")).sendKeys("1994");
		Thread.sleep(2000);
		
        webdriver.findElements(By.name("sex")).get(0).click();
        Thread.sleep(2000);
        
		webdriver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		
	    webdriver.close();
	}
	
	public static void automationTestFireboxDriver() throws InterruptedException, AWTException,IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\geckodriver.exe");
		WebDriver webdriver = new EdgeDriver();
		webdriver.get("https://www.facebook.com/");
		System.out.println(webdriver.getTitle());	
		Thread.sleep(2000);
		webdriver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("firstname")).sendKeys("Akshay");
		Thread.sleep(2000);

		webdriver.findElement(By.name("lastname")).sendKeys("Palande");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("reg_email__")).sendKeys("akshaypalande5@gmail.com");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("reg_email_confirmation__")).sendKeys("akshaypalande5@gmail.com");
		Thread.sleep(2000);
		
		
		webdriver.findElement(By.name("reg_passwd__")).sendKeys("Akshay1234");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_day")).sendKeys("06");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("birthday_month")).sendKeys("June");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("birthday_year")).sendKeys("1994");
		Thread.sleep(2000);
		
        webdriver.findElements(By.name("sex")).get(0).click();
        Thread.sleep(2000);
        
		webdriver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		
	    webdriver.close();
	}
	
	public static void automationTestInternetExplorerDriver() throws InterruptedException, AWTException,IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Bridzlab\\Driver\\IEDriverServer.exe");
		WebDriver webdriver = new InternetExplorerDriver();
		webdriver.get("https://www.facebook.com/");
		System.out.println(webdriver.getTitle());	
		Thread.sleep(2000);
		webdriver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("firstname")).sendKeys("Akshay");
		Thread.sleep(2000);

		webdriver.findElement(By.name("lastname")).sendKeys("Palande");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("reg_email__")).sendKeys("akshaypalande5@gmail.com");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("reg_email_confirmation__")).sendKeys("akshaypalande5@gmail.com");
		Thread.sleep(2000);
		
		
		webdriver.findElement(By.name("reg_passwd__")).sendKeys("Akshay1234");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_day")).sendKeys("06");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("birthday_month")).sendKeys("June");
		Thread.sleep(2000);
		
		webdriver.findElement(By.name("birthday_year")).sendKeys("1994");
		Thread.sleep(2000);
		
        webdriver.findElements(By.name("sex")).get(0).click();
        Thread.sleep(2000);
        
		webdriver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		
	    webdriver.close();
	}

}