package com.chapter.polymorphism;

import static com.chapter.everythingisanobject.Print.*;

public class Triangle extends Shape {
	public void draw() {
		println("Triangle.draw()");
	}
	
	public void erase(){
		println("Triangle.erase()");
	}
}