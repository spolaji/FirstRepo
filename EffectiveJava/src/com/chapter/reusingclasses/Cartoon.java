package com.chapter.reusingclasses;

import static com.chapter.everythingisanobject.Print.*;

public class Cartoon extends Drawing {
	public Cartoon() {
		println("Cartoon constructor");
	}
	
	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}

}

class Drawing extends Art {
	Drawing() {
		println("Drawing constructor");
	}
}

class Art {
	Art() {
		println("Art constructor");
	}
}