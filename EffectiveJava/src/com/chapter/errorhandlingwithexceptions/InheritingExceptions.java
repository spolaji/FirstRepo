package com.chapter.errorhandlingwithexceptions;

import static com.chapter.everythingisanobject.Print.*;

public class InheritingExceptions {
	public void f() throws SimpleException {
		println("Throw SimpleException from f()");
		throw new SimpleException();
	}
	
	public static void main(String[] args) {
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		} catch (SimpleException e) {
			println("Caught it!");
		}
	}

}

class SimpleException extends Exception {
	
}
