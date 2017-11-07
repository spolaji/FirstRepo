package com.ets.tests.test4;


class A{
	final int fi = 10;
}

public class B2 extends A{
	int fi = 15;
	public static void main(String[] args){
		B2 b = new B2();
		b.fi = 20;
		System.out.println(b.fi);
		System.out.println( ((A) b).fi);
	}
}
