package com.chapter.everythingisanobject;

public final class Range {
	public static int[] range(int initial,int upto, int step) {
		int[] result = new int[(upto - initial) / step];
		for (int i = 0; i < result.length; i ++) {
			result[i] = initial + ( i * step); 
		}
		return result;
	}

	public static int[] range(int initial,int upto) {
		int[] result = new int[upto - initial];
		for (int i = 0; i < result.length; i ++) {
			result[i] = initial + i; 
		}
		return result;
	}
	
	public static int[] range(int upto) {
		int[] result = new int[upto];
		for (int i = 0; i < upto; i ++) {
			result[i] = i; 
		}
		return result;
	}	
}
