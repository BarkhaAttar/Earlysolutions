package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Eracceptpage {
	@FindBy(xpath="//a[text()='I Accept']")private WebElement accept;
	

   public Eracceptpage(WebDriver driver) 
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void clickonaccept(WebDriver driver)  
   {
	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(600,400)");
	    accept.click();
   }


	
}

   
