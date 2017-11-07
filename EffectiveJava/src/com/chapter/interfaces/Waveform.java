package com.chapter.interfaces;

import static com.chapter.everythingisanobject.Print.*;

public class Waveform {
	private static long counter;
	private final long id = counter++;
	
	public String toString() {
		return "Waveform " + id;
	}
	
}
