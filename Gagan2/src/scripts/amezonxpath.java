package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amezonxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenim/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.amezon.com");
		Thread.sleep(2000);
		d.findElement(By.xpath("//[img[@alt='Headsets']")).click();
		
		

	}

}
