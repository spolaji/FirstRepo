package com.chapter.polymorphism;

import static com.chapter.everythingisanobject.Print.*;

public class Transmogrify {

	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}
}

class Stage {
	private Actor actor = new HappyActor();

	public void change() {
		actor = new SadActor();
	}
	
	public void performPlay() {
		actor.act();
	}
}

class Actor {
	public void act() {
		
	}
}

class HappyActor extends Actor {
	public void act() {
		println("HappyActor");
	}
}

class SadActor extends Actor {
	public void act() {
		println("SadActor");
	}
}