package com.chapter.operators;

import static com.chapter.everythingisanobject.Print.*;

public class Assignment {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		println("1: t.level: " +t1.level +", t2.level: " +t2.level);
		t1 = t2;
		println("1: t.level: " +t1.level +", t2.level: " +t2.level);
		t1.level = 27;
		println("1: t.level: " +t1.level +", t2.level: " +t2.level);
		
	}
}
