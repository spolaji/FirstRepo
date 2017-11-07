package com.chapter.initializationandcleanup;

import static com.chapter.everythingisanobject.Print.*;

public class PrimitiveOverloading {

	void f1(char x) {println("f1(char) ");}
	void f1(byte x) {println("f1(byte) ");}
	void f1(short x) {println("f1(short) ");}
	void f1(int x) {println("f1(int) ");}
	void f1(long x) {println("f1(long) ");}
	void f1(float x) {println("f1(float) ");}
	void f1(double x) {println("f1(double) ");}
	
	void f2(byte x) {println("f2(byte) ");}
	void f2(short x) {println("f2(short) ");}
	void f2(int x) {println("f2(int) ");}
	void f2(long x) {println("f2(long) ");}
	void f2(float x) {println("f2(float) ");}
	void f2(double x) {println("f2(double) ");}	

	void f3(short x) {println("f3(short) ");}
	void f3(int x) {println("f3(int) ");}
	void f3(long x) {println("f3(long) ");}
	void f3(float x) {println("f3(float) ");}
	void f3(double x) {println("f3(double) ");}	

	void f4(int x) {println("f4(int) ");}
	void f4(long x) {println("f4(long) ");}
	void f4(float x) {println("f4(float) ");}
	void f4(double x) {println("f4(double) ");}	
	

	void f5(long x) {println("f5(long) ");}
	void f5(float x) {println("f5(float) ");}
	void f5(double x) {println("f5(double) ");}	
	
	void f6(float x) {println("f6(float) ");}
	void f6(double x) {println("f6(double) ");}	
	
	void f7(double x) {println("f7(double) ");}		
	
	
	void testConstVal() {
		println("5: ");
		f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5);
	}
	
	void testChar() {
		char x = 'x';
		println(" char: ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	
	void testByte() {
		byte x = 0;
		println(" byte: ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}	

	void testShort() {
		short x = 0;
		println(" short: ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}	
	
	void testInt() {
		int x = 0;
		println(" int: ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	
	void testLong() {
		long x = 0;
		println(" long: ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}	
	
	void testFloat() {
		float x = 0;
		println(" float: ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	
	void testDouble() {
		double x = 0;
		println(" double: ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimitiveOverloading p = new PrimitiveOverloading();
		//p.testConstVal();
		//p.testChar();
		//p.testByte();
		//p.testShort();
		//p.testInt();
		//p.testLong();
		//p.testFloat();
		p.testDouble();
	}

}
