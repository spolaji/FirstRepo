package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class OptionalTrailingArguments {

	static void f(int required, String... trailing) {
		print("required: " + required + " ");
		for(String s : trailing) 
			print(s + " ");
		println(" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(1,"one");
		f(2,"one", "three");
		f(0);
	}

}
