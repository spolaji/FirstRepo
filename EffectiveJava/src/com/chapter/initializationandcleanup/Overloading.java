package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloaded method");
		}
	}

}

class Tree {
	int height;
	Tree() {
		print("Planting a seedling");
		height = 0;
	}

	Tree(int initialHeight) {
		height = initialHeight;
		println("Creating new Tree that is " +height + " feet tall");
	}
	
	void info() {
		println("Tree is " +height + " feet tall");
	}
	
	void info(String s) {
		println(s + ": Tree is " +height + " feet tall");
	}	
}
