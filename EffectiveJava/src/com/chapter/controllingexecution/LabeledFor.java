package com.chapter.controllingexecution;

import static com.chapter.everythingisanobject.Print.*;
import static com.chapter.everythingisanobject.Range.*;

public class LabeledFor {
	public static void main(String[] args) {
		int i = 0;
		outer:
		for(; true ;) {
			inner:
			for(; i < 10; i++) {
				print("i = " +i + " ");
				if(i == 2) {
					print("continue");
					println(" ");
					continue;
				}
				
				if( i == 3) {
					print("break");
					i++;
					break;
				}
				
				if( i == 7) {
					print("continue outer");
					println(" ");
					i++;
					continue outer;
				}	
				
				if( i == 8) {
					print("break outer");
					println(" ");
					break outer;
				}				
				
				for(int k = 0; k < 5; k++) {
					if ( k == 3) {
						println("continue inner");
						println(" ");
						continue inner;
					}
				}
			}
		}
	}

}
