package com.chapter.typeinformation;

import static com.chapter.everythingisanobject.Print.*;

public class GenericClassReferences {

	public static void main(String[] args) {
		Class initClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class;
		initClass = double.class;
		//genericIntClass = double.class;
	}

}
