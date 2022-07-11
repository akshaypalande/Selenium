package com.selenium.Facebook;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//id demo
public class FacebookLogin {

 public static void main(String[] args) {
  
  WebDriver driver;
  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Facebook\\Driver\\chromedriver.exe");
  System.setProperty("webdriver.chrome.silentOutput", "true");
  
  // Initialize browser
 driver = new ChromeDriver();
  
  //navigate to url
  driver.get("https://facebook.com");
  
  
  //maximizing the URL
  driver.manage().window().maximize();
  
  //finding email element by "id" locator and entering email
  driver.findElement(By.id("email")).sendKeys("akshaypalande5@gmail.com");
  
  //finding pass element by "id" locator and entering password
  driver.findElement(By.id("pass")).sendKeys("Akshay1234");
  
File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  
  //Copy the file to a location and use try catch block to handle exception
  try {
      FileUtils.copyFile(screenshot, new File("C:\\Users\\HP\\eclipse-workspace\\Facebook\\Screenshots\\homePageScreenshot - Login.png"));
  } catch (IOException e) {
      System.out.println(e.getMessage());
  }
  
  //closing the webdriver
  driver.close();
  
  
  //finding "Login" element by "id" locator and performing click action
  driver.findElement(By.id("u_0_b")).click();
  
  //driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
  
  //driver.quit();
  
  
 }
}