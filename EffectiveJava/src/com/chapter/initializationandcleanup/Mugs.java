package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class Mugs {
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		println("Mugs 1 and 2 initialized");
	}
	
	Mugs() {
		println("Mugs()");
	}
	
	Mugs(int i) {
		println("Mugs(int)");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println("Inside main()");
		new Mugs();
		println("new Mugs() completed");
		new Mugs(1);
		println("new Mugs(1) completed");		
	}
}

class Mug {
	
	Mug(int marker) {
		println("Mug(" + marker + ")");
	}
	
	void f(int marker) {
		println("f(" + marker + ")");
	}
	
}