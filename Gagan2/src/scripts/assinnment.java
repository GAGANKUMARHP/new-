package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assinnment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./selenim/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		Thread.sleep(1000);
		driver.manage().window().maximize();
	    WebElement e = driver.findElement(By.id("uploadFile"));
	    Thread.sleep(2000);
	    e.sendKeys("C:\\Users\\NEW LAP\\Documents\\API-CLASS-soapui-project.xml");
	    Thread.sleep(2000);
	    	    
		
		}


}
