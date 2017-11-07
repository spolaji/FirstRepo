package com.chapter.controllingexecution;

import static com.chapter.everythingisanobject.Print.*;

public class ListCharacters {
	public static void main(String[] args) {
		for(char c = 0; c < 128; c++){
			if(Character.isLowerCase(c))
				println("Value: " +(int)c + " character: " +c);
		}
	}
}
