package com.chapter.errorhandlingwithexceptions;

import static com.chapter.everythingisanobject.Print.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
	private BufferedReader in;
	
	public InputFile(String fname) throws Exception {
		try {
			in = new BufferedReader(new FileReader(fname));
		} catch (FileNotFoundException e) {
			println("Could not open " +fname);
			throw e;
		} catch (Exception e) {
			try {
				println("Exception");
				in.close();
			} catch(IOException e2) {
				println("in.close() unsuccessful");
			}
			//throw e;
		} finally {
			println("finally");
		}
		
	}
	
	public String getLine() {
		String s;
		try {
			s = in.readLine();
		} catch(IOException e) {
			throw new RuntimeException("readLine() failed");
		}
		return s;
	}
	
	public void dispose() {
		try {
			in.close();
			println("dispose() successful");
		} catch(IOException e) {
			throw new RuntimeException("in.close() failed");
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputFile i = new InputFile("sample.txt");
	}

}
