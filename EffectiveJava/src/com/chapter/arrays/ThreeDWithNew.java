package com.chapter.arrays;

import static com.chapter.everythingisanobject.Print.println;

import java.util.Arrays;

public class ThreeDWithNew {

	public static void main(String[] args) {
		int[][][] a = new int[2][2][4];
		println(Arrays.deepToString(a));
		
		Integer[][] b = {//Autoboxing
				{1,2,3,4,5,6,7,8,9,10},
				{1,2,3,4,5,6,7,8,9,10},
				{1,2,3,4,5,6,7,8,9,10},
		};
		println(Arrays.deepToString(b));
		
	}

}
