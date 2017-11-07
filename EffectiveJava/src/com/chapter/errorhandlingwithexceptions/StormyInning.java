package com.chapter.errorhandlingwithexceptions;

import static com.chapter.everythingisanobject.Print.*;

public class StormyInning extends Inning implements Storm {

	public StormyInning() throws RainedOut, BaseballException {
		
	}
	
	public StormyInning(String s) throws Foul, BaseballException {
		
	}
	
	public void event() {
		
	}
	
	@Override
	public void rainHard() throws RainedOut {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atBat() throws Strike, Foul {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch (PopFoul e) {
			println("Pop Foul");
		} catch (RainedOut e1) {
			println("Rained Out");
		} catch (BaseballException e1) {
			println("Baseball Exception");
		}

	}	

}

class BaseballException extends Exception {
	
}

class Foul extends BaseballException {
	
}

class Strike extends BaseballException {
	
}

abstract class Inning {
	public Inning() throws BaseballException {
		
	}
	
	public void event() throws BaseballException {
		
	}

	public abstract void atBat() throws Strike, Foul;
	
	public void walk() {
		
	}
}

class StormException extends Exception {
	
}

class RainedOut extends StormException {
	
}

class PopFoul extends Foul {
	
}

interface Storm {
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}