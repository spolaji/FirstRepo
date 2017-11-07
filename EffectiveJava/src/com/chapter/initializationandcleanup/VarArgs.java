package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class VarArgs {

	static void printArray(Object[] args) {
		for(Object obj: args)
			print(obj + " ");
		println(" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(new Object[] {
			new Integer(47), new Float(3.14), new Double(11.11)	
		});
		printArray(new Object[] {"one", "two", "three"});
		printArray(new Object[] {new A(), new A(), new A()});
	}

}

class A {

	@Override
	public String toString() {
		return "A";
	}

}
