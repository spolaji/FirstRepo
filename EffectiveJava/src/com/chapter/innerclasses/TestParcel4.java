package com.chapter.innerclasses;

public class TestParcel4 {

	public static void main(String[] args) {
		Parcel4 p = new Parcel4();

		Contents c = p.contents();
		Destination d = p.destination("Tassmania");
		//Parcel4.PContents pc = p.new PContents();

	}

}
