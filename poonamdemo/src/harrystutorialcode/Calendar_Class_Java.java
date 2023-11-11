package harrystutorialcode;

import java.util.Calendar;

public class Calendar_Class_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calendar c=Calendar.getInstance();
     System.out.println("Current date is:" +c.getTime());
     System.out.println("Current Second is:" +c.get(Calendar.SECOND));
     System.out.println("Current minute is:" +c.get(Calendar.MINUTE));
     System.out.println("Current date is:" +c.get(Calendar.DATE));
     System.out.println("Current year is:" +c.get(Calendar.YEAR));
     System.out.println("Current day in a week:" +c.get(Calendar.DAY_OF_WEEK));
     System.out.println("Current day in a month:" +c.get(Calendar.DAY_OF_MONTH));
     System.out.println("Current day in week of month is:" +c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//	    System.out.println(c.get(Calendar.ALL_STYLES));
     System.out.println(c.clone());
     System.out.println(c.get(Calendar.HOUR_OF_DAY));
	    //System.out.println("date after 4 year"+c.add(Calendar.YEAR,4));
	 System.out.println("week in a year:"+c.getWeeksInWeekYear());
	 System.out.println("The maximum no.of weeks in a year:"+c.getMaximum(Calendar.WEEK_OF_YEAR));
	
	}

}
