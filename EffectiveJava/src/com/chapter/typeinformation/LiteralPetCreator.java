package com.chapter.typeinformation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static com.chapter.everythingisanobject.Print.*;

public class LiteralPetCreator extends PetCreator{
	public static final List<Class<? extends Pet>> allTypes =
			Collections.unmodifiableList(Arrays.asList(
				Pet.class, Dog.class, Cat.class, Rodent.class,Mutt.class,Pug.class,
				EgyptianMau.class, Manx.class,Cymric.class,Rat.class,Mouse.class,
				Hamster.class
					));
	private static final List<Class<? extends Pet>> types =
			allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}

	public static void main(String[] args) {
		println(types);

	}
}
