package scripts;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./selenim/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		String id = driver.getWindowHandle();
		System.out.println(id);
		Set<String> allwin = driver.getWindowHandles();
		allwin.remove(id);
		for (String wh : allwin) 
		{
			driver.switchTo().window(wh);
			String t = driver.getTitle();
			System.out.println(t);
			Thread.sleep(2000);
			driver.close();
			
		}
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
