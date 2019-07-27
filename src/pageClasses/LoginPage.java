package pageClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	//Locate web elements
	@FindBy(id="user_login")
	public WebElement usernametextfield;
	
	@FindBy(id="user_password")
	public WebElement passwordtextfield;
	
	
	@FindBy(name="submit")
	public WebElement signIn;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void doLogin(String xusername, String ypassword) {
		usernametextfield.sendKeys(xusername);
		passwordtextfield.sendKeys(ypassword);
		signIn.click();
	}
}
