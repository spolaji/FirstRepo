package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class SimpleEnumUse {

	public static void main(String[] args) {
		Spiciness howhot = Spiciness.MEDIUM;
		println(howhot);
		
		for(Spiciness s : Spiciness.values())
			println(s + ", ordinal" + s.ordinal());
	}
}
