package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class OverloadingVarargs {

	static void f(Character... args){
		print("first");
		for(Character c : args) {
			print(" "+c);
		}
		println(" ");
	}

	static void f(Integer... args){
		print("second");
		for(Integer i : args) {
			print(" "+i);
		}
		println(" ");
	}	
	
	static void f(Long... args){
		print("third");
		for(Long l : args) {
			print(" "+l);
		}
		println(" ");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f('a','b','c');
		f(1);
		f(2,1);
		f(0);
		f(0l);
	}

}
