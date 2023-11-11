package harrystutorialcode;

public class Method_Overriding {
	
class A{
	public int a;
	
	public int poonam() {
		return 3;
	}	
    public void meth2(int a) {
    	System.out.println("I am Method 2 of class A.");
       }

}

class B extends A{
	public void meth2() {
		System.out.println("I am Method 2 of class B.");
	}
		public void meth3() {
		System.out.println("I am Method 3 of class B.");	
		
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.meth2();
		
	
	}	
}
