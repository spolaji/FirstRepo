package com.ets.tests.test3;

import java.util.ArrayList;
import java.util.List;

public class ParseSource4 {
	int i;
	{
		i=20;
	}
	public static void main(String[] args) {	
		String s = new String("A");
		//s.charAt(index);
		int i = 90;
		double d = i;
		List s1 = new ArrayList( );
		try{
			while(true){
				s1.add("sdfa");
				new RuntimeException();
			}
		}catch(RuntimeException e){
			e.printStackTrace();
		}
		System.out.println(s1.size());
	}
}
