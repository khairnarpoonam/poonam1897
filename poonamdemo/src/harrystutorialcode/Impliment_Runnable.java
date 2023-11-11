package harrystutorialcode;

class MyThread implements Runnable{
	public void run() {
		int i=0;
		while(i<500) {
			System.out.println("I am Thread!");
			i++;
		}
	} 
}

//runnable interface vs extending threads
/*class MyThreadRunnable1 implements Runnable{
	public void run() {
		System.out.println("I am runnable Thread 1 not threat 1");
	}
}
class MyThreadRunnable2 implements Runnable{
	public void run() {
		System.out.println("I am runnable Thread 2 not threat 2");
	}
}*/
public class Impliment_Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      /* MyThreadRunnable1 bullet1=new MyThreadRunnable1();
       Thread gun1=new Thread(bullet1);
       
       MyThreadRunnable2 bullet2=new MyThreadRunnable2();
       Thread gun2=new Thread(bullet2);
       
       gun1.run();
       gun2.run();*/
		MyThread t=new MyThread();
		Thread th=new Thread(t);
		th.start();
       
	}

}
