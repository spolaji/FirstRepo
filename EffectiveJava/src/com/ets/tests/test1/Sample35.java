package com.ets.tests.test1;

public class Sample35 implements IInt{
    //int thevalue = 30;
	public static void main(String[] args){
		Sample35 s = new Sample35();
		int j = s.thevalue;
		int k = IInt.thevalue;
		int l = thevalue;
	}
}

interface IInt{
	int thevalue = 0;
}

