package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By phone_number = By.xpath("//input[@inputmode='tel']");
	By I_agree_checkbox = By.xpath("//input[@type='checkbox']");
	By Verify_OTP = By.xpath("//button[@type='button']");
	
	
	public void enter_phone()
	{
		driver.findElement(phone_number).sendKeys("8792201027");
	}
	
	public void I_agree_checkbox()
	{
		driver.findElement(I_agree_checkbox).click();
	}
	
	public void Verify_OTP()
	{
		driver.findElement(Verify_OTP).click();
	}
}
