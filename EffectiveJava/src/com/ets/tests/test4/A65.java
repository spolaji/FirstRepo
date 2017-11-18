package com.ets.tests.test4;

public class A65 implements I1{
	String s;
	
	public void setValue( String val) { 
		s = val; 
	}
	
	public String getValue() { 
		return s; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("12345".charAt(6));
	}

}


interface I1{
	void setValue(String s);
	String getValue();
}
