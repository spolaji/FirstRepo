package com.chapter.typeinformation;

import static com.chapter.everythingisanobject.Print.*;

import java.util.*;

public class ForNameCreator extends PetCreator {
	private static List<Class<? extends Pet>> types =
			new ArrayList<Class<? extends Pet>>();
	
	private static String[] typeNames = {
		"com.chapter.typeinformation.Mutt",
		"com.chapter.typeinformation.Pug",
		"com.chapter.typeinformation.EgyptianMau",
		"com.chapter.typeinformation.Manx",
		"com.chapter.typeinformation.Cymric",
		"com.chapter.typeinformation.Rat",
		"com.chapter.typeinformation.Mouse",
		"com.chapter.typeinformation.Hamster"
	};
	
	@SuppressWarnings("unchecked")
	private static void loader() {
		println("2");
			try {
				for(String name : typeNames)
				types.add((Class<? extends Pet>)Class.forName(name));
			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
	}
	
	public List<Class<? extends Pet>> types() {
		return types;
	}
	
	static {
		println("1");
		loader();
	}
	
	public static void main(String[] args) {
		ForNameCreator fn = new ForNameCreator();
		for(Class<? extends Pet> c : types)
			println(c.getName());

	}

}
