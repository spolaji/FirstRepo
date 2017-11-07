package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class Flower {
	int petalCount = 0;
	String s = "initial value";
	
	Flower(int petals) {
		petalCount = petals;
		println("Constructor w/ int arg only, petalCount = "+petalCount);
	}

	Flower(String ss) {
		println("Constructor w/ String arg only, s = "+ss);
		s = ss;
	}
	
	Flower(String s, int petals) {
		this(petals);
		//this(s); Cannot call two!
		this.s = s;
		println("String and Int args");
	}
	
	Flower() {
		this("hi", 47);
		println("default constructor no arg");
	}
	
	void printPetalCount() {
		//this(11);
		println("petalCount = " +petalCount + " s = " +s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower x = new Flower();
		x.printPetalCount();

	}

}
