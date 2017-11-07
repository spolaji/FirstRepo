package com.chapter.interfaces;

public class Implementation1Factory implements ServiceFactory {

	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		return new Implementation1();
	}

}
