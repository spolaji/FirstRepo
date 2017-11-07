package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;
	
public class StaticInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		println("Creating new Cupboard() in main");
		new Cupboard();
		println("Creating new Cupboard() in main");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);
	}
	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
}

class Bowl {
	Bowl(int marker) {
		println("Bowl(" + marker + ")");
	}
	
	void f1(int marker) {
		println("f1(" + marker +")");
	}
}

class Table {
	static Bowl bowl1 = new Bowl(1);
	Table() {
		println("Table()");
		bowl2.f1(1);
	}
	void f2(int marker) {
		println("f2(" +marker+ ")");
	}
	static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
	
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	
	Cupboard() {
		println("Cupboard()");
		bowl4.f1(2);
	}
	
	void f3(int marker) {
		println("f3(" +marker+ ")");
	}	
	
	static Bowl bowl5 = new Bowl(5);
}
