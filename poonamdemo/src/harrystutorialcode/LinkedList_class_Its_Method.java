package harrystutorialcode;

import java.util.LinkedList;

public class LinkedList_class_Its_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<>();
		LinkedList<Integer> l2=new LinkedList<>();
		l2.add(11);
		l2.add(12);
		l2.add(13);
		l2.add(14);
		l2.add(15);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(2);
		l1.add(0,5);//add 0 index 5
		System.out.println("linkedlist l1 is as:" +l1);
		System.out.println("linkedList l2 is as:" +l2);
		//l1.remove(2);
		//System.out.println("after removing" +l1);//remove 2
		//System.out.println("value 6 is in linkedlist: " +l1.contains(6) );//false
		//System.out.println("Value 4 is in linkedlist: " +l1.contains(4));//true
		//l1.addAll(l2);//merge l1 or l2
		//System.out.println(l1);//l1 linked first then l2 print
		//l1.addAll(0,l2);//merge l1 or l2 
		//System.out.println("after merge "+l1);//l2 linked first then l1
		//System.out.println("index of 2 is "+l1.indexOf(2));//2 is in 1 at first
        //System.out.println("last index of 2 is "+l1.lastIndexOf(2));//2 is in 4 at last
        //l1.clear();
        //System.out.println("clear linked list" +l1);//[]empty linked
        //l1.set(0,8);
        //System.out.println(l1);
		l1.add(1,100);
		System.out.println("add element in linked list:" +l1);
		l1.addFirst(20);
		System.out.println("add element in linked list:" +l1);
		l1.addLast(30);
		System.out.println("add element in linked list:" +l1);
	    System.out.println("Size of l1 is:"+l1.size());
	}

}
