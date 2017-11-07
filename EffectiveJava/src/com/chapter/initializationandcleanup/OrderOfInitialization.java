package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class OrderOfInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h = new House();
		h.f();
	}
}

class House {
	Window w1 = new Window(1);
	House() {
		println("House()");
		w3 = new Window(33);
	}
	Window w2 = new Window(2);
	void f() {
		println("f()");
	}	
	Window w3 = new Window(3);	
}

class Window {
	Window(int marker) {
		println("window( " +marker);
		
	}
}
