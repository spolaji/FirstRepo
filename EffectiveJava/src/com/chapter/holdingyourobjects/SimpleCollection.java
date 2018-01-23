package com.chapter.holdingyourobjects;
import java.util.*;
import static com.chapter.everythingisanobject.Print.*;

public class SimpleCollection {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++)
			c.add(i);
		for(Integer i : c)
			print(i + ", ");
	}

}
