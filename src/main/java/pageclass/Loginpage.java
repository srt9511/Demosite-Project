package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	
	@FindBy (xpath="//a[@class='dropdown-toggle']")
	WebElement Myaccount;
	
	@FindBy (xpath="//i[@class='fa fa-lock']")
	WebElement LoginButton;
	
	@FindBy (xpath="//input[@id='input-email']")
	WebElement Userid;
	
	@FindBy (xpath="//input[@id='input-password']")
	WebElement Password;
	
	@FindBy (xpath="//input[@class='btn btn-primary']")
	WebElement SubmitButton;
	
	public Loginpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	public void entercred () {
		Myaccount.click();
		LoginButton.click();
		Userid.sendKeys("suraj.thete44@gmail.com");
		Password.sendKeys("Suraj@1234");
		SubmitButton.click();
		
	}

}
