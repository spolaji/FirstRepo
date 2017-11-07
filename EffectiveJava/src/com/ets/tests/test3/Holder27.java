package com.ets.tests.test3;

public class Holder27 {
   		int value = 1;
   		Holder27 link;
   
   	public Holder27(int val) { 
   		this.value = val; 
   	}
   
   	public static void main(String[] args) {
		final Holder27 a = new Holder27(5);
		Holder27 b = new Holder27(10);
		a.link = b;
		b.link = setIt(a, b);
		System.out.println(a.link.value+" "+b.link.value);
   	}
   
   	public static Holder27 setIt(final Holder27 x, final Holder27 y) {
       	//x.link = y.link;
       	return x;
   	}
   
}
