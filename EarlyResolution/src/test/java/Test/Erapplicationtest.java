package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Eracceptpage;
import POM.Erapplication;
import POM.Erlogin;

public class Erapplicationtest {
	WebDriver driver;
	
	
	@BeforeMethod
	public void browseon() {
		driver=Browser.openBrowser();
	}
	
	@Test
	public void clickonapplication() {
		 Eracceptpage eracceptpage=new Eracceptpage(driver);
		 eracceptpage.clickonaccept(driver);
		 Erlogin erlogin=new Erlogin(driver);
		 erlogin.EnteruserID("cscbarkha",driver);
		 erlogin.Enterpass("Chava*4999+2022",driver);
		 erlogin.Clickonlogin();
		 Erapplication erapplication=new Erapplication(driver);
		 erapplication.clickonapplication();
		 erapplication.clickoncollection(driver);
//		 erapplication.enteraccountnumber();
		 erapplication.clickonradio();
		 erapplication.selectphonetype(driver);
		 erapplication.clickoncontinue();
		 
		
	}

}
