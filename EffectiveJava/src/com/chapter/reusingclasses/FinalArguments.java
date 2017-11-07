package com.chapter.reusingclasses;

import static com.chapter.everythingisanobject.Print.*;

public class FinalArguments {

	void with(final Gizmo g) {
		//g = new Gizmo(); argument is final, must be blank.
	}

	void without(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}
	
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.without(null);
		bf.with(null);
	}
}

class Gizmo {
	public void spin() { 
		
	}
}
