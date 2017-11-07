package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class ExplicitStatic {
	public static void main(String[] args) {
		println("Inside main()");
		Cups.cup1.f(99);
	}
	//static Cups cups1 = new Cups();
	//static Cups cups2 = new Cups();
}

class Cup {
	Cup(int marker) {
		println("Cup(" + marker + ")");
	}
	
	void f(int marker) {
		println("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	
	Cups() {
		println("Cups()");
	}
	
	void f(int marker) {
		println("f(" + marker + ")");
	}
}
