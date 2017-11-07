package com.chapter.reusingclasses;

import static com.chapter.everythingisanobject.Print.*;

public class Beetle extends Insect {
	private int k = printInit("Beetle.k intialized");
	
	Beetle() {
		println(" k = " + k);
		println(" j = " + j);
	}
	
	private static int x2 = printInit("static Beetle.x2 intialized");
	
	public static void main(String[] args) {
		println("Beetle constructor");
		Beetle b = new Beetle();
	}
}

class Insect {
	private int i = 9;
	protected int j;
	
	Insect() {
		println("Insect constructor");
		println(" i = " + i + ", j = " + j);
		j = 39;
	}
	
	private static int x1 = printInit("static Insect.x1 intialized");
	
	static int printInit(String s) {
		println(s);
		return 47;
	}
}
