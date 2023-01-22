package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Erimageupload {
	@FindBy(xpath=("(//a[@class='dropdown-toggle'])[1]"))private WebElement application1;
	@FindBy(xpath=("//a[text()='Image Upload']"))private WebElement image_upload;
	@FindBy(xpath=("//input[@id='accountNumber']"))private WebElement account_number1;
	@FindBy(xpath=("//input[@id='withWhomSpeaking_BWR']"))private WebElement radio1;
	@FindBy(xpath=("(//span[@class='select2-selection__arrow'])[1]"))private WebElement drop_down1;
	@FindBy(xpath=("//li[text()='PHONE HOME - BORROWER']"))private WebElement option1;
	@FindBy(xpath=("//button[@id='er-button-1']"))private WebElement confirm1;
	@FindBy(xpath=("//input[@value='Add Files...']"))private WebElement add;
	@FindBy(xpath=("//button[@class='btn btn-primary']"))private WebElement starting;
	@FindBy(xpath=("//a[@href='/auth/public/Logout.do']"))private WebElement out;
	
	
   public Erimageupload(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
    public void clickonapplicationre(WebDriver driver)
	   {
		application1.click();
		Actions act=new Actions(driver);
		act.moveToElement(image_upload).click().build().perform();
        }
	
	public void enteraccount(String accountnum)
	    {
		account_number1.sendKeys(accountnum);
		
		}

	public void clickradio1() 
		{
			
			radio1.click();

		}
				
	public void selectphone1(WebDriver driver) 
	{
			drop_down1.click();
			Actions act=new Actions(driver);
			act.moveToElement(option1).click().build().perform();
			
	}
	public void clickonselect() 
			{
				confirm1.click();
			}
			
	public void clickonadd(WebDriver driver) throws AWTException 
		{
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(20000));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(add));

//		      WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
//		      wait.until(ExpectedConditions.visibilityOf(add));
		      add.click();
              Robot rb=new Robot();
		      rb.delay(2000);
			  StringSelection ss=new StringSelection("C:\\Users\\BAttar\\Downloads\\abba sign.jpeg");
			    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_V);
				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_V);
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
         }

	public void clickonstart(WebDriver driver) 
		{
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(20000));
		    wait.until(ExpectedConditions.visibilityOf(starting));
			Actions act=new Actions(driver);
			act.moveToElement(starting).click().build().perform();;
		}
	public void clickonlogout()
		{
			out.click();
		}
		



}
