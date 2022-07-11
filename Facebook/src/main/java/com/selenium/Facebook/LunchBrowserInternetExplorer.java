package com.selenium.Facebook;

		
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.ie.InternetExplorerDriver;

		 
		public class LunchBrowserInternetExplorer {
		    public static void main(String[] args) throws InterruptedException{
		 
				System.setProperty("webdriver.ie.driver","C:\\Users\\HP\\eclipse-workspace\\Facebook\\Driver\\IEDriverServer.exe");   
		        WebDriver driver=new InternetExplorerDriver();  
		      	driver.get("https://facebook.com");
		        Thread.sleep(3000);
		        driver.quit();
		         System.out.println("Execution done"); 
		 
		    }
		}
		
