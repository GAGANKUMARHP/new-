package newp;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class reports1 {

	@Test
	public void test1() throws IOException
	{
		Layout layout =new PatternLayout("%d %m %n");
		Appender app=new FileAppender(layout,"./reports/r3.log");
		BasicConfigurator.configure(app);
		Logger log=Logger.getLogger(this.getClass().getName());
		log.warn("hello");
		log.error("kehooo");
		log.debug("hh");
		
	}
}
