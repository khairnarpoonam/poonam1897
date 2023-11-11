package harrystutorialcode;

public class Resulting_Operator_Inc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//b+s=i or s+i=i
		/*byte a=56;
		short b=12;
		int c=a+b;
	    System.out.println(c);
	    System.out.println(b+c);*/
	   
	    //f+i=f or l+f=f
	    /*float f=12.5F;//12.5F or 12.5f
	    long l=345;
	    float f1=l-f;
	    int i=2;
	    float f2=12.5f*2;
	    System.out.println(f2);
	    System.out.println(f1);//ans 332.5*/
	    
        //c+i=i or s+c=int
	    /*char c='A';//A->value 65
	    int t=10;
	    int h=t*c;//10*A=10*65=650
	    short s=123;
	    int g=s+c;//123+A=123+65=188
	    System.out.println(h);//o/p->int 650
	    System.out.println(g);//o/p-> int 188*/
	    
	    //l+d=d or f+d=d
	   /* long l1=4444;
	    double d=104.756;
	    double d1=l1+d;
	    float f3=23.5f;
	    double d2=d-f3;
	    System.out.println(d1);
	    System.out.println(d2);*/
	    
	    //Increment and Decrement
	    int a=10;
	    System.out.println(a++);//10++ 11
	    System.out.println(++a);//12    ++11
	    System.out.println(a--);//12     
	    System.out.println(--a);//10
	     
	    
	    int y=7;
	    int x=++y*8;
	    System.out.println(x);
	    
	    char c='S';
	    c++;
	    ++c;
	    System.out.println(c);
	}

}
 