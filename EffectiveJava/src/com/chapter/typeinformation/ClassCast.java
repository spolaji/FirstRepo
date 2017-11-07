package com.chapter.typeinformation;

import static com.chapter.everythingisanobject.Print.*;

public class ClassCast {

	public static void main(String[] args) {
		Building b = new House();
		Class<House> houseType = House.class;
		House h = houseType.cast(b);
		h = (House)b;

	}

}

class Building {
	
}

class House extends Building {
	
}
