package poonamdemo;

public class HollowRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int m=5;
		
		for(int i=1;i<=n;i++) {//outer loop=next line
			
			for(int j=1;j<=m;j++) {//inner loop=row print
			
				if(i==1||j==1||i==n||j==m) {//1 condition is true OR print
				    System.out.print("*");
			      }	
			     else {
			    	 System.out.print(" ");//space show
			     }
				}
		    System.out.println();//go to next line
		    }
	   }
}
