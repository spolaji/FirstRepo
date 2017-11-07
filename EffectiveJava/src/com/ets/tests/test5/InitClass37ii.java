package com.ets.tests.test5;

public class InitClass37ii {

    public static void main(String[] args) {
    	InitClass37ii obj = new InitClass37ii(5);
    }
        
    {j=30;i2=40;}
    int m;
    static int i1=5;
    static int i2;
    int j = 100;
    int x;
    public InitClass37ii(int m){
        System.out.println(i1+"/"+i2+"/"+x+"/"+j+"/"+m); //6/40/0/100/5
    }
    
    static{i1++;}
}