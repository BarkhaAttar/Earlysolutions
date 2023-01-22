package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Erborrowerinterview {

	@FindBy(xpath=("(//span[@class='select2-selection__arrow'])[1]"))private WebElement call;
	@FindBy(xpath=("//li[text()='Voicemail']"))private WebElement voicecall;
	@FindBy(xpath=("(//span[@class='select2-selection__arrow'])[2]"))private WebElement responce;
	@FindBy(xpath=("//li[text()='CANNOT COMMIT TO PAY']"))private WebElement cannot_commit;
	@FindBy(xpath=("(//span[@class='select2-selection__arrow'])[8]"))private WebElement reasone;
	@FindBy(xpath=("//li[text()='Business Failure']"))private WebElement buisness_failure;
	@FindBy(xpath=("(//span[@class='select2-selection__arrow'])[9]"))private WebElement duration;
	@FindBy(xpath=("//li[text()='1-30 days']"))private WebElement thirty ;
	@FindBy(xpath=("//input[@id='question__BORRI_occupancyStatus1']"))private WebElement status;
	@FindBy(xpath=("//input[@id='question__BORRI_primaryResidence1']"))private WebElement residence;
	@FindBy(xpath=("//input[@id='question__BORRI_borrowerIntent0']"))private WebElement property;
	@FindBy(xpath=("//input[@id='question__BORRI_cashOnHand']"))private WebElement cash;
	@FindBy(xpath=("(//span[@class='select2-selection__arrow'])[11]"))private WebElement request_letter;
	@FindBy(xpath=("//li[text()='English']"))private WebElement english;
	@FindBy(xpath=("(//span[@class='select2-selection__arrow'])[12]"))private WebElement delivery_preferance;
	@FindBy(xpath=("//li[text()='Paper']"))private WebElement paper;  
    @FindBy(xpath=("//a[text()='Interrupt']"))private WebElement interrupt_1;
    @FindBy(xpath=("//input[@id='interruptReason_UNWILLING']"))private WebElement unwiling;
    @FindBy(xpath=("//textarea[@id='comments']"))private WebElement comment_pass;
    @FindBy(xpath=("//button[@id='er-button-2']"))private WebElement Conti2;
    @FindBy(xpath=("//button[@id='er-button-1']"))private WebElement end_summary;
    @FindBy(xpath=("//a[@class='erl-app-link fm-screen-fmcust-main-menu']"))private WebElement main_menu;
    
    
    
    public Erborrowerinterview(WebDriver driver) 
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void clickoncall(WebDriver driver)
    {

    	call.click();
    	Actions act=new Actions(driver);
    	act.moveToElement(voicecall).click().build().perform();
    }
    public void clickonresponce(WebDriver driver) 
    {
    	responce.click();
    	Actions act=new Actions(driver);
    	act.moveToElement(cannot_commit).click().build().perform();
    	
    }
    public void clickonreason(WebDriver driver) 
    {
    	reasone.click();
    	Actions act=new Actions(driver);
    	act.moveToElement(buisness_failure).click().build().perform();
    }
    public void clickonduration(WebDriver driver) 
    {
    	duration.click();
    	Actions act=new Actions(driver);
    	act.moveToElement(thirty).click().build().perform();
    }
    public void clickonstatus() 
    {
    	status.click();
    	residence.click();
    	property.click();
    	cash.sendKeys("40000");
    	
    }
    public void clickonrequestletter(WebDriver driver)
    {
    	request_letter.click();
    	Actions act=new Actions(driver);
    	act.moveToElement(english).click().build().perform();
    	
    }
    public void clickondeliverypreferance(WebDriver driver) 
    {
    	delivery_preferance.click();
    	Actions act=new Actions(driver);
    	act.moveToElement(paper).click().build().perform();

    }
    
    public void clickoninterrupt(WebDriver driver) throws InterruptedException 
    {
		interrupt_1.click();
	}
    public void clickonunwilling() 
    {
    	unwiling.click();
    }
    public void entercomment() 
    {
    	comment_pass.sendKeys("Training");
    	Conti2.click();
    	end_summary.click();
    	main_menu.click();
    
    }

	
	

}
