package pageClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBills {
	
	
	WebDriver driver;
	
	public  PayBills(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Locate web element
	
	@FindBy(xpath="//a[@innertext='Add New Payee']")
	public WebElement addNewPayeeBtn;
	
	@FindBy(xpath="//input[#'np_new_payee_name']")
	public WebElement payeeNameTextField;
	
	@FindBy(xpath="//textarea[#'np_new_payee_address']")
	public WebElement payeeAddressTextField;
	
	@FindBy(xpath="//input[#'np_new_payee_account']")
	public WebElement payeeAccountTextField;
	
	@FindBy(xpath="//input[#'np_new_payee_details']")
	public WebElement payeeDetailsTextField;
	
	@FindBy(xpath="//input[#'add_new_payee']")
	public WebElement addBtn;
	
	
	public void ClickAddNewPayeeBtn() {
		addNewPayeeBtn.click();
	}
	
	public void inputPayeeInfo(String name, String address, String accountno, String details) {
		payeeNameTextField.sendKeys(name);
		payeeAddressTextField.sendKeys(address);
		payeeAccountTextField.sendKeys(accountno);
		payeeDetailsTextField.sendKeys(details);
	}
	
	
	public void ClickAddBtn() {
		addBtn.click();
	}
	
}