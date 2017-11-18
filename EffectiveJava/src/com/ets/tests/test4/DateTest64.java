package com.ets.tests.test4;

import java.time.*;
import java.time.format.*;

public class DateTest64 {
	public static void main(String[] args){ 
		LocalDateTime greatDay = LocalDateTime.parse("2015-01-01");
		String greatDayStr = greatDay.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(greatDayStr);
	}
}
