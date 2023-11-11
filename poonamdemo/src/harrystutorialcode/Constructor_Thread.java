package harrystutorialcode;

class MyThr extends Thread{
	public MyThr(String name) {
		super(name);//extends thread name is execute here
	}
	public void run() {
		int i=34;
		System.out.println("Thank You");
		//while(true) {
			//System.out.println("I am a Thread");
		//}
	}
}

public class Constructor_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThr t1=new MyThr("Harry");
		MyThr t2=new MyThr("Ram");
		t1.start();
		System.out.println("The id of thread 1 is "+t1.getId());
		System.out.println("The name of thread 1 is "+t1.getName());
		t2.start();
		System.out.println("The id of thread 2 is "+t2.getId());
		System.out.println("The name of thread 2 is "+t2.getName());

	}

}
