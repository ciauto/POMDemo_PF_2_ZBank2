package pageClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPage {
	WebDriver driver;
	
	
	public  AccountSummaryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void doLogin(String myusername, String mypassword) {

		
	}
}
