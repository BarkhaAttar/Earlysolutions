package POM;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ercontactscreen {
	@FindBy(xpath=("//a[@class='erl-app-link fm-screen-fmcust-add-comments erl-app-link-popup']"))private WebElement add_comments;
	@FindBy(xpath=("//textarea[@name='commentText']"))private WebElement information;
	@FindBy(xpath=("(//button[@id='er-button-1'])[2]"))private WebElement closed;
	@FindBy(xpath=("//a[text()='Financial History']"))private WebElement Finance;
	@FindBy(xpath=("//button[@id='er-button-1']"))private WebElement next1;

	
	public Ercontactscreen(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickoncomments(WebDriver driver) 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(20000));
		wait.until(ExpectedConditions.visibilityOf(add_comments));
		add_comments.click();
	}

	public void clickonclose(WebDriver driver) 
	{
		Set<String> i =driver.getWindowHandles();
		Iterator<String> j =i.iterator();
		String ParentId=j.next();
		String childID=j.next();
		driver.switchTo().window(childID);
		closed.click();
		driver.switchTo().window(ParentId);
		Finance.click();
		}
		
	public void transferwindow(WebDriver driver)
		{
			Set<String> in =driver.getWindowHandles();
			Iterator<String> jn =in.iterator();
			String Pr=jn.next();
			String ch=jn.next();
	       driver.switchTo().window(ch);
	       driver.close();
	       driver.switchTo().window(Pr);
	   }
	public void clickonnext1()
		  {
			next1.click();

			}

		
}
