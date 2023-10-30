package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class location {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./selenim/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
Thread.sleep(2000);
WebElement ele = driver.findElement(By.xpath("//a[text()='हिन्दी']"));
Point locn = ele.getLocation();
System.out.println(locn);
int x = locn.getX();
System.out.println(x);
int y = locn.getY();
System.out.println(y);
driver.manage().window().maximize();
driver.navigate().to("https://www.google.com");
driver.navigate().to("https://www.amazon.com");
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
Dimension d = new Dimension(200,300);
driver.manage().window().setSize(d);
Thread.sleep(3000);
Point p = new Point(300,400);
driver.manage().window().setPosition(p);

WebElement a = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
String tag = a.getTagName();
System.out.println(tag);

String att = a.getAttribute("class");
System.out.println(att);

String txt = a.getText();
System.out.println(txt);

boolean b = a.isEnabled();
System.out.println(b);

driver.navigate().to("https://www.amazon.com");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bottles");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).sendKeys(Keys.ENTER);





}

}
