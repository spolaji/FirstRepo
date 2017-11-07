package com.chapter.operators;

import static com.chapter.everythingisanobject.Print.*;

class Letter {
	char c;
}

public class PassObject {
	static void f(Letter y){
		y.c = 'z';
	}
	
	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		println("1: x.c: " +x.c);
		f(x);
		println("1: x.c: " +x.c);
	}
}
