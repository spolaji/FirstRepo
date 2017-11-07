package com.ets.tests.test5;


class A1 { 
	protected void m() throws SomeException{
	
	} 
}


class B1 extends A1 { 
	public void m(){ 
		
	} 
}


public class TestClass22 {
	public static void main(String[] args){
		A1 a = new B1(); 
		( (B1) a ).m();
		Object o = new B1(); 
		((B1)o).m();

	}
}

class SomeException extends Exception {
	
}
