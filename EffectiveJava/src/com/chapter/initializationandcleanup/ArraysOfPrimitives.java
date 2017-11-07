package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class ArraysOfPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1,2,3,4,5};
		int[] a2;
		a2 = a1;
		for (int i = 0; i < a2.length; i++) {
			a2[i] = a2[i] + 1;
		}
		
		int index = 0;
		for (int a : a1) {
			println("a[" + index + "]: " + a);
			index++;
		}	
	}

}
