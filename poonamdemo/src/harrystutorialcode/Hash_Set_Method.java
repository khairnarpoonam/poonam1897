package harrystutorialcode;

import java.util.HashSet;

public class Hash_Set_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   HashSet<Integer> myhashset=new HashSet<>(20,0.5f);
	   HashSet<Integer> myhashset1=new HashSet<>();
	   //myhashset1.add(500);
	   //myhashset1.add(700);
	   //myhashset1.add(800);
       myhashset.add(11);
       myhashset.add(78);
       myhashset.add(42);
       myhashset.add(14);
       myhashset.add(36);
       myhashset.size();
       //myhashset.clear();//o/p->[]
       System.out.println(myhashset.size());
       System.out.println(myhashset);
       System.out.println(myhashset.isEmpty());//false
       System.out.println(myhashset1.isEmpty());//true
       System.out.println(myhashset1);
      // System.out.println("Merging HashSet:"+myhashset.addAll(myhashset1));
      //myhashset.remove(42);
      //myhashset.remove(100);//100 is not in hashset class but did not give any exception
      //System.out.println("After removing element MyHashSet is: "+myhashset);
    }

}
