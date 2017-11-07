package com.ets.tests.test3;

class MyException extends Exception {}

public class TestClass24 {
	public void myMethod() throws Throwable {
		throw new MyException();
	}
}