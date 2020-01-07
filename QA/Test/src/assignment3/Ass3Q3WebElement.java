package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass3Q3WebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.name("email")).sendKeys(
				"pranshu.ambwani@gmail.com");
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
	}

}
