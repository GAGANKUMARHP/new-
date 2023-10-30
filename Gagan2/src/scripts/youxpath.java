package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youxpath
{

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./selenim/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.youtube.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("theri metti me");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
			
			driver.close();
			

		}

	}


