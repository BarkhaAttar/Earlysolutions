package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.Parametrerization;

public class Erapplication {
	@FindBy(xpath=("(//a[@class='dropdown-toggle'])[1]"))private WebElement application;
	@FindBy(xpath=("//a[text()='Collections Application']"))private WebElement collectionapp;
	@FindBy(xpath=("//input[@id='accountNumber']"))private WebElement account_number;
	@FindBy(xpath=("//input[@id='withWhomSpeaking_BWR']"))private WebElement radio;
	@FindBy(xpath=("(//span[@class='select2-selection__arrow'])[1]"))private WebElement drop_down;
	@FindBy(xpath=("//li[text()='PHONE HOME - BORROWER']"))private WebElement option;
	@FindBy(xpath=("//button[@id='er-button-1']"))private WebElement confirm;
	
	public Erapplication(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickonapplication() 
	{
		application.click();
	}
	
	public void clickoncollection(WebDriver driver) 
	{
		
	     Actions act=new Actions(driver);
	     act.moveToElement(collectionapp);
	     act.click();
	     act.perform();
		
	}
	public void enteraccountnumber(String accountnos) 
	{
		account_number.sendKeys(accountnos);
//		String eccountno=Parametrerization.getData(2, 1);
		
		
     }
	public void clickonradio() 
	{
		radio.click();
	
	}
	public void selectphonetype(WebDriver driver) 
	{
		drop_down.click();
		Actions act=new Actions(driver);
		act.moveToElement(option).click().build().perform();

	}
	public void clickoncontinue() 
	{
		confirm.click();
	}
	






}