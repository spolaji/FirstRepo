package com.chapter.polymorphism;

import static com.chapter.everythingisanobject.Print.*;

public class ReferenceCounting {
	
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = {new Composing(shared),new Composing(shared),
								 new Composing(shared),new Composing(shared),
								 new Composing(shared)
								 };
		
		for (Composing c : composing) 
			c.dispose();
	}
	
}

class Shared {
	private int  refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	
	public Shared() {
		println("Creating " + this);
	}
	
	public void addRef() {
		refcount++;
	}
	
	protected void dispose() {
		if(--refcount == 0)
			println("Dispose " +this);
	}
	
	public String toString() {
		return "Shared " +id;
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	
	public Composing(Shared shared) {
		println("Creating " +this);
		this.shared = shared;
		this.shared.addRef();
	}
	
	protected void dispose() {
		println("disposing " + this);
		shared.dispose();
	}
	
	public String toString() {
		return "Composing "+id;
	}
}
