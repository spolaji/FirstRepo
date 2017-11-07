package com.ets.tests.test4;

interface Runner { 
	public void run(); 
} 

public class TestClass15 { 
	public static void main(String[] args) { 
		run(() -> voidMethod()); //will invoke run(Runner ) method.         
		run(() -> {intMethod();});//will also invoke run(Runner ) method.     
	}  
	
	public static void run(Runner x) { 
		x.run();
	}  
	
	public static void voidMethod() { 
		System.out.println("voidMethod");
	} 
	
	public static int intMethod() { 
		System.out.println("intMethod"); 
		return 0;
	} 
}
