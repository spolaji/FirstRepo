package com.chapter.arrays;

import static com.chapter.everythingisanobject.Print.*;

import java.util.Arrays;

public class MultidimensionalPrimitiveArray {

	public static void main(String[] args) {
		int[][] a = {
				{1,2,3,},
				{4,5,6,},
		};
		println(Arrays.deepToString(a));

	}

}
