package com.ets.tests.test1;

class Base {
	public Object getValue(){ return new Object(); } 
}

class Base2 extends Base {
	public String getValue(){ return "hello"; } 
}

public class TestClass21 {
	public static void main(String[] args){
		Base b = new Base2();
		System.out.println(b.getValue()); 
	}
}
