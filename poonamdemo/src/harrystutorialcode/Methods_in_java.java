package harrystutorialcode;

public class Methods_in_java {
	 int logic(int x ,int y) {
		int z;
		if(x>y) {
			z=x+y;
		}
		else {
			z=(x+y)*5;
		}
	//	x=12; if we change the value of any variable in main method it can not be affect on o/p.
      return z;
      	}    
     
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=3;
		int c;
//Method invocation	->static word not used or create object then call 	
		Methods_in_java obj=new Methods_in_java();
		c=obj.logic(a, b);
		//c= logic(a,b);->static word used then call metod like this.
		System.out.println(c);
      
        int a1=8;
        int b1=9;
        int c1;
        Methods_in_java object=new Methods_in_java();
        c1=object.logic(a1, b1);
        //c1=logic(a1,b1);
        System.out.println(c1);
	
	
	
	
	
	
	}

}





