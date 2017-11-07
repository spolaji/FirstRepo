package com.chapter.interfaces;

import static com.chapter.everythingisanobject.Print.*;

public class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;
	
	@Override
	public boolean move() {
		println("Chess moves " + moves);
		return ++moves != MOVES;
	}
}
