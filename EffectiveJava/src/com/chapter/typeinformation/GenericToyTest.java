package com.chapter.typeinformation;

import static com.chapter.everythingisanobject.Print.*;

public class GenericToyTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class<FancyToy> ftClass = FancyToy.class;
		FancyToy fancyToy = ftClass.newInstance();
		Class<? super FancyToy> up = ftClass.getSuperclass();
		//Class<Toy> up2 = up.newInstance();
		Object obj = up.newInstance();
		println(obj);
	}

}
