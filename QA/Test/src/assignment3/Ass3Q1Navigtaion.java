package assignment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass3Q1Navigtaion {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		 // Open ToolsQA web site
		 String appUrl = "http://www.seleniumframework.com/Practiceform/";
		 driver.get(appUrl);
		 
		 // Go back to Home Page
		 driver.navigate().back();
		 
		 // Go forward to Registration page
		 driver.navigate().forward();
		 
		 // Go back to Home page
		 driver.navigate().to(appUrl);
		 
		 // Refresh browser
		 driver.navigate().refresh();
		 
		 // Close browser
		 driver.close();
		 }

}
