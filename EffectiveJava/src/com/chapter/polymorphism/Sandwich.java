package com.chapter.polymorphism;

import static com.chapter.everythingisanobject.Print.*;

public class Sandwich extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	
	public Sandwich() {
		println("Sandwich()");
	}
	
	public static void main(String[] args) {
		println("Start");
		new Sandwich();
	}
}

class PortableLunch extends Lunch {

	PortableLunch() {
		println("PortableLunch()");
	}
}

class Meal {
	Meal() {
		println("Meal()");
	}
}
class Lunch extends Meal {
	Lunch() {
		println("Lunch()");
	}
}

class Bread {
	Bread() {
		println("Bread()");
	}	
}

class Cheese {
	Cheese() {
		println("Cheese()");
	}	
}

class Lettuce {
	Lettuce() {
		println("Lettuce()");
	}		
}