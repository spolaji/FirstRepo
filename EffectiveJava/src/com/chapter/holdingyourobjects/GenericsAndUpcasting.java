package com.chapter.holdingyourobjects;

import java.util.ArrayList;
import static com.chapter.everythingisanobject.Print.*;

public class GenericsAndUpcasting {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new GrannySmith());
		apples.add(new Braeburn());
		for(Apple a : apples)
			println(a);
	}

}

class GrannySmith extends Apple {
	public String toString() {
		return "GrannySmith object: " + id();
	}
}

class Gala extends Apple {
	public String toString() {
		return "Gala object: " + id();
	}	
}

class Fuji extends Apple {
	public String toString() {
		return "Fuji object: " + id();
	}		
}

class Braeburn extends Apple {
	public String toString() {
		return "Braeburn object: " + id();
	}	
}

