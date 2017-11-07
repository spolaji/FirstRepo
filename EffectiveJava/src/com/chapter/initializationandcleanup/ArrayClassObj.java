package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a;
		Random rand = new Random(47);
		a = new Integer[rand.nextInt(20)];
		println("length of a = " + a.length);
		for ( int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(500);
		}
		
		println(Arrays.toString(a));
	}

}
