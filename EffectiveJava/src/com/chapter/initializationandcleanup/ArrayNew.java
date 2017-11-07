package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
	public static void main(String[] args) {
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		println("length of a = " + a.length);
		println(Arrays.toString(a));
	}
}
