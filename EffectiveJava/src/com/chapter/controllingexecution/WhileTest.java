package com.chapter.controllingexecution;

import static com.chapter.everythingisanobject.Print.*;

public class WhileTest {
	static boolean condition() {
		boolean result = Math.random() < 0.99;
		print(result + ", ");
		return result;
	}
	
	public static void main(String[] args) {
		while(condition())
			println("Inside while");
	}
}
