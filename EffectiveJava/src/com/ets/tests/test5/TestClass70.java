package com.ets.tests.test5;

public class TestClass70 {
	   public void method(Object o){
	      System.out.println("Object Version");
	   }
	   public void method(java.io.FileNotFoundException s){
	      System.out.println("java.io.FileNotFoundException Version");
	   }
	   public void method(java.io.IOException s){
	      System.out.println("IOException Version");
	   }
	   public static void main(String args[]){
	      TestClass70 tc = new TestClass70();
	      tc.method(null);
	   }
}
