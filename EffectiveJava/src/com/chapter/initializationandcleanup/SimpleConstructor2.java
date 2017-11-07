package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class SimpleConstructor2 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			new Rock2(i);
		}
	}	
}

class Rock2 {
	Rock2(int i) {
		print("Rock " +i + " ");
	}
}
