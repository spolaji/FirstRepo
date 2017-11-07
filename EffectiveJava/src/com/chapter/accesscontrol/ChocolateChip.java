package com.chapter.accesscontrol;

import static com.chapter.everythingisanobject.Print.println;

public class ChocolateChip extends Cookie {

	public ChocolateChip() {
		println("ChocolateChip constructor");
	}
	
	public void chomp() {
		bite();
	}
	
	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();

	}

}
