package com.ets.tests.test5;

interface I{
}

class A2 implements I{
}

class B2 extends A2 {
}

class C2 extends B2 {
}

public class TestClass53 {
	public static void main(String[] args) {
		A2 a = new A2();
		B2 b = new B2();
		
		a = (B2)(I)b;
		b = (B2)(I) a;
		
		//a = (I) b;
		//I i = (C2) a;
	}
}
