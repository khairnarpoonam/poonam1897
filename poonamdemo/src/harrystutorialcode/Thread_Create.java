package harrystutorialcode;

class MyThread1 extends Thread{
	    public void run() {
		int i=0;
		while(i<40) {
			System.out.println("I am Thread1 cooking Thread is Running");
			System.out.println("I am Happy!");
			i++;
		}
	}
}
class MyThread2 extends Thread{
	public void run() {     //this method is in thread
		int i=0;
		while(i<40) {
			System.out.println("I am Thread2 chatting with her");
			System.out.println("I am sad!");
			i++;
		}
	}
}
public class Thread_Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1=new MyThread1();   //create class thread object
		MyThread2 t2=new MyThread2();
        
		t1.start();   //call run() method by using start()method
		t2.start();
	}

}
