package com.chapter.controllingexecution;

import static com.chapter.everythingisanobject.Print.*;
import static com.chapter.everythingisanobject.Range.*;

public class ForEachInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i : range(10))
			print(i + " ");
		println(" ");
		for(int i : range(5,10))
			print(i + " ");	
		println(" ");
		for(int i : range(5,20,3))
			print(i + " ");		
	}

}
