package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.print;
import static com.chapter.everythingisanobject.Print.println;

public class OverloadingVarargs2 {

	static void f(float i, Character... args){
		println("first");
	}
	
	static void f(Character... args){
		println("second");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(1,'a');
		//f('a','b');
	}

}
