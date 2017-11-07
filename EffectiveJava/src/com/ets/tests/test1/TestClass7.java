package com.ets.tests.test1;

public class TestClass7 {
    public void switchString(String input){
        switch(input){
            case "a" : System.out.println( "apple" );
            case "b" : System.out.println( "bat" );
                		break;
            case "B" : System.out.println( "big bat" );  
            default : System.out.println( "none" );
        }
    }

    public static void main(String[] args) throws Exception {
    	TestClass7 tc = new TestClass7();
        tc.switchString("B");
        tc.getTypeOfDayWithSwitchStatement("Monday");
    }

    public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
        String typeOfDay;
        switch (dayOfWeekArg) {
            case "Monday":
                typeOfDay = "Start of work week";
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay = "Midweek";
                break;
            case "Friday":
                typeOfDay = "End of work week";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                break;
            default:
                throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
        }

        return typeOfDay; 

    }
}

