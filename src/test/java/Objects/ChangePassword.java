package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePassword {
	WebDriver driver;
	public ChangePassword(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Clickprofiledropdown() {
		driver.get("https://magento.softwaretestingboard.com/customer/account/");
		driver.findElement(By.xpath("//div[@class='panel header']//button[@type='button']")).click();
	}
	
	public void ClickonChangePasswordLink() {
		driver.findElement(By.xpath("//a[normalize-space()='Change Password']")).click();
	}
	
	
	public void ClickonCurrentPassword() {
		driver.findElement(By.xpath("//input[@id='current-password']")).sendKeys("asha@1234");
	}
	
	public void ClickonNewPassword() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("asha@1234");
	}
	
	public void ClickonNewConfirmPassword() {
		driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("asha@1234");
	}
	
	public void ClickonSave() {
		driver.findElement(By.xpath("//button[@title='Save']")).click();
	}
	
}
