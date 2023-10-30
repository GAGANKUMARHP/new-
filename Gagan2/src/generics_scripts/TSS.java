package generics_scripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TSS
{

	public static void tss(WebDriver driver) throws IOException
	{
		String photo="/Hybridframe1/photos";
		Date d=new Date();
		String d1 = d.toString();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(d1+photo+".jpeg");
		FileHandler.copy(src, dst);
		
		
	}
	
	
	
}
