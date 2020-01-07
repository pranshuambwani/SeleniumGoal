package assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Ass4Q1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Q1
		driver.get("http://www.seleniumframework.com/Practiceform/");
		int boxes = driver.findElements(By.xpath("//input[@type='text']"))
				.size();
		System.out.println(boxes);
		
		//Q2
		String color = driver.findElement(By.xpath("//button[@id='colorVar']")).getCssValue("color");
		System.out.println(color);
		String hex = Color.fromString(color).asHex();
		System.out.println(hex);

		// Q3
		int buttons = driver.findElements(By.xpath("//button")).size();
		System.out.println(buttons);

		// Q4
		ArrayList<WebElement> button = (ArrayList<WebElement>) driver
				.findElements(By.xpath("//button"));
		for (int loop = 0; loop < buttons; loop++) {
			System.out.println(button.get(loop).getText());
		}
		System.out.println(button.get(5).getText());
		System.out.println(button.get(11).getText());

		// Q5
		// 5.1
		ArrayList<WebElement> links = (ArrayList<WebElement>) driver
				.findElements(By.xpath("//a"));

		System.out.println(links.size());

		// 5.2
		for (int loop = 0; loop < links.size(); loop++) {
			if (links.get(loop).getText().compareTo("Setup First Project") == 0) {
				System.out.println("Index = " + loop);
			}
		}

		// 5.3

	}
}
