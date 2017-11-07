package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.print;
import static com.chapter.everythingisanobject.Print.println;

public class NewVarArgs {

	static void printArray(Object... args) {
		for(Object obj: args)
			print(obj + " ");
		println(" ");
	}
	
	static void f(Integer... args) {
		for(Integer i: args)
			print(i + " ");
		println(" ");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(new Object[] {
			new Integer(47), new Float(3.14), new Double(11.11)	
		});
		printArray(47,3.14F,11.11);
		printArray("one", "two", "three");
		printArray(new A(), new A(), new A());
		printArray((Object[])new Integer[]{1,2,3,4});
		printArray();
		f(new Integer(1), new Integer(2));
		f(4,5,6,7,8,9);
		f(10,new Integer(11),12);
	}

}
