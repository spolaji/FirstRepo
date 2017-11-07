package com.chapter.arrays;

import static com.chapter.everythingisanobject.Print.*;
import java.util.*;

public class ContainerComparison {

	public static void main(String[] args) {
		BerylliumSphere[] spheres = new BerylliumSphere[10];
		for(int i = 0; i < 5; i++)
			spheres[i] = new BerylliumSphere();
		println(Arrays.toString(spheres));
		println(spheres[4]);
		
		List<BerylliumSphere> sphereList = new ArrayList<BerylliumSphere>();
	
		for(int i = 0; i < 5; i++)
			sphereList.add(new BerylliumSphere());
		println(sphereList);
		println(sphereList.get(4));
		
		int[] integers = {0,1,2,3,4,5};
		println(Arrays.toString(integers));
		println(integers[4]);
		
		List<Integer> intList = new ArrayList<Integer>(
				Arrays.asList(0,1,2,3,4,5));
		intList.add(97);
		println(intList);
		println(intList.get(4));
		
	
	}
}

class BerylliumSphere {
	private static long counter;
	private final long id = counter++;
	public String toString() {
		return "Sphere " + id;
	}
}
