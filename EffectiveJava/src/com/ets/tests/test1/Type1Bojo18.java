package com.ets.tests.test1;

interface Bozo{
	int type = 0;
	public void jump();
}

public class Type1Bojo18 implements Bozo{
	public Type1Bojo18(){
		//type = 1;
	}
	public void jump(){
		System.out.println("jumping..."+type);
	}
	public static void main(String[] args){
		Bozo b = new Type1Bojo18();
		b.jump();
	}
}