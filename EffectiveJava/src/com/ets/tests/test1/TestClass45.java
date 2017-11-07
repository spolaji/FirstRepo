package com.ets.tests.test1;

	class Base3 {
	   //public short getValue(){ return 1; } 
	}
	class Base4 extends Base3{
	   public byte getValue(){ return 2; } 
	}
	public class TestClass45 {
	   public static void main(String[] args){
	      Base3 b = new Base4();
	      System.out.println( ((Base4)b).getValue()); 
	   }
	}