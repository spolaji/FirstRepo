package com.ets.tests.test3;

import java.io.IOException;

public class InitTest26 {
	int i;
	final boolean bool;
	static 
	{ 
		System.out.println("Inside InitChild.static initializer" );
	}

	{ 
		System.out.println("Inside InitChild.instance initializer" );
	}

	InitTest26() throws IOException{ 
		bool = true;
		//throw new IOException();
		System.out.println("Inside InitChild.constructor" + i); 
	}

	public static void main(String[] args) throws IOException {
		InitTest26 i = new InitTest26();
		//System.out.println("Value of bool is "+i.bool);
		//String s = 63 + new Integer(10);
		System.out.println(args);
		System.out.println(args.length);
		Object obj = new int[]{ 1, 2, 3 };
		//Object[] o = new int[10];
		System.out.println("null" + false );
	}
}
