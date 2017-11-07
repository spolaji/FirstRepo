package com.ets.tests.test1;

public class MyClass2{
   public static void main(String args[]){
      char c;
      int i;
      c = 'a';
      i = c; 
      i++; 
      //c = i;  //Cannot convert from int to char, explicit cast is necessary. c = 65 a constant is OK.
      c++; 
   }
}

