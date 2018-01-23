package com.chapter.holdingyourobjects;
import java.util.*;
import static com.chapter.everythingisanobject.Print.*;

public class AddingGroups {

	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer[] moreInts = {6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 11,12,13,14,15);
		for(Integer i : collection)
			print(i + ", ");
		println("");
		List<Integer> list = Arrays.asList(16,17,18,19,20);
		list.set(1,99);
		//list.add(21);
		for(Integer i : list)
			print(i + ", ");
	}

}