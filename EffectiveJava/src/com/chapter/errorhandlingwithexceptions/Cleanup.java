package com.chapter.errorhandlingwithexceptions;

import static com.chapter.everythingisanobject.Print.println;

public class Cleanup {

	public static void main(String[] args) {
		try {
			InputFile in = new InputFile("Cleanup.java");
			try {
				String s;
				int i = 1;
				while((s = in.getLine()) != null);
			} catch(Exception e) {
				println("Caught Exception in main");
				e.printStackTrace();
			} finally {
				in.dispose();
			}

		} catch (Exception e) {
			println("InputFile construction failed");
		}

	}

}
