package com.chapter.interfaces;

public class CheckersFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new Checkers();
	}
}
