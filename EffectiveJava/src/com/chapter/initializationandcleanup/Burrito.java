package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class Burrito {
	Spiciness degree;
	
	Burrito(Spiciness degree) {
		this.degree = degree;
	}
	
	public void describe() {
		print("This burrito is ");
		switch(degree) {
			case NOT:    println("not spicy at all.");
			             break;
			case MILD:
			case MEDIUM: println("a little hot.");
	                     break;	
			case HOT:  
			case FLAMING:
			default:    println("may be too hot.");
				
		}
	}
	
	public static void main(String[] args) {
		Burrito plain = new Burrito(Spiciness.NOT),
				greenChile = new Burrito(Spiciness.MEDIUM),
				jalapeno = new Burrito(Spiciness.HOT);
		plain.describe();
		greenChile.describe();
		jalapeno.describe();
	}

}
