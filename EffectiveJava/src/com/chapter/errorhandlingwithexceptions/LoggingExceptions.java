package com.chapter.errorhandlingwithexceptions;

import java.io.*;
import java.util.logging.Logger;

import static com.chapter.everythingisanobject.Print.*;

public class LoggingExceptions {

	public static void main(String[] args) {
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			println("Caught " + e);
		}

	}

}

class LoggingException extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");
	
	public LoggingException() {
		
		StringWriter trace = new StringWriter();
		//printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
