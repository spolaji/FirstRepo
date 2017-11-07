package com.chapter.typeinformation;

import static com.chapter.everythingisanobject.Print.*;

public class SweetShop {

	public static void main(String[] args) {
		println("inside main");
		new Candy();
		println("After creating Candy");
		try {
			Class.forName("com.chapter.typeinformation.Gum");
		} catch (ClassNotFoundException e) {
			println("Couldn't find Gum");
		}
		println("After class.forName(\"Gum\")");
		new Cookie();
		println("After creating Cookie");
	}
}

class Choc {
	static {
		println("Loading Choc");
	}
	{
		println("instance block Choc");
	}
}
class Candy extends Choc {
	static {
		println("Loading Candy");
	}
	{
		println("instance block Candy");
	}
}

class Gum {
	static {
		println("Loading Gum");
	}
}

class Cookie {
	static {
		println("Loading Cookie");
	}
}