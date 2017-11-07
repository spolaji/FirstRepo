package com.chapter.polymorphism;

import static com.chapter.everythingisanobject.Print.*;

public class Square extends Shape {
	public void draw() {
		println("Square.draw()");
	}
	
	public void erase(){
		println("Square.erase()");
	}
}
