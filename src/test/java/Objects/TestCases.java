package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCases {
	WebDriver driver;
	public  TestCases(WebDriver driver) {
		this.driver=driver;
	}
	
	public void ClickonCreateAccountlink() {
		driver.findElement(By.linkText("Create an Account")).click();
	}
	
	public void EnteronFirstName() {
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Asha");
	}
	
    public void EnteronLastName() {
    	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("H");
	}
	
    public void EnteronEmail() {
    	driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("admin@gmail.com");
	}
    
    public void EnteronPassword() {
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dhruv@2024");
   	}
    
    public void EnteronConfirmPassword() {
    	driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Teju@2024");

   	}
    
    public void ClickonCreateAccount() {
    	driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
   	}
    
    public void ClickonWhatsnew() {
    	driver.findElement(By.linkText("What's New")).click();
   	}
    
    public void ClickonHoodiesandSweatshirts(){
    	driver.findElement(By.linkText("Hoodies & Sweatshirts")).click();
    }
   
    
    public void ClickonStyle() {
    	driver.findElement(By.xpath("//div[normalize-space()='Style']")).click();
    }
    
    public void ClickonSweatshirt() {
    	driver.findElement(By.partialLinkText("Sweatshi")).click();
    }
    
    public void ClickonImage() {
    	driver.findElement(By.cssSelector(".product-image-photo")).click();
    }
    
   /* public void ClickonProductlink() {
    	driver.findElement(By.xpath("//a[normalize-space()='Eos V-Neck Hoodie']")).click();
    }*/
    
    public void ClickonSize() {
		// TODO Auto-generated method stub
		driver.findElement(By.cssSelector("div#option-label-size-143-item-168")).sendKeys("M");
	}

    public void ClickonColour() {
    	driver.findElement(By.xpath("//div[@id='option-label-color-93-item-57']")).click();
    }
    
    public void EnterQty() {
    	WebElement qtys=driver.findElement(By.className("input-text qty"));
    	qtys.clear();
    	qtys.sendKeys("2");
    }
    
    public void ClickonAddtoCart() {
    	driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
    }
    
    public void Clickondropdown() {
    	driver.findElement(By.xpath("//div[@class='panel header']//button[@type='button']")).click();
    }
    
    public void SignoutProfile() {
    	driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
    }
}

	

	
	
	
	
	
    




