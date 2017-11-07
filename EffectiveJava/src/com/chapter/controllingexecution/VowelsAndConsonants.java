package com.chapter.controllingexecution;

import static com.chapter.everythingisanobject.Print.*;

import java.util.Random;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			int c = rand.nextInt(26) + 'a';
			print((char)c + ", "+c+ ": ");
			switch(c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': print("vowel\n");
						 break;
				case 'y':
				case 'w': print("Sometimes a vowel\n");
				         break;
				default: print("consonant\n");         
			
			}
		}
	}

}
