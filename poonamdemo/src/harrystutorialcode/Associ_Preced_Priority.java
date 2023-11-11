package harrystutorialcode;

public class Associ_Preced_Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=4;
		int b=8;
		int c=2;
		int d=((a+b)-(a%c)*a);
		int e=(b*b)-(4*a*c)/(2*a);//BODMASS->ans 60 and this expression is also 60
		System.out.println(d);
		System.out.println(e);*/
		
		
	   /* int x=10;
	    int y=2;
		//int z=x-y/2;// divide first->substaction->ans 9
        int z=(x-y)/2;//fust precedance is fun then divide ->ans 4
		System.out.println(z);*/
		
		
		int v=3;
		int u=2;
		int t=1;
		//int w=v*v-u*u;//ans->5
		//int w=(v*(v-u*v))/v;//ans->-3
		int w=u*(v-t);//ans->5
		//int w=(u+(u*v)-t)/v*t;//ans->2
		//int w=u*v*t%v-(u-t);
		//int w=(v--)*(u++);//ans->6->associativity right to left
		System.out.println(w);
	}

}
