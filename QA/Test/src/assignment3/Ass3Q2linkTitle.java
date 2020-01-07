package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass3Q2linkTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumframework.com/Practiceform/");
		WebElement element = driver.findElement(By.linkText("This is a link"));

		String attValue = element.getAttribute("title");
		System.out.println(attValue);
	}

}
