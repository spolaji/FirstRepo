package com.chapter.arrays;

import java.util.Objects;

public class ArrayOfGenericType<T> {
	T[] array;
	public ArrayOfGenericType(int size) {
		//array = new T[size];
		array = (T[])new Objects[size];
	}
}
