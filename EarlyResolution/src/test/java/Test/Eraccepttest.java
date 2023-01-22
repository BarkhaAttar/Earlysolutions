package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Eracceptpage;

public class Eraccepttest {
	
	WebDriver driver;

	@BeforeMethod
	public void browseron() {
	driver=Browser.openBrowser();
		
	}
	@Test
	
	public void clickonaccept() {
		Eracceptpage eracceptpage=new Eracceptpage(driver);
		eracceptpage.clickonaccept(driver);
	}
	
	
	
	
	

}
