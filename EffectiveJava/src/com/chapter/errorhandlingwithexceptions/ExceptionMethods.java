package com.chapter.errorhandlingwithexceptions;

import static com.chapter.everythingisanobject.Print.*;

public class ExceptionMethods {

	public static void main(String[] args) {
		try {
			throw new Exception("My exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			println("Caught Exception");
			println("getMessage():" + e.getMessage());
			println("getLocalizedMessage():" + e.getLocalizedMessage());
			println("toString(): " + e);
			println("printStackTrace(): ");
			e.printStackTrace(System.out);
		}

	}

}
