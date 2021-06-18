package pageClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPage {
	WebDriver driver;
	
	
	public  AccountSummaryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//li[#'pay_bills_tab']/a[@innertext='Pay Bills']")
	public WebElement payBillsTab;
	
	public String ActualTitle=driver.getTitle();
	public String ExpectedTitle="Zero - Account Summary";	
	

	
	public void ClickPayBillsTab() {
		payBillsTab.click();
	}
}
