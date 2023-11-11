package harrystutorialcode;

public class Multidimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][]flat=new int[2][3];
       flat[0][0]=100;
       flat[0][1]=101;
       flat[0][2]=102;
       flat[1][0]=110;
       flat[1][1]=111;
       flat[1][2]=112;
       System.out.println(flat.length);//[i]=2
      /* System.out.println(flat[0][0]);
       System.out.println(flat[0][1]);
       System.out.println(flat[0][2]);
       System.out.println(flat[1][0]);
       System.out.println(flat[1][1]);
       System.out.println(flat[1][2]);*/
       
       //display 2D array using for loop
       for(int i=0;i<flat.length;i++) {
    	   for(int j=0;j<flat[i].length;j++) {//flat[i].length indicate row first row 0 ke element print kro then row 1 ke liye element print kro
    		   System.out.print(flat[i][j]);
    		   System.out.print(" ");
    	   }
    	   System.out.println(" ");
       }
       
       
       
       
    		   }

}
