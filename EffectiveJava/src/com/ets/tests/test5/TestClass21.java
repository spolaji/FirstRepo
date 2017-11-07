package com.ets.tests.test5;

public class TestClass21 implements T1, T2{
	public void m1(){
	}
	
	public static void main(String[] args) {
		T2.m2();
	}
	
}

interface T1{
	int VALUE = 1;
	void m1();
	
	default void m2() {
		System.out.println("T1.m2()");
	}
}

interface T2{
	int VALUE = 2;
	void m1();
	
	static void m2() {
		System.out.println("T2.m2()");
	}
}
