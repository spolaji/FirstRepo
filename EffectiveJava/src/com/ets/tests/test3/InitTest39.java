package com.ets.tests.test3;

public class InitTest39 {
	   static{
		      s1 = sM1("c");
		      
	   }
	   static String s1 = sM1("a");
	   {
	      s1 = sM1("b");
	      
	   }

	   
	   InitTest39() {
		   System.out.println("Constructor:" +s1);
	   }
	   
	   public static void main(String args[]){
	      InitTest39 it = new InitTest39 ();
	   }
	   private static String sM1(String s){
		   System.out.println("s1:" +s1);
		   System.out.println(s);  return s;
	   }
	}
