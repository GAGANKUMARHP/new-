package scripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DDTwriteandFetch {

	@Test
	public void test1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream fis=new FileInputStream("./exel/testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.createSheet("sheet5");
		System.setProperty("webdriver.gecko.driver", "./selenim/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amezon.in");
		driver.manage().window().maximize();
		
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		int count = link.size();
		for (int i = 0; i < count; i++)
		{
			WebElement links = link.get(i);
			String val = links.getAttribute("href");
			Row ro = sh.createRow(i);
			Cell cel = ro.createCell(2);
			cel.setCellValue(val);
			Thread.sleep(10);
			
		}
		
		FileOutputStream fout =new FileOutputStream("./exel/testdata.xlsx");
		book.write(fout);
		
	}
	
}
