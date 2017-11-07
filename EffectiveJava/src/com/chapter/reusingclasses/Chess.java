package com.chapter.reusingclasses;

import static com.chapter.everythingisanobject.Print.*;

public class Chess extends BoardGame {

	Chess() {
		super(11);
		println("Chess constructor");
	}
	
	public static void main(String[] args) {
		Chess x = new Chess();

	}

}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		println("BoardGame constructor");
	}
}

class Game {
	Game(int i) {
		println("Game constructor");
	}
}