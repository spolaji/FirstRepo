package com.ets.tests.test1;


public class Test16{
	public static void testInts(Integer obj, int var){
		obj = var++;
		obj++;
	}
	
	public static void main(String[] args) {
		Integer val1 = new Integer(5);
		int val2 = 9;
		testInts(val1++, ++val2);
		System.out.println(val1+" "+val2);
	}
}
