package com.ets.tests.test5;

public class PromotionTest38 {
	public static void main(String args[]){
		int i = 5;
		float f = 5.5f;
		double d = 3.8;
		char c = 'a';
		int result = (int)(d+f);
		System.out.println(result);
		if (i == f) 
			c++;
		if (((int) (f + d)) == ((int) f + (int) d)) 
			c += 2;
		System.out.println(c);
	}
}