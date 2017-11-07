package com.chapter.interfaces;

import static com.chapter.everythingisanobject.Print.*;

public class HighPass extends Filter {
	double cutoff;
	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}
	public Waveform process (Waveform input) {
		return input;
	}
	
}