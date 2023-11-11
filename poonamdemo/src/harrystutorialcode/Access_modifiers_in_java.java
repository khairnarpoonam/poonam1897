package harrystutorialcode;

class c1{
	public int a=4;
	protected int b=8;
    int c=1;           //default access modifiers
	private int d=2; //private access modifiers make gatters and setters
	
	public void meth1() {  //access all modifiers in the same class
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	int getD() {
		return d;
	}
	void setD(int d) {
		this.d = d;
	}
}
class c2 extends c1{
	int add(){
		int add=0;
		add=a+b+c;
		return add;
	}
}

public class Access_modifiers_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1 obj=new c1();
		obj.meth1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		//System.out.println(obj.d); //is not access in same package because it is private access modifier
		//obj.setD();
		System.out.println(obj.getD());
		
		c1 obj1=new c2();
        //System.out.println(obj1.add());
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.c);     //no execte but here execution is possible
        System.out.println(obj1.getD()); //is not execute in subclass because private access modifier
        
	}

}
