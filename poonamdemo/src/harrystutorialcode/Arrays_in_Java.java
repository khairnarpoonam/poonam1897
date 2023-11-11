package harrystutorialcode;

//access modifiers work in same package except private 
class c4{
	public int a=4;
	protected int b=8;
    int c=1;           //default access modifiers
	private int d=2;
}

public class Arrays_in_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int[] marks;//declaration
		marks=new int[5];//memory allocation

	marks[0]=78;//access array
	marks[1]=70;
	marks[2]=98;
	marks[3]=58;
	marks[4]=68;*/
	//for(int i=0;i<marks.length;i++) {//print index value using for loop
	//	System.out.println("sequense of marks: ");
	//System.out.println(marks[i]);
		
	//	for(int j=marks.length-1;j>=0;j--) {//print reverse index value using for loop
	//	   System.out.println("Revese order of marks: ");
	//		System.out.println(marks[j]);
	//	}
	//}
	 //       for(int element:marks) {
	   //     	System.out.println(element);
	     //   }
	        	
	/*System.out.println(marks.length);
    System.out.println(marks[0]);//print array
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println(marks[3]);
    System.out.println(marks[4]);*/
	
   /* String[] roll_no=new String[5];//declaration and memory alocation
	 
    roll_no[0]="Poonam";//array access
    roll_no[1]="Piyu";
    roll_no[2]="Panu";
    roll_no[3]="Prash";
    roll_no[4]="Om";
    System.out.println(roll_no.length);
    System.out.println(roll_no[4]);//print memory location
    System.out.println(roll_no[3]);
    System.out.println(roll_no[2]);
    System.out.println(roll_no[1]);
    System.out.println(roll_no[0]);*/
    
   /* float[] price ={80.5f,44.0f,60.6f,22.1f,45.5f};//declaration or initialize!
    String[] name= {"soap","shampoo","powder","handwash","toothpest"};
    
   System.out.print(price[0]);
   System.out.println("=" +name[0]);
   System.out.print(price[1]);
   System.out.println("=" +name[1]);
   System.out.print(price[2]);
   System.out.println("=" +name[2]);
   System.out.print(price[3]);
   System.out.println("=" +name[3]);
   System.out.print(price[4]);
   System.out.println("=" +name[4]);*/
		c4 object=new c4();
	    System.out.println(object.a);
	    System.out.println(object.b);
	    System.out.println(object.c);
	    //System.out.println(object.d);
   
		
		}

	
}
















