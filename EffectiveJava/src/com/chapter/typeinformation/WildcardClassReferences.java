package com.chapter.typeinformation;

public class WildcardClassReferences {

	public static void main(String[] args) {
		Class<?> intClass = int.class;
		Object obj = intClass.getInterfaces();
		intClass = double.class;
	}

}
