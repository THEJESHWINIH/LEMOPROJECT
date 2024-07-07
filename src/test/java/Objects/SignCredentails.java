package Objects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignCredentails {
	WebDriver driver;
	public SignCredentails(WebDriver driver) {
		this.driver=driver;
	}
	
	public void ClickonSigninlink() {
		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
	}
	
	public void EnterEmail(String email) {
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		
		
	}
	
	public void EnterPwd(String password) {
		driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")).sendKeys(password);
		
	}

	public void Login() throws IOException {
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".//ScreenShot\\fullage.png");
		FileUtils.copyFile(src,trg);
		
	}

	
	

public void SreachItem() {
	driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("shirt for women");
}

public void Sreach() {
	 driver.findElement(By.xpath("//button[@title='Search']")).click();
}

public void Itemlink() {
	 driver.findElement(By.xpath("//a[contains(text(),'Radiant Tee')]")).click();
}
public void ItemSize() {
	 driver.findElement(By.xpath("//div[@id='option-label-size-143-item-169']")).click();
}

public void ItemColour() {
	driver.findElement(By.xpath("//div[@id='option-label-color-93-item-56']")).click();
}

public void ItemQty() {
	driver.findElement(By.xpath("//div[@id='option-label-color-93-item-56']")).click();
	WebElement qtys= driver.findElement(By.xpath("//input[@id='qty']"));
    qtys.clear();
    
    qtys.sendKeys("1");
    qtys.click();
}

public void ItemAdd() {
	  driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
}
}

