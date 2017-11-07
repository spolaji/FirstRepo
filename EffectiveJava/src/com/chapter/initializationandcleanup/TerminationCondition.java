package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class TerminationCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
	}

}

class Book {
	boolean checkedOut;
	
	Book(boolean checkOut) {
		checkedOut = checkOut;
	}
	
	void checkIn() {
		checkedOut = false;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		if(checkedOut){
			println("Error: checked out");
			super.finalize();
		}	
	}

}
