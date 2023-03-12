package pageclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
    WebDriver driver;
   
	@FindBy (xpath="//span[text()='Edit your address']")
	WebElement AdressButton;
	@FindBy (xpath="//*[text()='New Address']")
	WebElement newAddress ;
	@FindBy (xpath="//*[@id='input-firstname']")
	WebElement Firstname;
	@FindBy (xpath="//*[@id='input-lastname']")
	WebElement Lastname;
	@FindBy (xpath="//*[@id='input-address-1']")
	WebElement Addressone;
	@FindBy (xpath="//*[@id='input-address-2']")
	WebElement Addresstwo;
	@FindBy (xpath="//*[@id='input-city']")
	WebElement city;
	@FindBy (xpath="//*[@id='input-postcode']")
	WebElement postalcode;
	@FindBy (xpath="//select[@id='input-zone']")
	WebElement selectarea;
	@FindBy (xpath="//input[@value='1']")
	List <WebElement> DefaultAddressRadio;
	@FindBy (xpath="//input[@value='Continue']")
	WebElement contineuButton;
	@FindBy (xpath="//img[@class='img-responsive']")
	WebElement HomepageButton;
	

	
public Homepage(WebDriver driver) {
	
		PageFactory.initElements(driver,this);
}
	
	public void addAddress() {
		
		AdressButton.click();
		newAddress.click();
		Firstname.sendKeys("Suraj");
		Lastname.sendKeys("Thete");
		Addressone.sendKeys("Shivajinagar");
		Addresstwo.sendKeys("Pune");
		city.sendKeys("Pune");
		postalcode.sendKeys("410501");
		Select dropdown  = new Select (selectarea);
		dropdown.getOptions().get(18).click();
		DefaultAddressRadio.get(0).click();
		contineuButton.click();
		HomepageButton.click();

	}
}

