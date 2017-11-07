package com.ets.tests.test5;

public class Noob34 {
	public void m(int a) {
		System.out.println("In int ");
	}
	
	public void m(char c){
		System.out.println("In char ");
	}

	public static void main(String[] args) {
		Noob34 n = new Noob34();
		int a = 'A' + 26;
		if (a < 0)
			throw new IllegalArgumentException();
		System.out.println(a);
		char c =  'A' - 5;
		System.out.println(c);
		n.m(a);
		n.m(c);
	}
}