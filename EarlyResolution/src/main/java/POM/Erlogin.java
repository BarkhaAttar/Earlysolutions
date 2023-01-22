package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Erlogin {
	@FindBy(xpath="//input[@type='text']")private WebElement email;
	@FindBy(xpath="//input[@id='j_password']")private WebElement password;
	@FindBy(xpath="//button[@id='buttonCell']")private WebElement login;
	
	
	public Erlogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void EnteruserID(String emailaddress,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(20000));
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys(emailaddress);
	}
	
	public void Enterpass(String useraddress,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(20000));
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys(useraddress);
	}
	
	public void Clickonlogin() 
	{
		login.click();
	}
}
