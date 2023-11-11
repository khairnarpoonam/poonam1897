package poonamdemo;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//outer loop->row
		for(int i=1;i<=n;i++) {
			//inner loop->column
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
		System.out.println();
		}
	     /*for(int i=1;i<=n;i++) {
	    	 for(int j=1;j<=n-i+1;j++) {
	    		 System.out.print(j);
	    	 }
	    	 System.out.println();
	    	 }
		
           int number=1;
      for(int i=1;i<=n;i++) {
    	  for(int j=1;j<=i;j++) {
    		  System.out.print(number + " ");
    		  number++;
    	  }
    	  System.out.println(" ");
      }
     */
	}

}
