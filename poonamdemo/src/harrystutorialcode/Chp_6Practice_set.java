package harrystutorialcode;

public class Chp_6Practice_set {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
		//problem no.->1 Calculate the sum of array element
	/*   float[] calculate= {4.5f,8.5f,3.5f,2.5f,7.5f};
	     float sum=0;
	      for(int i=0;i<calculate.length;i++) {
			  //System.out.println(calculate[i]);
			sum += calculate[i];
		 }
		 System.out.println("sum of the array is: "  + sum);*/
//OR	
	/*	for(float element:calculate) {
			sum=sum+element;
		}
		System.out.println(sum);*/
	 
	//Problem no.->2 chech given no in arry or not 	 
		 
	/*int[] marks=new int[5];
	 marks[0]=88;
	 marks[1]=90;
	 marks[2]=84;
	 marks[3]=66;
	 marks[4]=73;
	 for(int i=0;i<marks.length;i++) {
			// System.out.println(marks[i]);
	 }
		if(marks[3]==66) {
		 System.out.println("Yes,this no.is in array.");
			 }
		 else {
		 System.out.println("No,this no.is not available in array");
	 }*/
//OR 
		/*int[] marks= {56,78,99,60,77};
		
		int num=77;
		boolean isInArray=false;
		  for(int element:marks) {
		   if(num==element) {
			isInArray=true;
			break;
		}	
	}
		if(isInArray) {
			System.out.println("this no is available in the arry");
		}
		else {
			System.out.println("this no.is not available in the array");
		}*/
		 		
		//Problem->1
		/*float[] marks= {68.3f,66.7f,90.8f,57.3f,77.2f};
		float sum=0;
		for(float element:marks) {//for each loop
			sum=sum+element;
		}
		 System.out.print(sum);*/

		
		//Problem no->2
		/* int [] marks= {56,78,99,100,45};
		 int num=70;
		 boolean isInArray=false;
		 for(int element:marks) {
			 if(num==element) {
				 isInArray=true;
				 break;
			 }
	    }
			 if(isInArray) {
				 System.out.println("number is in array."); 
			 }
			 else {
		          System.out.println("number is not  in array.");
			 }*/
		
		//Problem no->3
		/*int[] marks= {68,66,90,57,77};
		int sum=0;
		for(int element:marks) {//for each loop
			sum=sum+element;
		}
		 System.out.print("The value of average marks is:" + sum/marks.length);
*/
	   //problem->4
	int[][] mat1= {{4,5,2},
			       {5,8,5}};
	int[][] mat2= {{2,1,4},
		           {0,0,4}};
	int[][] result= {{0,0,0},
		            {0,0,0}};
	for(int i=0;i<mat1.length;i++) {
		for(int j=0;j<mat1[i].length;j++) {
			System.out.format("setting value of i=%d and j=%d\n",i,j);
			result[i][j]=mat1[i][j]+mat2[i][j];			
		}
			//System.out.println("");
	}
	for(int i=0;i<mat1.length;i++) {
		for(int j=0;j<mat1[i].length;j++) {
			System.out.print(result[i][j] +" " ) ;
			result[i][j]=mat1[i][j]+mat2[i][j];			
		}
			System.out.println(" ");
	}
	  //Problem no.->5
	int[] arr= {1,2,3,4,5,6};
	
	int l=arr.length;
	int n=Math.floorDiv(l, 2);//l=6/2=3half i goes then swap
	int temp;
	
	for(int i=0;i<n;i++) {
		//swap arr[i]=arr[l-i-1];
		//a   b   temp
	    //|4|  |3|   ||
		temp=arr[i];
		arr[i]=arr[l-i-1];
		arr[l-i-1]=temp;
	}
	for(int element:arr) {
		System.out.print(" "+ element);
	}
	
	//problem no.->6
	int[] values={22,56,444,11,8,100};
	int max=Integer.MIN_VALUE;//0
	for(int e:values) {
		if(e>max) {
			max=e;//e value new max me store kro
		}
	}
	System.out.print("The maximum value in this array is :" + max);
	
	//problem no.->7
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.MAX_VALUE);
	int[] arr1={22,56,444,11,8,100};
	int min=Integer.MAX_VALUE;//0
	for(int e:arr1) {
		if(e<min) {
			min=e;//e value new max me store kro
		}
	}
	System.out.print("The manimum value in this array is :" + min);
	
	//Problem no->8
	int[] arr2= {1,2,90,4,5,6};
	boolean isSorted=true;
	
	for(int i=0;i<arr2.length-1;i++) {
		if(arr2[i]>arr2[i+1]) {
			isSorted=false;
			break;
			}
	}
	
	if(isSorted) {
		System.out.println("This array is sorted.S");
	}
	else {
		System.out.println("This array is not sorted.");
	}
	
	
	}

}














