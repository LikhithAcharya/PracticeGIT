package testCases;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.loginPage;

public class loginToApplication {

	@Test
	public void Login() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\shopSeCheckout\\src\\test\\java\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://qa.shop-se.in/cv3/#/qr/41467");
		Thread.sleep(5000);
		loginPage login = new loginPage(driver);
		
		login.enter_phone();
		login.I_agree_checkbox();
		login.Verify_OTP();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\homepage.png");
		FileUtils.copyFile(src, trg);
		
		driver.quit();
	}
}
