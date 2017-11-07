package com.chapter.interfaces;

import static com.chapter.everythingisanobject.Print.*;

public class Checkers implements Game {
	private int moves = 0;
	private static final int MOVES = 3;
	
	@Override
	public boolean move() {
		println("Checkers move " + moves);
		return ++moves != MOVES;
	}

}
