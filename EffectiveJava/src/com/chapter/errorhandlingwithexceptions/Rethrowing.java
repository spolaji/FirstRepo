package com.chapter.errorhandlingwithexceptions;

import static com.chapter.everythingisanobject.Print.*;

public class Rethrowing {
	public static void f() throws Exception {
		println("originating the exception in f()");
		throw new Exception("thrown from f()");
	}
	
	public static void g() throws Exception {
		try {
			f();
		} catch(Exception e) {
			println("Inside g(), e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	
	public static void h() throws Exception {
		try {
			f();
		} catch(Exception e) {
			println("Inside h(), e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception)e.fillInStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			println("main: printStackTrack()");
			e.printStackTrace(System.out);
		}
		
		try {
			h();
		} catch (Exception e) {
			println("main: printStackTrack()");
			e.printStackTrace(System.out);
		}		

	}

}
