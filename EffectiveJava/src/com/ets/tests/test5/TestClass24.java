package com.ets.tests.test5;

public class TestClass24 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("String".replace('g','g')=="String");
		
		int i = -1;
		
		while (++i <= 0) {
			System.out.println("Inside while");
		}
		
		System.out.println(i);
		byte b = 2;
		char c = 3;
		short s = 1;
		int i1 = 1;
		c += b ;
		final byte a1 = 1;
		final byte b1 = 1;
		byte c1 = a1 + b1;
		//System.out.println(c += b);
		System.out.println(c= (char) (c + b));
		
		short x = 3; x = (short)(x + 4.6);
		System.out.println(x);
		
	}

}
