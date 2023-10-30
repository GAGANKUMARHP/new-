package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sripts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./selenim/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		 driver.findElement(By.id("email")).sendKeys("gn944913@gamilcom");
		 Thread.sleep(2000);
		 driver.findElement(By.id("pass")).sendKeys("111gagan");
		 Thread.sleep(2000);
		 driver.findElement(By.name("login")).click();
		

	}

}