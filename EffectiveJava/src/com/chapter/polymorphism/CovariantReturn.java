package com.chapter.polymorphism;

import static com.chapter.everythingisanobject.Print.*;

public class CovariantReturn {

	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		println(g);
		m = new WheatMill();
		g = m.process();
	}

}

class Grain {
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain {
	public String toString() {
		return "Wheat";
	}	
}

class Mill {

	Grain process() {
		return new Grain();
	}	

}

class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}

}
