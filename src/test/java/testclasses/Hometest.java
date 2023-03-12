package testclasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageclass.Homepage;
import pageclass.Loginpage;



public class Hometest extends BaseTestClass  {
	
	Loginpage loginpage;
	Homepage homepage;
	
	public void initobjects(WebDriver driver) {
		loginpage=new Loginpage(driver);
		homepage=new Homepage(driver);
	}
	
	@BeforeClass
	public void launch() {
	
		initobjects(driver);
	}
	@Test
	public void addToCartTest() {
		homepage.addAddress();
		
		
	}
	
	
	

}
