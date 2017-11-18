package com.ets.tests.test2;

class MyException extends Throwable {
}

class MyException1 extends MyException {
}

class MyException2 extends MyException {
}

class MyException3 extends MyException2 {
}

public class ExceptionTest4 {
	void myMethod() throws MyException {
		throw new MyException3();
	}

	public static void main(String[] args){
		ExceptionTest4 et = new ExceptionTest4();
		try{
			et.myMethod();
			
		} catch(MyException3 me3){
			
			System.out.println("MyException3 thrown");
			//return;
		} catch(MyException me){
			System.out.println("MyException thrown");
			
		} finally {
			System.out.println(" Done");
		}
		System.out.println(" After final");
 	}
}

