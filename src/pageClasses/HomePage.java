package pageClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	//Locate web elements
	@FindBy(id="signin_button")
	public WebElement signInBtn;
	
	public  HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void ClickSignIn() {
		signInBtn.click();
	}
}