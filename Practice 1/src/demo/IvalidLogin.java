package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IvalidLogin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chromdriver", "chromedriver.exe");
		driver.manage().window().maximize();
		

		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		driver.findElement(By.id("email")).sendKeys("hsannidhi@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("abc123");
		
		driver.findElement(By.id("loginbutton")).click();

		String actualError = driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText();

		String expectedError = "The password you’ve entered is incorrect. Forgot Password?";
		
		System.out.println(actualError);
		
		System.out.println(expectedError);

		if (actualError.equals(expectedError)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}

	}

}