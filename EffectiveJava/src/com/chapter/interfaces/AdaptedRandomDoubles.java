package com.chapter.interfaces;

import static com.chapter.everythingisanobject.Print.*;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomDoubles extends RandomDoubles implements Readable {

	private int count;
	public AdaptedRandomDoubles(int count) {
		this.count = count;
	}
	
	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count -- == 0)
			return -1;
		String result = Double.toString(next()) + " ";
		//println(result);
		cb.append(result);
		return result.length();
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedRandomDoubles(7));
		println(s.next() + " ");
		while(s.hasNextDouble())
			println(s.nextDouble() + " ");

	}	

}