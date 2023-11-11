package harrystutorialcode;

public class Exception_Try_Catch_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=0;
		
		//Without try-catch
		//int c=a/b;
		//System.out.println("The result is " +c);
		
		//with try-catch
		try {
			int c=a/b;
			System.out.println("The result is " +c);
		}
		catch(Exception e){
			System.out.println("We failed to divide reason:");
			System.out.println(e);
		}
		System.out.println("exit the program");

	}

}
