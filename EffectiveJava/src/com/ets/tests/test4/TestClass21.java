package com.ets.tests.test4;

interface A1 {
	default void hello() {
		System.out.println("A1");
	} 
}  

interface B1 extends A1 { 
	default void hello() { 
		//super.hello(); //This is NOT valid.   
		System.out.println("B1");
		A1.super.hello();
	} 
}  

public class TestClass21 implements B1 {
	public void hello() { 
		//super.hello();//This is NOT valid.       
		//A1.super.hello(); //This is NOT valid because TestClass does not implement A directly.       
		B1.super.hello(); //This is valid.    
	} 
	
	public static void main(String[] args) {
		TestClass21 tc = new TestClass21();
		tc.hello();
	}
}
