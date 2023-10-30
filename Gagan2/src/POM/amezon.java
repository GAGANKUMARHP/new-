package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amezon
{

	@FindBy(id="twotabsearchtextbox")
	private WebElement textbox;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement search;
	
	//intializtion
	public amezon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void textbox(String t)
	{
		textbox.sendKeys(t);
	}
	
	public void search()
	{
		search.click();
	}
	
	
	
	
	
	
}
