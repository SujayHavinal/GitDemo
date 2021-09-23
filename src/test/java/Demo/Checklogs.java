package Demo;


import org.apache.logging.log4j.*;

public class Checklogs {
	private static Logger log=LogManager.getLogger(Checklogs.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Click on the OK button");

		log.info("Home loaded successfully");

		log.error("Text is not displayed");

		log.fatal("This is fatal issue");
		
		// Again add same for Github practice
		
		log.debug("Get the username");
		
		log.info("Use the username");
		
		
	}

}
