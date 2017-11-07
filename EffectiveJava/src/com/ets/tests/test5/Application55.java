package com.ets.tests.test5;

class CorbaComponent{
    String ior;
    CorbaComponent() { 
    	startUp("IOR"); 
    }
    
    void startUp(String s) { 
    	ior  =  s; 
    }
    
    void print() { 
    	System.out.println(ior); 
    }
}

class OrderManager extends CorbaComponent{
   OrderManager(){  }
   void startUp(String s) {  ior = getIORFromURL(s);   }
   String getIORFromURL(String s){  return "URL://"+s; }
}

public class Application55 {
   public static void main(String args[]) { 
	   start(new OrderManager()); 
   }
   
   static void start(CorbaComponent cc) { 
	   cc.print(); 
   }
}

