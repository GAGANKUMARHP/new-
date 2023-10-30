package scripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","./selenim/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();		
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebDriverWait wait =new WebDriverWait(driver, 1);
		System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.titleContains("Amazon.in : iphone 14"));
		wait.until(ExpectedConditions.urlContains("https://www.amazon.in/s?k=iphone+14&ref=nb_sb_noss"));
		System.out.println(driver.getCurrentUrl());
		WebElement e = driver.findElement(By.xpath("//span [text()='Apple iPhone 14 (128 GB) - Blue']"));
		wait.until(ExpectedConditions.visibilityOf(e)).click();
		System.out.println(e.getText());	
		
	}

}
