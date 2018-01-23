package com.chapter.holdingyourobjects;
import java.util.*;

public class ApplesAndOrangesWithoutGenerics {

	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for(int i = 0; i < 3; i++)
			apples.add(new Apple());
		apples.add(new Orange());
		for(int i = 0; i < apples.size(); i++)
			if(apples.get(i) instanceof Apple) {
				System.out.println(apples.get(i));
				((Apple)apples.get(i)).id();
			}
		}
}

class Apple {
	
	private static long counter;
	private final long id = counter++;
	public long id() {
		return id;
	}
	public String toString() {
		return "Apple object: " + id();
	}
}

class Orange {
	
}
