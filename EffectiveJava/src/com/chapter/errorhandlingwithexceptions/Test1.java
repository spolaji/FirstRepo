package com.chapter.errorhandlingwithexceptions;

import java.io.FileNotFoundException;

public class Test1 {
	public static void main(String[] args) {

		try {
			AccessController.doPrivileged(new PrivilegedExceptionAction<FileNotFoundException>() {
					public void run() throws FileNotFoundException {

					}});
		} catch (FileNotFoundException f) { 
	
		}
	}
}	


interface PrivilegedExceptionAction<E extends Exception> {
    void run() throws E;
}

class AccessController {
    public static <E extends Exception>
    Object doPrivileged(PrivilegedExceptionAction<E> action) throws E {
         action.run();
        return "success";
    }
}
