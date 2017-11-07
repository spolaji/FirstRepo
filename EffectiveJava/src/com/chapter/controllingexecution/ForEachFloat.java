package com.chapter.controllingexecution;

import static com.chapter.everythingisanobject.Print.*;

import java.util.Random;

public class ForEachFloat {
	public static void main(String[] args) {
		Random rand = new Random(47);
		float f[] = new float[10];
		for(int i = 0; i < 10; i++) {
			f[i] = rand.nextFloat();
		}
		
		for(float x : f) {
			println(x);
		}	
	}

}
