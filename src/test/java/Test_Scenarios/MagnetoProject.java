package Test_Scenarios;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Objects.AddProducttoCart;
import Objects.ChangePassword;
import Objects.SignCredentails;
import Objects.TestCases;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MagnetoProject {
	WebDriver driver;
	TestCases openaccount;
	SignCredentails Login;
	AddProducttoCart c1;
	ChangePassword password;
	
	@BeforeTest
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://magento.softwaretestingboard.com/");
		String title=driver.getTitle();
		System.out.println("the title is " +title);
	}
	
	@Test(priority=1)
	public void Account() {
		openaccount=new TestCases(driver);
		openaccount.ClickonCreateAccountlink();;
	}
	
	@Test(priority=2)
	public void AccountDetails() {
		openaccount=new TestCases(driver);
		openaccount.EnteronFirstName();
		openaccount.EnteronLastName();
		openaccount.EnteronEmail();
		openaccount.EnteronPassword();
	    openaccount.EnteronConfirmPassword();
	    openaccount.ClickonCreateAccount();
	}
	
	@Test (priority=3)
	public void Whatsnew() {
		openaccount=new TestCases(driver);
		openaccount.ClickonWhatsnew();
	}
	
	@Test(priority=4)
	public void HoodiesandSweatshirts() {
		openaccount=new TestCases(driver);
		openaccount.ClickonHoodiesandSweatshirts();
	}
	
	@Test(priority=5)
	public void Style() {
		openaccount=new TestCases(driver);
		openaccount.ClickonStyle();
	}
	
	@Test(priority=6)
	public void Sweatshirt() {
		openaccount=new TestCases(driver);
		openaccount.ClickonSweatshirt();
	}
	
	@Test(priority=7)
	public void Image() {
		openaccount=new TestCases(driver);
		openaccount.ClickonImage();
	}
	
	/*@Test(priority=8)
	public void ClickonImagelink() {
		openaccount=new TestCases(driver);
		openaccount.ClickonProductlink();
	}*/
	
	
	@Test(priority=9)
	public void Size() {
		openaccount=new TestCases(driver);
		openaccount.ClickonSize();
	}
	
	@Test(priority=10)
	public void Colour() {
		openaccount=new TestCases(driver);
		openaccount.ClickonColour();
	}
	
	@Test(priority=11)
	public void EnterQty() {
		openaccount=new TestCases(driver);
		openaccount.EnterQty();
	}
	
	@Test(priority=12)
	public void AddtoCart() {
		openaccount=new TestCases(driver);
		openaccount.ClickonAddtoCart();
	}

	@Test ( priority=14)
	public void Sign() throws IOException {
		Login=new SignCredentails(driver);
		Login.ClickonSigninlink();
		Login.EnterEmail("tas@gmail.com");
		Login.EnterPwd("Teju@2024");
		Login.Login();
	}
	
	
	@Test(priority=15)
	public void Search() {
		Login=new SignCredentails(driver);
		Login.SreachItem();
	}
	
	@Test(priority=16)
	public void SearchIcon() {
		Login=new SignCredentails(driver);
		Login.Sreach();
	}
	
	@Test(priority=17)
	public void ItemProductLink() {
		Login=new SignCredentails(driver);
		Login.Itemlink();
	}

	@Test(priority=18)
	public void ItemProductSize() {
		Login=new SignCredentails(driver);
		Login.ItemSize();
	}
	
	@Test(priority=19)
	public void ItemProductColour() {
		Login=new SignCredentails(driver);
		Login.ItemColour();
	}
	@Test(priority=20)
	public void ItemProductQty() {
		Login=new SignCredentails(driver);
		Login.ItemQty();
	}
	@Test(priority=21)
	public void ItemProductAdd() {
		Login=new SignCredentails(driver);
		Login.ItemAdd();
	}
	@Test(priority=22)
	public void ProductLinkAdd() {
		c1=new AddProducttoCart(driver);
		c1.ProductNameLink();
		System.out.println();
	}
	
	

	@Test(priority=23)
	public void ProductAddtoCart() {
		c1=new AddProducttoCart(driver);
		c1.AddtoCartProduct();
	}
	
	@Test(priority=24)
	public void ProfileDropdown() {
		password=new ChangePassword(driver);
		password.Clickprofiledropdown();
	}
	
	@Test(priority=25)
	public void ChangePasswordlink(){
		password=new ChangePassword(driver);
		password.ClickonChangePasswordLink();;	
	}
	
	@Test(priority=26)
	public void CurrentPassword(){
		password=new ChangePassword(driver);
		password.ClickonCurrentPassword();	
	}
	
	@Test(priority=27)
	public void NewPassword(){
		password=new ChangePassword(driver);
		password.ClickonNewPassword();	
	}
	
	@Test(priority=28)
	public void NewConfirmPassword(){
		password=new ChangePassword(driver);
	    password.ClickonNewConfirmPassword();	
	}
	
	@Test(priority=29)
	public void Save(){
		password=new ChangePassword(driver);
	    password.ClickonSave();	
	}
	
	
	
	
	
	
	@Test(priority=4)
	public void OutProfile() {
		openaccount=new TestCases(driver);
		openaccount.SignoutProfile();
	}
	
	@AfterTest
	public void ClosetheBrowser() {
		driver.close();
	}

}
