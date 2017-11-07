package com.chapter.everythingisanobject;

public final class Print {
	public static void println(Object o) {
		System.out.println(o);
	}
	public static void print(Object o) {
		System.out.print(o);
	}
	
	public static void printf(String s, Object... o) {
		System.out.printf(s, o);
	}
	
}
