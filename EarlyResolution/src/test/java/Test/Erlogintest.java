package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM.Eracceptpage;
import POM.Erlogin;

public class Erlogintest {
	 WebDriver driver;
	 
	 
	 @Test
	 public void Browser() {
		 driver=POJO.Browser.openBrowser();
	 }
	 
	 
	 
	 @Test
	 public void Loginwithcredentials() 
	 {
		 Eracceptpage eracceptpage=new Eracceptpage(driver);
		 eracceptpage.clickonaccept(driver);
		 Erlogin erlogin=new Erlogin(driver);
		 erlogin.EnteruserID("cscbarkha",driver);
		 erlogin.Enterpass("Chava*4999+2022",driver);
		 erlogin.Clickonlogin();
	 }

}
