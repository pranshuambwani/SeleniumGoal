package assignment2;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		InternetExplorerDriver  driver = new InternetExplorerDriver();
		
		driver.get("http://www.google.com");
		System.out.println("Successfully opened the website");
}

}
