package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TEST1
{
@FindBy(id="email")
private WebElement email;

@FindBy(id="pass")
private WebElement pass;

@FindBy(name="login")
private WebElement login;

public TEST1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
 public void email(String un)
 {
	  email.sendKeys(un);
 }

 public void pass(String pa)
 {
	 pass.sendKeys(pa);
 }
 public void login()
 {
	 login.click();
 }
 
 
}
