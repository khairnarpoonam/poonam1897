package poonamdemo;

public class ZeroOnePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=5;
         int sum=0;
        for(int i=1;i<=n;i++) {
	   for(int j=1;j<=i;j++) {
		   sum=i+j;
		   if(sum%2==0) {
			   System.out.print(1);
		   }else {
			   System.out.print(0);
		   }
		   System.out.print(" ");
	    }
	   System.out.println();
      }  
	
	}

}