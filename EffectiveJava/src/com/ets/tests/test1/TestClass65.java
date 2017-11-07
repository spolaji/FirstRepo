package com.ets.tests.test1;

public class TestClass65 {

	public static void main(String[] args) { //throws Exception {
		// TODO Auto-generated method stub
		TestClass65 tc = new TestClass65();
		tc.myMethod();
		Integer i = new Integer(1);
		Long l = new Long(1);
		if(i.equals(l))
			System.out.println("Good");
		else
			System.out.println("Bad");
	}
	
	public void myMethod() {
		try {
			yourMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//throw new Exception();
		}
	
	}
	
	public void yourMethod() throws Exception {
		throw new Exception();
	}

}
