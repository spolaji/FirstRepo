package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class SimpleConstructor {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			new Rock();
		}
	}	
}

class Rock {
	Rock() {
		print("Rock ");
	}
}
