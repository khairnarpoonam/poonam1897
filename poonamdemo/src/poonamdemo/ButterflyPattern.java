package poonamdemo;

public class ButterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		
		//upper part
		for(int i=1;i<=n;i++) {
	    
			//1st part	
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			   }
			//spces
			
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++) {
			System.out.print(" ");
		     }
		
			//2nd part
		for(int j=1;j<=i;j++){
			System.out.print("*");
		   }
		
		System.out.println();
		}
		//lower part
	   
		for(int i=n;i>=1;i--) {
	
		   //1st part	
		
		   for(int j=1;j<=i;j++) {
		      System.out.print("*");
			}
					
		    int spaces=2*(n-i);
		for(int j=1;j<=spaces;j++) {
		   System.out.print(" ");
		 }
			
	   //2nd part
			for(int j=1;j<=i;j++){
			System.out.print("*");
	       }
			System.out.println();
		}
	}		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


