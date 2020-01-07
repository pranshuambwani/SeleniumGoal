package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass3Q4FilllForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.name("name")).sendKeys("Pranshu Ambwani");
		driver.findElement(By.className("validate[required,custom[email]]")).sendKeys("pranshu.ambwani@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("7597783518");
		driver.findElement(By.xpath("//input[@name='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Metacube");
		driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("hello hello!!");
		driver.findElement(By.partialLinkText("Submit")).submit();

	}
}
