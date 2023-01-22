package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Erborrowercontact {
	
//    @FindBy(xpath=("(//input[@name='emailAddressesCorrect'][2]"))private WebElement conti;
	@FindBy(xpath=("//input[@id='phoneNumbersCorrect_false']"))private WebElement phone;
	@FindBy(xpath=("//span[@id='select2-primaryPhoneStatusBorrower-container']"))private WebElement drop1;
	@FindBy(xpath=("/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[2]"))private WebElement phone1;
	@FindBy(xpath=("(//span[@class='select2-selection__arrow'])[7]"))private WebElement drop2;
	@FindBy(xpath=("//li[text()='No Phone']"))private WebElement phone2;
	@FindBy(xpath=("(//span[@class='select2-selection__arrow'])[9]"))private WebElement drop3;
	@FindBy(xpath=("//li[text()='No Phone']"))private WebElement phone3;
	@FindBy(xpath=("(//span[@class='select2-selection__arrow'])[11]"))private WebElement drop4;
	@FindBy(xpath=("//li[text()='No Phone']"))private WebElement phone4;
	@FindBy(xpath=("(//span[@class='select2-selection__arrow'])[13]"))private WebElement drop5;
	@FindBy(xpath=("//li[text()='No Phone']"))private WebElement phone5;
	@FindBy(xpath=("(//input[@type='radio'])[2]"))private WebElement radio1;
	@FindBy(xpath=("(//input[@type='radio'])[4]"))private WebElement radio2;
	@FindBy(xpath=("(//input[@type='radio'])[6]"))private WebElement radio3;
	@FindBy(xpath=("//button[@id='er-button-2']"))private WebElement carry;
	
	
	
	public Erborrowercontact(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	public void clickonphone(WebDriver driver) 
	
	{
		WebDriverWait waitt=new WebDriverWait(driver,Duration.ofMillis(20000));
	    waitt.until(ExpectedConditions.visibilityOf(phone));
		phone.click();
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(2000));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(drop1));
	     drop1.click();
//		Actions act=new Actions(driver);
//		act.moveToElement(drop1).click().build().perform();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(20000));
//		wait.until(ExpectedConditions.visibilityOf(phone1));
		phone1.click();
		
		
	}
	
	
	public void clickonphone2(WebDriver driver) {
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(2000));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(drop2));
	     drop2.click();
	     phone2.click();
	}
	
	public void clickonphone3(WebDriver driver) {
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(2000));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(drop3));
	     drop3.click();
	     phone3.click();
	}
	
	
	public void clickonphone4(WebDriver driver) {
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(2000));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(drop4));
	     drop4.click();
	     phone4.click();
	}
	
	public void clickonphone5(WebDriver driver) {
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(2000));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(drop5));
	     drop5.click();
	     phone5.click();
	}



	

	
	public void clickonallradio(WebDriver driver) {
		// TODO Auto-generated method stub
		
	
//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(20000));
//	wait.until(ExpectedConditions.visibilityOf(radio1));
	radio1.click();
	radio2.click();
	radio3.click();
	carry.click();
	}


}
