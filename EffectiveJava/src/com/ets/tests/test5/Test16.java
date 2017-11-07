package com.ets.tests.test5;

class Super { 
	
	static String ID = "QBANK"; 
	
	Super () {
		System.out.println("Initializing Super");
	}
}

class Sub extends Super {
	//static String ID = "QBANK1"; 
	static { 
		System.out.print("In Sub"); 
	}
}
public class Test16 {
	
	public static void main(String[] args) {
		System.out.println(Sub.ID);
	}
}