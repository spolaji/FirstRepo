package com.chapter.interfaces;

import static com.chapter.everythingisanobject.Print.*;

public class Filter {
	
	public String name() {
		return getClass().getSimpleName();
	}
	
	public Waveform process (Waveform input) {
		return input;
	}
	
}
