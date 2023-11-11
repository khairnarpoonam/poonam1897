package harrystutorialcode;
class MyThr1 extends Thread{
	public MyThr1(String name) {
		super(name);
	}
	public void run(){
		//int i=50;
		//System.out.println("Thank you");
		while(true) {
			System.out.println("Thank you "+ getName());
		}
	}
}
public class Java_Thread_Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MyThr1 t1=new MyThr1("Harry1");
	MyThr1 t2=new MyThr1("Harry2");
	MyThr1 t3=new MyThr1("Harry3");
	MyThr1 t4=new MyThr1("Harry4");
	MyThr1 t5=new MyThr1("Harry5(Most Priority)");
	t1.setPriority(Thread.MIN_PRIORITY);
	t2.setPriority(Thread.NORM_PRIORITY);
	t3.setPriority(Thread.NORM_PRIORITY);
	t4.setPriority(Thread.NORM_PRIORITY);
	t5.setPriority(Thread.MAX_PRIORITY);
     t1.start();
     t2.start();
     t3.start();
     t4.start();
     t5.start();
     
	}

}

