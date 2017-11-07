package com.chapter.polymorphism;

import static com.chapter.everythingisanobject.Print.*;

public class StaticPolymorphism {

	public static void main(String[] args) {
		StaticSuper sup = new StaticSub();
		println(sup.staticGet());
		println(sup.dynamicGet());
	}
}

class StaticSuper {
	public static String staticGet() {
		return "Base staticGet";
	}
	
	public  String dynamicGet() {
		return "Base dynamicGet";
	}	
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet";
	}
	
	public String dynamicGet() {
		return "Derived dynamicGet";
	}	
}
