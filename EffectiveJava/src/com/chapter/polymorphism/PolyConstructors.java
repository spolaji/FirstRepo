package com.chapter.polymorphism;

import static com.chapter.everythingisanobject.Print.*;

public class PolyConstructors {
	
	public static void main(String[] args) {
		new RoundGlyph(5);
	}

}

class RoundGlyph extends Glyph {
	private int radius = 1;
	
	RoundGlyph(int r) {
		radius = r;
		println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	
	void draw() {
		println("RoundGlyph.draw() = " + radius);
	}
	
}

class Glyph {
	
	void draw() {
		println("Glyph.draw()");
	}
	
	Glyph() {
		println("Glyph() before draw()");
		draw();
		println("Glyph() after draw()");
	}


}
