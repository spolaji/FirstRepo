package com.chapter.interfaces;

import static com.chapter.everythingisanobject.Print.*;

import java.util.Random;

public class RandomDoubles {
	public static Random rand = new Random(47);
	
	public double next() {
		return rand.nextDouble();
	}
	
	public static void main(String[] args) {
		RandomDoubles rd = new RandomDoubles();
		for(int i = 0; i < 7; i++) {
			println(rd.next() + " ");
		}

	}

}