package harrystutorialcode;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gregorian_Calendar_Class {

	public static void main(String[] args) {
	  // TODO Auto-generated method stub
    
	GregorianCalendar gcal=new GregorianCalendar();//concrete sub class
	Calendar c=Calendar.getInstance();//abstact class
	System.out.println(c.getTime());
	System.out.println("Time in my favourite form:" +c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
	System.out.println(gcal.getTime());
	gcal.roll(Calendar.MONTH,true);
	gcal.roll(Calendar.DATE, false);
	gcal.roll(Calendar.YEAR,true);
	
	}

}
