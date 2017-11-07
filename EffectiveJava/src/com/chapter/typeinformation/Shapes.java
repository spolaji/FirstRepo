package com.chapter.typeinformation;

import java.util.Arrays;
import java.util.List;

import static com.chapter.everythingisanobject.Print.*;

public class Shapes {

	public static void main(String[] args) {
		List<Shape> simpleList = Arrays.asList(new Circle(), new Square(), new Triangle());

		for (Shape s : simpleList)
			s.draw();
	}

}

abstract class Shape {
	void draw() {
		println(this + ".draw()");
	}
	
	abstract public String toString();
}

class Circle extends Shape {
	
	public String toString() {
		return "Circle";
	}
}

class Square extends Shape {
	
	public String toString() {
		return "Square";
	}
}

class Triangle extends Shape {
	
	public String toString() {
		return "Triangle";
	}
}
