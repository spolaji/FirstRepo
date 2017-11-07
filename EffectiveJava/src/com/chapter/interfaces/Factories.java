package com.chapter.interfaces;

public class Factories {

		public static void serviceConsumer(ServiceFactory fact) {
			Service s = fact.getService();
			s.method1();
			s.method2();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		serviceConsumer(new Implementation1Factory());
		serviceConsumer(new Implementation2Factory());
	}

}
