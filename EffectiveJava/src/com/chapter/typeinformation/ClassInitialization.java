package com.chapter.typeinformation;

import static com.chapter.everythingisanobject.Print.*;

import java.util.Random;

public class ClassInitialization {
	public static Random rand = new Random(47);
	public static void main(String[] args) {
		Class initable = Initable.class;
		println("After creating Initable ref");
		println(Initable.staticFinal);
		println(Initable.staticFinal2);
		println(Initable2.staticNonFinal);
	}

}

class Initable {
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
	static {
		println("Initializing Initable");
	}
}

class Initable2 {
	static int staticNonFinal = 147;
	static {
		println("Initializing Initable2");
	}
}
