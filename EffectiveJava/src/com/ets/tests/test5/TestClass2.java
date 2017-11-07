package com.ets.tests.test5;

class MyException extends Exception {}
public class TestClass2 {
   public static void main(String[] args) {
      TestClass2 tc = new TestClass2();
      try{
         tc.m1();
      }
      catch (MyException e){
         try {
			tc.m1();
		} catch (MyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      }
      finally{
         tc.m2();
      }
   }
   public void m1() throws MyException{
      throw new MyException();
   }
   public void m2() throws RuntimeException{
      throw new NullPointerException();
   }
}
