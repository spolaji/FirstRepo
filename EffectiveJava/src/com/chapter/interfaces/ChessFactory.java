package com.chapter.interfaces;

public class ChessFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new Chess();
	}
}
