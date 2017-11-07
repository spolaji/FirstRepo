package com.ets.tests.test1;

public class OrderTest15 {
	public void initData(String[] arr){
		int ind = 0;
		for(String str : arr){
			str.concat(str+ " "+ind);
			ind++;
		}
	}
	
	public void printData(String[] arr){
		for(String str : arr){
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		OrderTest15 ot = new OrderTest15();
		String[] arr = new String[2];
		ot.initData(arr);
		ot.printData(arr);
	}
}
