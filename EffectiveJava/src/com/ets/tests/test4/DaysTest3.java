package com.ets.tests.test4;

public class DaysTest3{

	static String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };

	public static void main(String[] args) {
		int i1 = 1, i2 = 2, i3 = 3;
		int i4 = i1 + (i2=i3 );
		System.out.println(i4);
		int index = 0;
		for(String day : days){
	
			if(index > 3){
				break;
			}else {
				continue;
			}
			/**index++;
			if(days[index].length() > 3){
				days[index] = day.substring(0,3);
			} */
		}
		
		System.out.println(days[index]);
}
}
