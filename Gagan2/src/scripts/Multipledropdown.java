package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipledropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenim/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NEW%20LAP/Desktop/code.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("Empire"));
		Select s=new Select(ele);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("a1");
		Thread.sleep(2000);
		s.deselectAll();
		    

	}

}
