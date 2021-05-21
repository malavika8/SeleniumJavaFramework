package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Log4j {
	private static Logger logg = LogManager.getLogger(Log4j.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n Hello World...! \n");
		logg.trace("This is a trace message");
		logg.info("This is information message");
		logg.error("This is error message");
		logg.warn("This is warning message");
		System.out.println("\n Completed");
	}

}
