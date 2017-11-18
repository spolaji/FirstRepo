package com.ets.tests.test4;

class E1 extends Exception { 

}

class E2 extends E1 { 

}

public class Test62 {
	public static void main(String[] args){
		try{
			throw new E1();
		} catch(E2 e) {
			System.out.println("E1");
		} catch(Exception e) {
			System.out.println("E");
		} finally {
			System.out.println("Finally");
		}
	}
}
