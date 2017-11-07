package com.chapter.reusingclasses;

import static com.chapter.everythingisanobject.Print.*;

public class Detergent extends Cleanser {

	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); //Call base class version.
	}

	public void foam() {
		append(" foam()");
	}

	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		println(x);
		println("Testing base class: ");
	}

}	

class Cleanser {
    private String s = "Cleanser";
	
	public Cleanser() {
		s = "Cleanser";
	}
	public void append(String a) {
		s += a;
	}
	
	public void dilute() {
		append(" dilute()");
	}
	
	public void apply() {
		append(" apply()");
	}
	
	public void scrub() {
		append(" scrub()");
	}	
	
	public String toString() {
		return s;
	}
	
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		print(x);
	}
}	