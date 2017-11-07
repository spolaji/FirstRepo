package com.chapter.operators;

import static com.chapter.everythingisanobject.Print.*;

import java.util.Random;

public class MathOps {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int i, j, k;
		j = rand.nextInt(100) + 1;
		println("j: " + j);
		
		k = rand.nextInt(100) + 1;
		println("k: " + k);
		i = j % k;
		println("j / k: " + i);
	}

}
