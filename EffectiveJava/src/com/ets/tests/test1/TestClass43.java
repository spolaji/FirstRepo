package com.ets.tests.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestClass43 {
	public static boolean checkList(List list, Predicate<List> p){
		return p.test(list);
	}
	
	public static void main(String[] args) {
		//boolean b = checkList(new ArrayList(), al -> al.isEmpty());
		boolean b = checkList(new ArrayList(), al -> al.add("Hello"));
		System.out.println(b);
	}
}
