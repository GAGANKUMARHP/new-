package scripts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class monthdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./selenim/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("month"));
		Select s = new Select(ele);
		TreeSet<String> l = new TreeSet<String>();
		ArrayList<String> l1=new ArrayList<String>(l);
		List<WebElement> opt = s.getOptions();	
		int count = opt.size();
		System.out.println(count);
		for (WebElement we : opt) 
		{
			String t = we.getText();
			l.add(t);
			l.remove("Apr");
		}
	
		for ( String t1 : l) 
		{
			System.out.println(t1);

		}
		
	}
}
