package Dummy;

import org.apache.logging.log4j.*;

public class AddLogs {
	
	private static Logger log= LogManager.getLogger(AddLogs.class.getName());
	public static void main(String[] args) {
		log.debug("Click on the OK button in AddLogs");
		
		log.info("Home loaded successfully in AddLogs");
		
		log.error("Text is not displayed in AddLogs");
		
		log.fatal("This is fatal issue in AddLogs");
	}

}
