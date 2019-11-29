package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyXPath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		
		driver.get("https://www.orbitz.com/");
		
		
	}

}
