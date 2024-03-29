package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageClasses.AccountSummaryPage;
import pageClasses.HomePage;
import pageClasses.LoginPage;
import pageClasses.PayBills;


public class TestCase002_verifyAddPayee {

	WebDriver driver;
	HomePage hp;	
	LoginPage lp;
	AccountSummaryPage asp;
	PayBills pb;

	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		hp=new HomePage(driver);
		lp=new LoginPage(driver);
		pb=new PayBills(driver);
		asp=new AccountSummaryPage(driver);
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	@Test
	public void verifyAddPayee() {
		
		hp.ClickSignIn();	
		lp.doLogin("username", "password");
		asp.ClickPayBillsTab();
		pb.inputPayeeInfo("CIBC", "2223 Lake Street", "23232323", "fgifogfigd");
		pb.ClickAddBtn();
		
		
		
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
