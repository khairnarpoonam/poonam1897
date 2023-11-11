package harrystutorialcode;

import java.util.Date;

public class Time_And_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE);
//		System.out.println(System.currentTimeMillis());
//Quize->ans->You can stored millisecond in long variable.	
		
		
		Date d=new Date();
		
		//All are Depricated method
//		System.out.println(d.getYear());//counting from the year 1900
//		System.out.println(d.getDate());//this method is depricated
//      System.out.println(d.getDay());//weekly days tell 
//	    System.out.println(d.getHours());//today's hours tell
//	    System.out.println(d.getMinutes());//today's minut after hours
//	    System.out.println(d.getSeconds());//seconds after minut
//	    System.out.println(d.getMonth());//month no.
	   
		//All are Running Method
		System.out.println(d.getTime());//upto the time start from 1970
	    System.out.println(d.clone());//date,day,time in hours-minut-sec
	   
	
	
	
	}
}