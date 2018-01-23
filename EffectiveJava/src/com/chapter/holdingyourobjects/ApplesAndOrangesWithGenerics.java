package com.chapter.holdingyourobjects;

import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i = 0; i < 3; i++)
			apples.add(new Apple());
		//apples.add(new Orange());
		for(int i = 0; i < apples.size(); i++) {
				System.out.println(apples.get(i));
				apples.get(i).id();
		}		
	}
}
