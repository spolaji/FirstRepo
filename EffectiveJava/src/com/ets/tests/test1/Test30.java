package com.ets.tests.test1;

public class Test30 { 
	public static int[ ] getArray() {
		return new int[3];
	}
	
	public static void main(String[] args) {
		int index = 1;
		try{
			System.out.println(getArray()[index=2]++);
			
		} catch (Exception e){
			e.printStackTrace();
		}
		
		System.out.println("index = " + index);
	}
}
