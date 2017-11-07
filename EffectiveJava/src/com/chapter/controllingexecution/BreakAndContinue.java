package com.chapter.controllingexecution;

import static com.chapter.everythingisanobject.Print.*;
import static com.chapter.everythingisanobject.Range.*;

public class BreakAndContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if( i == 74)
				break;
			if ( i % 9 != 0 )
				continue;
			print( i + " ");
		}
		println(" ");
		
		for (int i : range(100)) {
			if( i == 74)
				break;
			if ( i % 9 != 0 )
				continue;
			print( i + " ");
		}
	}
}
