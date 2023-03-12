package testclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {
	
	public static WebDriver driver;
	
	
	@BeforeSuite
public void initializations () {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver ();
	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	driver.get("https://www.ecomdeveloper.com/demo/index.php?route=common/home");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

}
