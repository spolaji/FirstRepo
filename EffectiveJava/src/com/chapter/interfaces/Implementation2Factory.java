package com.chapter.interfaces;

public class Implementation2Factory implements ServiceFactory {

	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		return new Implementation2();
	}

}
