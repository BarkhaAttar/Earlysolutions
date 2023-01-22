package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Erdifferantaccount {
	@FindBy(xpath=("//button[@id='er-button-2']"))private WebElement contis;
	@FindBy(xpath=("//button[@id='er-button-1']"))private WebElement enter_differantaccount;
	@FindBy(xpath=("//input[@id='accountNumber']"))private WebElement account_number1;
	@FindBy(xpath=("//input[@id='withWhomSpeaking_BWR']"))private WebElement radio1;
	@FindBy(xpath=("(//span[@class='select2-selection__arrow'])[1]"))private WebElement drop_down1;
	@FindBy(xpath=("//li[text()='PHONE HOME - BORROWER']"))private WebElement option1;
	@FindBy(xpath=("//button[@id='er-button-1']"))private WebElement confirm1;
	@FindBy(xpath=("//button[@id='er-button-1']"))private WebElement conti2;

	
	public Erdifferantaccount(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void clickoncontinue() {
		contis.click();
	}
	
	public void clickondiiferantaccountno() {
		enter_differantaccount.click();
	}
	public void enteraccountno(String accountnos) {
		account_number1.sendKeys(accountnos);;
	}
	public void clickonradio1() {
		radio1.click();
	}
	
	public void selectphonetype(WebDriver driver) {
		drop_down1.click();
		Actions act=new Actions(driver);
		act.moveToElement(option1).click().build().perform();

	}
	public void clickonconti(WebDriver driver) {
		confirm1.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(20000));
         wait.until(ExpectedConditions.visibilityOf(conti2));
		conti2.click();
		
	}
	
	

}
