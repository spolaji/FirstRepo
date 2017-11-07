package com.chapter.strings;

import static com.chapter.everythingisanobject.Print.*;

public class IntegerMatch {

	public static void main(String[] args) {
		println("-1234".matches("-?\\d+"));
		println("1234".matches("-?\\d+"));
		println("+1234".matches("-?\\d+"));
		println("1234".matches("(-|\\+)?\\d+"));
	}

}
