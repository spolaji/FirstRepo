package com.chapter.polymorphism;

import static com.chapter.everythingisanobject.Print.*;

public class Circle extends Shape {
	public void draw() {
		println("Circle.draw()");
	}
	
	public void erase(){
		println("Circle.erase()");
	}

}