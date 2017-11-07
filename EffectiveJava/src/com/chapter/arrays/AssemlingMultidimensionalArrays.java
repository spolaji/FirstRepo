package com.chapter.arrays;

import static com.chapter.everythingisanobject.Print.println;

import java.util.Arrays;

public class AssemlingMultidimensionalArrays {

	public static void main(String[] args) {
		Integer[][] a;
		a = new Integer[3][];
		for(int i = 0; i < a.length; i++) {
			a[i] = new Integer[3];
			for(int j = 0; j < a[i].length; j++)
				a[i][j] = i * j;
		}
		println(Arrays.deepToString(a));
	}

}
