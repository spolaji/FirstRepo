package com.chapter.strings;

import static com.chapter.everythingisanobject.Print.*;

public class SimpleFormat {
	
	public static void main(String[] args) {
		int x = 5;
		double y = 5.332542;
		println("Row 1: [" + x + " " + y + "]");
		printf("Row 1: [ %d %f]", x , y);

	}

}
