package harrystutorialcode;

import java.util.Scanner;

public class String_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name="Poonam";
//		String name1=new String("Piyush");
//		System.out.print(name);
//		System.out.println("The name is: " +name1);
		
//		int a=5;
//		float b=3.456788f;
//		System.out.printf("The value of a is %d and the value of b is %f :\n",a,b);
//		System.out.format("The value of a is %d and the value of b is %f :",a,b);
	
//	    Scanner sc=new Scanner(System.in);
//	    System.out.println("Enter your input string: ");
//	    String st=sc.next();
//	    String st1=sc.nextLine();
//	    System.out.println(st);
//	    System.out.println(st1);
		
//		String st=new String("Pranirt");
//		System.out.println(st.length());
//		System.out.println(st.substring(2));
//		System.out.println(st.substring(1, 4));
//		System.out.println(st.toUpperCase());
//		System.out.println(st.toLowerCase());
//		System.out.println(st.equalsIgnoreCase("pranit"));
//		System.out.println(st.repeat(3));		
//		System.out.println(st.replace('i', 'u'));
//		System.out.println(st.indent(5));
//		System.out.println(st.indexOf('n'));
//		System.out.println(st.indexOf("Pranit"));
//		System.out.println(st.indexOf("i",1));
//		System.out.println(st.lastIndexOf('r'));
//		System.out.println(st.lastIndexOf("r",2));
//		System.out.println(st.startsWith("Pra"));
//		System.out.println(st.endsWith("irt"));
//		System.out.println(st.charAt(2));
//		System.out.println(st.equals("Pranirt"));
//		
        String pihu="I am happy with my Familiy.";
        pihu=pihu.replace(" ", "_");
        System.out.println(pihu);
        
        String name="Dear <|name|> , Thanks a lot.";
        name=name.replace("<|name|>","Poonam");
        System.out.println(name);
		
	    String nontrim="  Piyush   ";
	    System.out.println(nontrim);
	    System.out.println("Trim String is:"+nontrim.trim());
	
	    String letter="Dear Poonam,\n\t This java course is nice. \n\t Thank you.";
	    System.out.println(letter);
	    
	}

}












