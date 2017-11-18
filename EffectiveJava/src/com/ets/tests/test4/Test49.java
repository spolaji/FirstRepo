package com.ets.tests.test4;

import java.util.ArrayList;

public class Test49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] test = new Object[]{ "aaa", new Object(), new ArrayList(), new String[]{""} };
		//test = new Object[]{ "aaa", new Object(), new ArrayList(), {} };
		test = new Object[]{ "aaa", new Object(), new ArrayList(), 10};
		throw new ArrayIndexOutOfBoundsException();
	}

}
