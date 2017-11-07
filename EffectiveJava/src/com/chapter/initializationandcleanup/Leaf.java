package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class Leaf {
	int i;
	
	Leaf increment() {
		i++;
		return this;
	}
	
	void print() {
		println("i = " +i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leaf x = new Leaf();
		x.increment().increment().increment().print();
	}

}
