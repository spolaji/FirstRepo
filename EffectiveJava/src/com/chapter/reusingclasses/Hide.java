package com.chapter.reusingclasses;

import static com.chapter.everythingisanobject.Print.*;

public class Hide {

	public static void main(String[] args) {
		Bart b = new Bart();
		b.doh(1);
		b.doh('X');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}
}

class Bart extends Homer {
	void doh(Milhouse m) {
		println("Bart doh(Milhouse)");
	}
}

class Lisa extends Homer {
    void doh(Milhouse m) {
		println("Lisa doh(Milhouse)");
	}
}

class Homer {
	char doh(char c) {
		println("doh(char)");
		return 'd';
	}
	
	float doh(float f) {
		println("doh(float)");
		return 1.0f;
	}
}

class Milhouse{
	
}