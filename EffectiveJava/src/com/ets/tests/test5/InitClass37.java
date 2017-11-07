package com.ets.tests.test5;

public class InitClass37 {
	public static void main(String args[ ] ){
		InitClass37  obj = new InitClass37 (5);
	}
	
	int m;
	static int i1 = 5;
	static int i2 ;
	
	int x;
	
	public InitClass37 (int m){
		System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
	}
	int  j = 100;
	{ 
		j = 30; 
		i2 = 40; 
	}  
		static { i1++; }     
}