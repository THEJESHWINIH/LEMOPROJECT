package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProducttoCart {
	WebDriver driver;
	public AddProducttoCart(WebDriver driver) {
		this.driver=driver;
	}
	
	public void ProductNameLink () {
		driver.findElement(By.className("product-item-link")).click();
	}
	
	public void AddtoCartProduct () {
		driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
	}
	
	

}
