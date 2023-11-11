package harrystutorialcode;

public class Method_class {
	static void foo() {
		System.out.println("Good morning bro!");
	}
	static void foo(int a) {
		System.out.println("Good Morning" + a + "bro!");
	}
	static void foo(int x,int y) {
		System.out.println("Good morning" + x + "bro!");
		System.out.println("Good morning" + y + "bro!");
	}
	static void telljoke() {
		System.out.println("I invented a new world!\n" + "plagirism!");
	}
    static void change(int a) {//no change in array by using this method
      a=90;
    }
    static void change2(int[] arr) {
    	arr[0]=90;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		telljoke();//function call
        
		//changing the integer
		int[] marks={56,88,73,90,67};
        int x=56;
        change(x);//function call
        System.out.println("The value of X change after the running:" +x) ;
	
        //changing the array
        int[] marks1={56,88,73,90,67};
        change2(marks1);//function call
        System.out.println("The value of array change:" + marks1[0]);
	
        //overloading method
	    foo();//function call
	    foo(3000);//function call
	    foo(5000,6000);//function call
	}

}
