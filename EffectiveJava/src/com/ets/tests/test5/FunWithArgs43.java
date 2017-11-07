package com.ets.tests.test5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;

public class FunWithArgs43 {
	public static void main(String[][] args) {
		
		for (String[] s : args)
			System.out.print(Arrays.deepToString(s));
		System.out.println();
				
	}
	
	public static void main(String[] args) {
		FunWithArgs43 fwa = new FunWithArgs43();
		String[][] newargs = {{"a","b","c"}};
		fwa.main(newargs);
		System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
		System.out.println(TemporalAdjusters.next(DayOfWeek.TUESDAY).adjustInto(LocalDate.now()));
		System.out.println(LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY)));
		System.out.println(LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()));
		int count = 0, sum = 0;
		do{
		       if(count % 3 == 0) 
		    	   continue;
		       sum+=count;
		       System.out.print(count + " ");
		}
		while(count++ < 11);
		System.out.println(sum);
		
	}
}

