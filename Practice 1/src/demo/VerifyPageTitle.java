package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chromedriver", "chromedriver.exe");

		driver.get("https://facebook.com");
		String actualTitle = driver.getTitle();
		String expectedValue = "Facebook - Log In or Sign Up";

	
		if (actualTitle.equals(expectedValue)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}

	}

}
