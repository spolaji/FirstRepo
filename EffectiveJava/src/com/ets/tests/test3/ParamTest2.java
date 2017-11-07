package com.ets.tests.test3;

public class ParamTest2 {
	public static void printSum(double a, double b) { 
		System.out.println("In double: "+(a+b));
	}
	
	public static void printSum(float a, float b){ 
		System.out.println("In float: "+(a+b));
	}
	
	public static void main(String[] args) {
		printSum(1.0, 2.0);
		String s = args[0];
		System.out.println("s.length(): " + s.length());
	}
}
