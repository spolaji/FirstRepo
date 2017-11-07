package com.chapter.reusingclasses;

import static com.chapter.everythingisanobject.Print.*;

public class FinalOverridingIllusion {

	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		OverridingPrivate op = op2;
		//op.f(); //Not visible
		//op.g(); //Not visible
		WithFinals wf = op2;
		//wf.f(); //Not visible
		//wf.g(); //Not visible
	}

}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		println("OverridingPrivate2.f()");
	}
	
	public void g() {
		println("OverridingPrivate2.g()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		println("OverridingPrivate.f()");
	}
	
	private void g() {
		println("OverridingPrivate.g()");
	}
}

class WithFinals {
	private final void f() {
		println("WithFinals.f()");
	}
	
	private void g() {
		println("WithFinals.g()");
	}	
}