package com.ets.tests.test1;

public class Test13 {
	public static void main(String[] args){
	      String hello = "Hello", lo = "lo";
	      //System.out.print((testPackage.Other.hello == hello) + " ");  
	      //System.out.print((other.Other.hello == hello) + " ");  
	      System.out.print((hello == ("Hel"+"lo")) + " ");      
	      System.out.print((hello == ("Hel"+lo)) + " ");     
	      System.out.println(hello == ("Hel"+lo).intern()); 
	}
}

