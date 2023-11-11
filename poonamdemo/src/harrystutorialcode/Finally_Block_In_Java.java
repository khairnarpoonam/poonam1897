package harrystutorialcode;

public class Finally_Block_In_Java {
	public static int cal() {
try{
	int a=10;
	int b=0;
	int c=a/b;
	return c;
	}
catch(Exception e) {
	System.out.println(e);
    }
finally {//finally is execute both time exception occured or not
	System.out.println("cleaning up resources this is the end of this function");
}
return -1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int k=cal();
		//System.out.println(k);
		int a=7;
		int b=0;
		while(true) {
			try {
				System.out.println(a/b);
			}
			catch(Exception e) {
				System.out.println(e);
				break;
			}
			finally {
				System.out.println("I am finally for value of b" +b);
			}
			b--;
		}
		try {       //try and finally used at a time
			System.out.println(50/3);
		}
		finally {
			System.out.println("yes this is finally");
		}

	}

}
