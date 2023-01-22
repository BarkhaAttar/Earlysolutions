package Test;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Eracceptpage;
import POM.Erapplication;
import POM.Erborrowercontact;
import POM.Erborrowerinterview;
import POM.Ercontactscreen;
import POM.Erdifferantaccount;
import POM.Erimageupload;
import POM.Erlogin;
import Utility.Parametrerization;

public class TestAllScenario {
WebDriver driver;
	
	
	@BeforeMethod
	public void browseon() {
		driver=Browser.openBrowser();
	}
	
	
	@Test
	public void clickonapplication() throws InterruptedException, AWTException, EncryptedDocumentException, IOException{
		 Eracceptpage eracceptpage=new Eracceptpage(driver);
		 eracceptpage.clickonaccept(driver);
	}
		 	 	
	@Test
	public void scenario3() throws EncryptedDocumentException, IOException
	{
		Eracceptpage eracceptpage=new Eracceptpage(driver);
	     eracceptpage.clickonaccept(driver);	 
		 Erlogin erlogin=new Erlogin(driver);
//		 erlogin.EnteruserID("cscbarkha",driver);
		 String username=Parametrerization.getData(0, 1);
		 erlogin.EnteruserID(username, driver);
		 String password=Parametrerization.getData(1, 1);
		 erlogin.Enterpass(password, driver);	 
//		 erlogin.Enterpass("Chava*4999+2022",driver);
		 erlogin.Clickonlogin();
		 }
		 
		 
		 @Test
		 public void scenario4and5() throws EncryptedDocumentException, IOException {
		 Eracceptpage eracceptpage=new Eracceptpage(driver);
	     eracceptpage.clickonaccept(driver);	 
		 Erlogin erlogin=new Erlogin(driver);
//		 erlogin.EnteruserID("cscbarkha",driver);
		 String username=Parametrerization.getData(0, 1);
		 erlogin.EnteruserID(username, driver);
		 String password=Parametrerization.getData(1, 1);
		 erlogin.Enterpass(password, driver);	 
//		 erlogin.Enterpass("Chava*4999+2022",driver);
		 erlogin.Clickonlogin();
         Erapplication erapplication=new Erapplication(driver);
		 erapplication.clickonapplication();
		 erapplication.clickoncollection(driver);
		 String accountno=Parametrerization.getData(2,1);
		 erapplication.enteraccountnumber(accountno);
		 erapplication.clickonradio();
		 erapplication.selectphonetype(driver);
		 erapplication.clickoncontinue();
		 }
		 @Test
		 public void scenario6and7and8() throws InterruptedException, EncryptedDocumentException, IOException 
		 {
			 Eracceptpage eracceptpage=new Eracceptpage(driver);
			 eracceptpage.clickonaccept(driver);	 
			 Erlogin erlogin=new Erlogin(driver);
//			 erlogin.EnteruserID("cscbarkha",driver);
			 String username=Parametrerization.getData(0, 1);
			 erlogin.EnteruserID(username, driver);
			 String password=Parametrerization.getData(1, 1);
			 erlogin.Enterpass(password, driver);	 
//			 erlogin.Enterpass("Chava*4999+2022",driver);
			 erlogin.Clickonlogin();
            Erapplication erapplication=new Erapplication(driver);
			erapplication.clickonapplication();
		    erapplication.clickoncollection(driver);
		    String accountno=Parametrerization.getData(2,1);
			erapplication.enteraccountnumber(accountno);
			erapplication.clickonradio();
			erapplication.selectphonetype(driver);
			erapplication.clickoncontinue();
		   Ercontactscreen ercontactscreen=new Ercontactscreen(driver);
		   ercontactscreen.clickoncomments(driver);
		   Thread.sleep(1000);
		   ercontactscreen.clickonclose(driver);
		   ercontactscreen.transferwindow(driver);
		   ercontactscreen.clickonnext1();
		 }	
		 
		 @Test
		 public void scenario9and10and11() throws EncryptedDocumentException, IOException, InterruptedException {
		 Eracceptpage eracceptpage=new Eracceptpage(driver);
		 eracceptpage.clickonaccept(driver);	 
		 Erlogin erlogin=new Erlogin(driver);
//		 erlogin.EnteruserID("cscbarkha",driver);
		 String username=Parametrerization.getData(0, 1);
		 erlogin.EnteruserID(username, driver);
		 String password=Parametrerization.getData(1, 1);
		 erlogin.Enterpass(password, driver);	 
//		 erlogin.Enterpass("Chava*4999+2022",driver);
		 erlogin.Clickonlogin();
         Erapplication erapplication=new Erapplication(driver);
		 erapplication.clickonapplication();
		 erapplication.clickoncollection(driver);
		 String accountno=Parametrerization.getData(2,1);
		 erapplication.enteraccountnumber(accountno);
		 erapplication.clickonradio();
		 erapplication.selectphonetype(driver);
		 erapplication.clickoncontinue();
		 Ercontactscreen ercontactscreen=new Ercontactscreen(driver);
		 ercontactscreen.clickoncomments(driver);
		 Thread.sleep(1000);
		 ercontactscreen.clickonclose(driver);
		 ercontactscreen.transferwindow(driver);
		 ercontactscreen.clickonnext1();
		 Erdifferantaccount erdifferantaccount=new Erdifferantaccount(driver);
		 erdifferantaccount.clickoncontinue();
		 erdifferantaccount.clickondiiferantaccountno();
		 String accountnum=Parametrerization.getData(3,1);
		 erdifferantaccount.enteraccountno(accountnum);
//		 erdifferantaccount.enteraccountno();
		 erdifferantaccount.clickonradio1();
		 erdifferantaccount.selectphonetype(driver);
		 erdifferantaccount.clickonconti(driver);
		 }
		 
		 @Test
		 public void scenario12and13and14() throws InterruptedException, EncryptedDocumentException, IOException {
		Eracceptpage eracceptpage=new Eracceptpage(driver);
	    eracceptpage.clickonaccept(driver);	 
		Erlogin erlogin=new Erlogin(driver);
//		erlogin.EnteruserID("cscbarkha",driver);
		String username=Parametrerization.getData(0, 1);
        erlogin.EnteruserID(username, driver);
		String password=Parametrerization.getData(1, 1);
		erlogin.Enterpass(password, driver);	 
//      erlogin.Enterpass("Chava*4999+2022",driver);
		erlogin.Clickonlogin();
        Erapplication erapplication=new Erapplication(driver);
	    erapplication.clickonapplication();
		erapplication.clickoncollection(driver);
		 String accountno=Parametrerization.getData(2,1);
		erapplication.enteraccountnumber(accountno);
		erapplication.clickonradio();
		erapplication.selectphonetype(driver);
	    erapplication.clickoncontinue();
		 Ercontactscreen ercontactscreen=new Ercontactscreen(driver);
		 ercontactscreen.clickoncomments(driver);
		 Thread.sleep(1000);
		 ercontactscreen.clickonclose(driver);
		 ercontactscreen.transferwindow(driver);
		 ercontactscreen.clickonnext1();
		 Erdifferantaccount erdifferantaccount=new Erdifferantaccount(driver);
		 erdifferantaccount.clickoncontinue();
		 erdifferantaccount.clickondiiferantaccountno();
		 String accountnum=Parametrerization.getData(3,1);
		 erdifferantaccount.enteraccountno(accountnum);
//		 erdifferantaccount.enteraccountno();
		 erdifferantaccount.clickonradio1();
		 erdifferantaccount.selectphonetype(driver);
		 erdifferantaccount.clickonconti(driver);
	     Erborrowercontact erborrowercontact=new Erborrowercontact(driver);
         erborrowercontact.clickonphone(driver);
         erborrowercontact.clickonphone2(driver);
         erborrowercontact.clickonphone3(driver);
         erborrowercontact.clickonphone4(driver);
         erborrowercontact.clickonphone5(driver);
		 erborrowercontact.clickonallradio(driver);
		    }
		 @Test
		 public void scenario15and16and17and18() throws InterruptedException, EncryptedDocumentException, IOException {
		 Eracceptpage eracceptpage=new Eracceptpage(driver);
		 eracceptpage.clickonaccept(driver);	 
		 Erlogin erlogin=new Erlogin(driver);
//		 erlogin.EnteruserID("cscbarkha",driver);
		 String username=Parametrerization.getData(0, 1);
		 erlogin.EnteruserID(username, driver);
		 String password=Parametrerization.getData(1, 1);
		 erlogin.Enterpass(password, driver);	 
//		 erlogin.Enterpass("Chava*4999+2022",driver);
		 erlogin.Clickonlogin();
         Erapplication erapplication=new Erapplication(driver);
		 erapplication.clickonapplication();
		 erapplication.clickoncollection(driver);
		 String accountno=Parametrerization.getData(2,1);
		 erapplication.enteraccountnumber(accountno);
		 erapplication.clickonradio();
		 erapplication.selectphonetype(driver);
		 erapplication.clickoncontinue();
		 Ercontactscreen ercontactscreen=new Ercontactscreen(driver);
		 ercontactscreen.clickoncomments(driver);
		 Thread.sleep(1000);
		 ercontactscreen.clickonclose(driver);
		 ercontactscreen.transferwindow(driver);
		 ercontactscreen.clickonnext1();
		 Erdifferantaccount erdifferantaccount=new Erdifferantaccount(driver);
		 erdifferantaccount.clickoncontinue();
		 erdifferantaccount.clickondiiferantaccountno();
		 String accountnum=Parametrerization.getData(3,1);
		 erdifferantaccount.enteraccountno(accountnum);
//		 erdifferantaccount.enteraccountno();
		 erdifferantaccount.clickonradio1();
		 erdifferantaccount.selectphonetype(driver);
		 erdifferantaccount.clickonconti(driver);
		 Erborrowercontact erborrowercontact=new Erborrowercontact(driver);
         erborrowercontact.clickonphone(driver);
         erborrowercontact.clickonphone2(driver);
         erborrowercontact.clickonphone3(driver);
         erborrowercontact.clickonphone4(driver);
         erborrowercontact.clickonphone5(driver);
		 erborrowercontact.clickonallradio(driver);
		 Erborrowerinterview erborrowerinterview=new Erborrowerinterview(driver);
		 erborrowerinterview.clickoncall(driver);
		 erborrowerinterview.clickonresponce(driver);
		 erborrowerinterview.clickonreason(driver);
		 erborrowerinterview.clickonduration(driver);
		 erborrowerinterview.clickonstatus();
		 erborrowerinterview.clickonrequestletter(driver);
		 erborrowerinterview.clickondeliverypreferance(driver);
		 erborrowerinterview.clickoninterrupt(driver);
		 erborrowerinterview.clickonunwilling();
		 erborrowerinterview.entercomment();
		 }
		 @Test
		 public void scenario19_20_21() throws AWTException, InterruptedException, EncryptedDocumentException, IOException {
		 Eracceptpage eracceptpage=new Eracceptpage(driver);
		 eracceptpage.clickonaccept(driver);	 
		 Erlogin erlogin=new Erlogin(driver);
//		 erlogin.EnteruserID("cscbarkha",driver);
		 String username=Parametrerization.getData(0, 1);
		 erlogin.EnteruserID(username, driver);
		 String password=Parametrerization.getData(1, 1);
		 erlogin.Enterpass(password, driver);	 
//	    erlogin.Enterpass("Chava*4999+2022",driver);
		erlogin.Clickonlogin();
        Erapplication erapplication=new Erapplication(driver);
		erapplication.clickonapplication();
	    erapplication.clickoncollection(driver);
	    String accountno=Parametrerization.getData(2,1);
		erapplication.enteraccountnumber(accountno);
	    erapplication.clickonradio();
	    erapplication.selectphonetype(driver);
	    erapplication.clickoncontinue();
		Ercontactscreen ercontactscreen=new Ercontactscreen(driver);
		ercontactscreen.clickoncomments(driver);
		 Thread.sleep(1000);
		ercontactscreen.clickonclose(driver);
		ercontactscreen.transferwindow(driver);
	     ercontactscreen.clickonnext1();
		Erdifferantaccount erdifferantaccount=new Erdifferantaccount(driver);
		 erdifferantaccount.clickoncontinue();
		 erdifferantaccount.clickondiiferantaccountno();
		 String accountnum=Parametrerization.getData(3,1);
		 erdifferantaccount.enteraccountno(accountnum);
		 erdifferantaccount.clickonradio1();
		 erdifferantaccount.selectphonetype(driver);
		 erdifferantaccount.clickonconti(driver);
		 Erborrowercontact erborrowercontact=new Erborrowercontact(driver);
         erborrowercontact.clickonphone(driver);
         erborrowercontact.clickonphone2(driver);
         erborrowercontact.clickonphone3(driver);
         erborrowercontact.clickonphone4(driver);
         erborrowercontact.clickonphone5(driver);
		 erborrowercontact.clickonallradio(driver);
		 Erborrowerinterview erborrowerinterview=new Erborrowerinterview(driver);
		 erborrowerinterview.clickoncall(driver);
		 erborrowerinterview.clickonresponce(driver);
		 erborrowerinterview.clickonreason(driver);
		 erborrowerinterview.clickonduration(driver);
		 erborrowerinterview.clickonstatus();
		 erborrowerinterview.clickonrequestletter(driver);
		 erborrowerinterview.clickondeliverypreferance(driver);
		 erborrowerinterview.clickoninterrupt(driver);
		 erborrowerinterview.clickonunwilling();
		 erborrowerinterview.entercomment();
		 Erimageupload erimageupload=new Erimageupload(driver);
		 erimageupload.clickonapplicationre(driver);
		 String accountnums=Parametrerization.getData(4,1);
		 erimageupload.enteraccount(accountnums);;
//		 erimageupload.enteraccount();
		 erimageupload.clickradio1();
		 erimageupload.selectphone1(driver);
		 erimageupload.clickonselect();
	     erimageupload.clickonadd(driver);
	     erimageupload.clickonstart(driver);
	     erimageupload.clickonlogout();
		 }

		
	
}

