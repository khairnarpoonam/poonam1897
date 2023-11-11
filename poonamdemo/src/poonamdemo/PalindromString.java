package poonamdemo;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String str=sc.next();
		String org_str=str;
		String rev="";
		int len=str.length();
		    
		for(int i=len-1;i>=0;i++) {
			   rev=rev+str.charAt(i);
		}
		    
		if(org_str.equals(rev)) {
			System.out.println(org_str+ "String is palindrom.");
		}   else {
			System.out.println(org_str+"String is not palindrom");
		}

	}

}
