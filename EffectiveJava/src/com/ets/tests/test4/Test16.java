package com.ets.tests.test4;

class Test16 {
	public static void main(String[ ] args){
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3, 1, 0 };
		System.out.println( a [ (a = b)[3] ] );
	}
}
