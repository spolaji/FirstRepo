package com.ets.tests.test1;

public class TestClass5 {

	public static void main(String[] args) {
		 String mStr = "123";
		 long m = new Long(mStr);
		 System.out.println("new Long(mStr) : " + m);
		 m = Long.parseLong(mStr);
		 System.out.println("Long.parseLong(mStr) : " + m);
		 m = Long.valueOf(mStr).longValue();
		 System.out.println("Long.valueOf(mStr).longValue() : " + m);
	}

}
