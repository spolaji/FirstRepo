package com.ets.tests.test5;

public class TestClass20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A() ;
		B b = new B();
		
		Object o = a; Runnable r = (Runnable) o;
		Object o1 = b; Runnable r1 = (Runnable) b;
	}

}

class A implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	} 

}
class B extends A implements Observer { }

interface Observer {
	
}

