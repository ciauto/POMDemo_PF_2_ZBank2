package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageClasses.AccountSummaryPage;
import pageClasses.HomePage;
import pageClasses.LoginPage;

public class TestCase001_verifyLogin {
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	AccountSummaryPage asp;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		hp=new HomePage(driver);
		lp=new LoginPage(driver);
		asp=new AccountSummaryPage(driver);
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}	
	
	@Test
	public void verifyLogin() {
		
		hp.ClickSignIn();
		lp.doLogin("username", "password2");
		Assert.assertEquals(asp.ActualTitle, asp.ExpectedTitle);
		

		
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
