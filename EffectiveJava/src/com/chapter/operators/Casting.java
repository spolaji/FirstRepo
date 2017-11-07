package com.chapter.operators;

import static com.chapter.everythingisanobject.Print.print;

public class Casting {
	
	void booleanTest(boolean x , boolean y) {
		print(x == y);
		print(x != y);
		print(x = x && y);
		print(x = x || y);
		print(x = x & y);
		print(x = x | y);
		print(x = x ^ y);
	}
	
	void charTest(char x , char y) {
//		print(x);
//		print(x = (char) (x * y));
//		print(x = (char) (x / y));
//		print(x = (char) (x % y));
//		print(x = (char) (x + y));
//		print(x = (char) (x - y));
		print(x ++);
		print(x);
		print(x --);
		print(x = (char) (x+y));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casting c = new Casting();
		//c.booleanTest(true , true);
		c.charTest('A', 'B');
	}
	

}
