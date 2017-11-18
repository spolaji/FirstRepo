package com.ets.tests.test4;

public class Test56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float f = null;
		try {
			f = Float.valueOf("12.3");
			String s = f.toString();
			int i = Integer.parseInt(s);
			System.out.println("i = "+i);
		} catch(Exception e){
			System.out.println("trouble : "+f);
		}
	}

}
