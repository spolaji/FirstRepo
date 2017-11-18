package com.ets.tests.test4;

public class Test69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sa = new String[10];
		//sa[0] = new Integer(10);
		Object[] oa = sa; 
		//oa[0] = new Integer(10); 
		((String[])oa) [0] = new String("abc");
	}

}
