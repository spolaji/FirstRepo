package com.chapter.holdingyourobjects;
import java.util.*;
import static com.chapter.everythingisanobject.Print.*;

public class AsListInterface {
	
	public static void displayIterator(Iterator<Snow> snow) {
		while(snow.hasNext()) {
			Snow s = snow.next();
			println(s);
		}
	}
	
	public static void displayListIterator(ListIterator<Snow> snow) {

		while(snow.hasNext()) {
			Snow s = snow.next();
			println(s);
		}
		
		while(snow.hasPrevious()) {
			Snow s = snow.previous();
			println(s +": "+snow.previousIndex());
		}		
	}	
	
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
		List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
		
		//display(snow1.iterator());
		//display(snow2.iterator());
		//display(snow3.iterator());
		//displayIterator(snow4.iterator());
		
		//display(snow1.iterator());
		//display(snow2.iterator());
		//display(snow3.iterator());
		displayListIterator(snow4.listIterator());		
	}
}

class Snow {
	public String toString() {
		return "Snow";
	}
}

class Powder extends Snow {
	public String toString() {
		return "Powder";
	}
}

class Light extends Powder {
	public String toString() {
		return "Light";
	}
}

class Heavy extends Powder {
	public String toString() {
		return "Heavy";
	}
}

class Crusty extends Snow {
	public String toString() {
		return "Crusty";
	}
}

class Slush extends Snow {
	public String toString() {
		return "Slush";
	}
}
