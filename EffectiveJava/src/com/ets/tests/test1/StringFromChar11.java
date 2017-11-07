package com.ets.tests.test1;

public class StringFromChar11 {
	public static void main(String[] args) {
		String myStr = "good";
		char[] myCharArr = {'g', 'o', 'o', 'd' };
		String newStr = "null";
		System.out.println(newStr.length());
		for(char ch : myCharArr){
			newStr = newStr + ch;
		}
		System.out.println("myStr: " +myStr);
		System.out.println("newStr: " +newStr);
		myStr.intern();
		System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));
	}
}
