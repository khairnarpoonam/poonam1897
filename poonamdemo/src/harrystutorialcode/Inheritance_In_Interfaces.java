package harrystutorialcode;

interface SampleInterface{
	void meth1();
	void meth2();
}
interface ChildSampleInterface extends SampleInterface{
	void meth3();
	void meth4();
}
class MySampleClass implements ChildSampleInterface{
	public void meth1() {
		System.out.println("I am meth1");
	}
	public void meth2() {
		System.out.println("I am meth2");
	}
	public void meth3() {
		System.out.println("I am meth3");
	}
	public void meth4() {
		System.out.println("I am meth4");
	}
}

public class Inheritance_In_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		MySampleClass obj=new MySampleClass();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
		
	}

}
