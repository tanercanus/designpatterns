package tanerus.designpattern.behavioral.chainofresponsiblity;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityEverydayDemo {

	private static final Logger logger = Logger.getLogger(ChainOfResponsibilityEverydayDemo.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		logger.setLevel(Level.FINER);
		
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.FINER);
		logger.addHandler(handler);
		
		logger.finest("1");
		logger.finer("1");
		logger.fine("1");
		
		
	}

}
