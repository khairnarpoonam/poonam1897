package harrystutorialcode;

class MyNewThr1 extends Thread{
	public void run() {
		int i=0;
		//while(true) {
		//System.out.println("I am Thread");
		System.out.println("Thank you");
		try {
			Thread.sleep(400);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	      //i++;
		}
    }
//}
class MyNewThr2 extends Thread{
	public void run() {
		while(true) {
		System.out.println("My Thank You");
	 }
   }
}
public class Thread_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MyNewThr1 t1=new MyNewThr1();
    MyNewThr2 t2=new MyNewThr2();
    t1.start();
    try {
    	t1.join();
    }
    catch(Exception e) {
    	System.out.println(e);
    }
    t2.start();
	}

}
