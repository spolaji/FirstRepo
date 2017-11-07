package com.chapter.interfaces;

import static com.chapter.everythingisanobject.Print.println;

import com.chapter.polymorphism.Note;

public class Music4 {

	public static void main(String[] args) {
		Instruement[] orchestra = {
				new Wind(), new Percussion(),new Stringed(),new Brass(), new Woodwind() };
		tuneAll(orchestra);

	}
	
	public static void tuneAll(Instruement[] e) {
		for (Instruement i : e) {
			tune(i);
		}
	}
	
	public static void tune(Instruement i) {
		i.play(Note.MIDDLE_C);
	}

}

abstract class Instruement {
	public abstract void play(Note n);
	
	public String what() {
		return "Instrument";
	}
	
	public abstract void adjust();
}

class Wind extends Instruement {

	public void play(Note n ) {
		println("Wind.play() " +n);
	}
	
	public String what() {
		return "Wind";
	}

	public void adjust() {
		
	}
}

class Percussion extends Instruement {

	public void play(Note n ) {
		println("Percussion.play() " +n);
	}
	
	public String what() {
		return "Percussion";
	}

	public void adjust() {
		
	}
}

class Stringed extends Instruement {

	public void play(Note n ) {
		println("Stringed.play() " +n);
	}
	
	public String what() {
		return "Stringed";
	}

	public void adjust() {
		
	}
}

class Brass extends Wind {

	public void play(Note n ) {
		println("Brass.play() " +n);
	}
	
	public void adjust() {
		println("Brass.adjust() ");
	}
}

class Woodwind extends Wind {

	public void play(Note n ) {
		println("Woodwind.play() " +n);
	}
	
	public String what() {
		return "Woodwind";
	}
}