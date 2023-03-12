package testclasses;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pageclass.Loginpage;

public class Logintest extends BaseTestClass {

public static Loginpage page1;

@BeforeClass
public void initalization () {
	page1 = new Loginpage (driver);
	
}


@Test
public void login () {
	
	page1.entercred();
}



}
