package assignment5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass5Q2 {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("Pranshu");
		driver.findElement(By.id("lastname")).sendKeys("Ambwani");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("datepicker")).sendKeys("07/01/2020");
		driver.findElement(By.id("profession-1")).click();
		Thread.sleep(100);
		driver.findElement(By.id("tool-2")).click();
		Select Select1 = new Select(driver.findElement(By.id("continents")));
		Select1.selectByValue("SA");
		Select Select2 = new Select(driver.findElement(By.id("selenium_commands")));
		Select2.selectByVisibleText("Switch Commands");
		driver.findElement(By.id("submit")).submit();
	}

}
