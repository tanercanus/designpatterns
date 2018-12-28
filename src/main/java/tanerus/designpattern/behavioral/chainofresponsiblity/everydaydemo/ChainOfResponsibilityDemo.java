package tanerus.designpattern.behavioral.chainofresponsiblity.everydaydemo;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityDemo {
	private static final Logger logger = Logger.getLogger(ChainOfResponsibilityDemo.class.getName());
	
	public static void main(String args[]){
		
		logger.setLevel(Level.FINER);
		
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.FINER);
		logger.addHandler(handler);
		
		logger.finest("Finest level of logging");
		logger.finer("Finer level, but not as fine as finest");
		logger.fine("Fine level, but not as fine as finer or finest");
		
	}
	
}
