package com.ets.tests.test5;

public class Test56 {
	static boolean a;
	static boolean b;
	static boolean c;
	public static void main (String[] args){
		boolean bool = (a = true) || (b = true) && (c = true);
		System.out.println(a + ", " + b + ", " + c);
		System.out.println(Boolean.parseBoolean(" true "));
		//int x = 1__3;
		//System.out.print(x);
		
		String fullPhoneNumber = "404-428-2460";
		StringBuilder sb = new StringBuilder(fullPhoneNumber);
		//System.out.println(sb.substring(0, 8)+"xxxx");
		//System.out.println(sb.replace(8, 12, "xxxx").toString());
		System.out.println(new StringBuilder("xxxx").insert(0, fullPhoneNumber, 0,8).toString());
	}
}
