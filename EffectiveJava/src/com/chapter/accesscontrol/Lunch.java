package com.chapter.accesscontrol;

import static com.chapter.everythingisanobject.Print.*;

public class Lunch {

	void testPrivate() {
	}
	
	void testStatic() {
		Soup1 soup = Soup1.makeSoup();
	}
	
	void testSingleton() {
		Soup2.access().f();
	}
	
	public static void main(String[] args) {	

	}
}

class Soup1 {
	private Soup1() {
		
	}
	
	//(1) Allow creation via static method
	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

class Soup2 {
	private Soup2() {
		
	}
	
	//(2) Create a static object and return a reference.
	// Singleton pattern.
	private static Soup2 ps1 = new Soup2();
	public static Soup2 access() {
		return ps1;
	}
	
	public void f() {
		
	}
}
