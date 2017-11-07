package com.chapter.arrays;

import static com.chapter.everythingisanobject.Print.*;

public class GeneratorsTest {
	public static int size = 10;
	public static void test(Class<?> surroundingClass) {
		for(Class<?> type : surroundingClass.getClasses()) {
			println(type.getSimpleName());

				try {
					Generator<?> g = (Generator<?>)type.newInstance();
					for(int i = 0; i < size; i++)
						println(g.next() + " ");
					println(" ");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					throw new RuntimeException();
				}	
		}
	}
	public static void main(String[] args) {
		test(CountingGenerator.class);

	}

}
