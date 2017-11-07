package com.ets.tests.test1;


class ABCD{
   int x = 10;
   static int y = 20;
   
   public static void foo() {
	   System.out.println("ABCD.foo()");
   }
}

class MNOP extends ABCD{
   int x = 30;
   static int y = 40;
   
   public static void foo() {
	   System.out.println("MNOP.foo()");
   }
}

public class TestClass23 {
   public static void main(String[] args) {
     System.out.println(new MNOP().x+", "+new MNOP().y );
     ABCD a = new MNOP();
     System.out.println(a.x+", "+a.y);
   }
}

