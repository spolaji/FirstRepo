package com.ets.tests.test4;

public class Test60 {
	/** 
	public static void main(String args[ ]){
	       if (args.length != 0)   
	    	   System.out.println(args[args.length-1]);
	 }
	 
	
	public static void main(String args[ ]){
		try {      
			System.out.println(args[args.length-1]);        
	    } catch (ArrayIndexOutOfBoundsException e) {    
	    	
	    }
	}
	
	
	public static void main(String args[ ]){
	     int i = args.length;
	     if (i != 0) 
	    	 System.out.println(args[i-1]);
	}
	
	
	public static void main(String args[ ]){
	    int i = args.length-1;
	   if (i > 0) System.out.println(args[i]);
	}
	*/
	
	 public static void main(String args[ ]){
		 try { 
			 System.out.println(args[args.length-1]); 
	     } catch (NullPointerException e) {
	    	 
	     }
	 }
}
