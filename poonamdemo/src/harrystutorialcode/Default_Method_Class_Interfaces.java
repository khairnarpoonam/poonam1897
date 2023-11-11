package harrystutorialcode;

interface MyCamera{
	void takeSnap();
	void recordVideo();
	default void record4Kvideo() {
	    greet();
		System.out.println("Recording in 4K..");
	}
	private void greet() {
		System.out.println("Good Morning.");
	}
	
}
interface wifi{
	String[] getNetwork();
	void connectToNetwork(String network); 
}

class MycellPhone{
	void callNumber(long phonenumber) {
		System.out.println("calling"+phonenumber);
	}
	void pickcall() {
		System.out.println("connecting.....");
	}
	
}

class MySmartphone extends MycellPhone implements MyCamera,wifi{
	public void greet() {
		System.out.println("good evening");
	}
	public void takesnap() {
		System.out.println("Taking Snap");
	}
	public void recordvideo() {
		System.out.println("record Video ..");
	}
	//public void record4Kvideo() {
	//	System.out.println("Taking Snap and Record 4K....");
	//}
	public String[] getNetwork() {
		System.out.println("List of Network");
		String[] network= {"poonam","piyush","pranit","prashant"};
	    return network;
	}
	public void connectToNetwork(String network) {
		System.out.println("connecting" +network);
	}
	void callNumber(int phonenumber) {
		System.out.println("calling"+phonenumber);
	}
	void pickcall() {
		System.out.println("connecting.....");
	}
	
	
}
public class Default_Method_Class_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySmartphone ms=new MySmartphone();
		ms.takesnap();
		ms.recordvideo();
		ms.record4Kvideo();
		//ms.greet();    -->error because private access modifier
		String[] arr=ms.getNetwork();
        for(String item:arr) 
        	System.out.println(item);
        ms.connectToNetwork(" poonam");
        ms.callNumber(766688400);
        ms.pickcall();
        ms.greet();
	}

}








