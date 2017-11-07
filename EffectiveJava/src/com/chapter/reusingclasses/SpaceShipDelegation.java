package com.chapter.reusingclasses;

import static com.chapter.everythingisanobject.Print.*;

public class SpaceShipDelegation {
	private String name;
	public SpaceShipControls control = new SpaceShipControls();
	
	public SpaceShipDelegation(String name) {
		this.name = name;
	}
	
	public void back(int velocity) {
		control.back(velocity);
	}
	
	public void forward(int velocity) {
		control.forward(velocity);
	}	
	
	public static void main(String[] args) {
		SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
		protector.forward(100);

	}

}
