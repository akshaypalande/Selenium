package com.selenium.Facebook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.IOException;

public class ScreenshotFirefox {
    public static void main(String[] args) {
        //set the location of chrome browser
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\eclipse-workspace\\Facebook\\Driver\\geckodriver.exe");
        
        // Initialize browser
        WebDriver driver = new FirefoxDriver();
        
        //navigate to url
        driver.get("https://google.com");
        
       //Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\HP\\eclipse-workspace\\Facebook\\Screenshots\\homePageScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        //closing the webdriver
        driver.close();
    }
}