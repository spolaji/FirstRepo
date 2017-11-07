package com.chapter.typeinformation;

public class Individual {
	private String name;
	
	Individual(String name) {
		this.name = name;
	}
	
	Individual() {

	}
	
	public void id() {
		
	}
	
	public String toString() {
		if(name == null)
			try {
				return " " + Class.forName("Individual");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			return name;
		return name;

	}
}
