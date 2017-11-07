package com.chapter.typeinformation;

import static com.chapter.everythingisanobject.Print.*;

public class ToyTest {
	
	static void printInfo(Class cc) {
		println("Class name: " + cc.getName() +
				" is interface? " + cc.isInterface());
		println("Simple name: " + cc.getSimpleName());
		println("Canonical name: " + cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
		Class c = null;
		try {
			//c = Class.forName("com.chapter.typeinformation.FancyToy");
			c = com.chapter.typeinformation.FancyToy.class;
		} catch(Exception e) {
			println("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for(Class face : c.getInterfaces())
			println(face);

		Class up = c.getSuperclass();
		Object obj = null;
		
		try {
			obj = up.newInstance();
		} catch (InstantiationException e) {
			println("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			println("IllegalAccessException");
			System.exit(1);
		}
	}

}

class Toy {
	
	Toy() {
		
	}
	
	Toy(int i) {
		
	}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	
	FancyToy() {
		super(1);
	}
	
	public void printToy() {
		println("Printin Toy");
	}
}

interface HasBatteries { }
interface Waterproof { }
interface Shoots { }