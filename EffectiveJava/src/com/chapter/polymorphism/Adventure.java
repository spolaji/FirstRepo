package com.chapter.polymorphism;

import com.chapter.interfaces.CanFight;
import com.chapter.interfaces.CanFly;
import com.chapter.interfaces.CanSwim;

public class Adventure {
	public static void t(CanFight x) {
		x.fight();
	}
	
	public static void u(CanSwim x) {
		x.swim();
	}	
	
	public static void v(CanFly x) {
		x.fly();
	}
	
	public static void w(ActionCharacter x) {
		x.fight();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}

}

class ActionCharacter {
	public void fight(){
		
	}
}

class Hero extends ActionCharacter implements CanFight,CanSwim, CanFly {
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
}
