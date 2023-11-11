package harrystutorialcode;

class Practice13 extends Thread{
	public void run() {
	while(true) {
		System.out.println("Good Morning!");
	}
  }
}
class Practice13b extends Thread{
	public void run() {
		/*while(false){
		System.out.println("Welcome!");	
		/*try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}*/
	}
}

public class Chp_13_Practice_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Practice13 p=new Practice13();
     Practice13b p1=new Practice13b();
     
    // p.setPriority(3);   //set priority by user
    // p1.setPriority(5);
    // System.out.println(p.getPriority()); 5 //Default prioriry
     //System.out.println(p1.getPriority()); 5
     p.setPriority(Thread.MAX_PRIORITY); //syso print as per priority
     p1.setPriority(Thread.MIN_PRIORITY);
     System.out.println(p1.getState()); //thread state-NEW
    // p.start();
     p1.start();                        //Start
     System.out.println(p1.getState()); //thread state-RUNNABLE
     System.out.println(Thread.currentThread().getState());
     System.out.println(Thread.currentThread().getPriority());
    
	}

}
