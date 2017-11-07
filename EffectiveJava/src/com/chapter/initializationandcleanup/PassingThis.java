package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class PassingThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person().eat(new Apple());
	}

}

class Person {
	
	public void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		println("Yummy");
	}
	
}

class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}

class Peeler {
	
	static Apple peel(Apple apple){
		return apple;
	}
}
