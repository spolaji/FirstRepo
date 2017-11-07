package com.chapter.polymorphism;

public class Music {
	public static void tune(Instruement i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
	}

}
