package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class OverloadingOrder {

	static void f(String s , int i) {
		println("String: " + s + ", int: " + i);
	}
	
	static void f(int i, String s) {
		println("int: " + i + ", String: " + s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f("String first",11);
		f(99, "Int first");
	}

}
