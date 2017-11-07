package com.chapter.errorhandlingwithexceptions;

import static com.chapter.everythingisanobject.Print.*;

public class RethrowNew {

	public static void f() throws OneException {
		println("originating the exception in f()");
		throw new OneException("thrown from f()");
	}
	
	public static void main(String[] args) {
		try {
			try {
				f();
			} catch (OneException e) {
				println("Caught in inner try, e.printStackTrace()");
				e.printStackTrace(System.out);
				throw new TwoException("from inner try");
			}
		} catch (TwoException e) {
			println("Caught in out try, e.printStackTrace()");
			e.printStackTrace(System.out);
		}
	}

}

class OneException extends Exception {
	public OneException(String s) {
		super(s);
	}
}

class TwoException extends Exception {
	public TwoException(String s) {
		super(s);
	}
}
