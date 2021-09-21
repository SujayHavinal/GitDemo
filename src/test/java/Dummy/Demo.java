package Dummy;
import org.apache.logging.log4j.*;

public class Demo {

	private static Logger log=LogManager.getLogger(Demo.class.getName()); // Mandatory step to log
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=Demo.class.getName();
	//	System.out.println(s); // It will return classname as Dummy.Demo
		
		log.debug("I have clicked on button");
		
			log.info("Button is dispalyed");
		
			log.error("Button is not displayed");
		
		log.fatal("Button is missing");
	}

}
