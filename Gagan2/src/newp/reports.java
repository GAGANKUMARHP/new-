package newp;

import javax.swing.plaf.basic.BasicArrowButton;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class reports {

	@Test
	public void test1()
	{
		BasicConfigurator.configure();
		Logger log = Logger.getLogger(this.getClass().getName());
		log.warn("kehooo");
		log.error("ohh nooo");
		log.info("need to do more practice");
		
		
		
		
		
		
	}
}
