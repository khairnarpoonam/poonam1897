package harrystutorialcode;

import java.util.ArrayDeque;

public class ArrayDeque_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad1=new ArrayDeque<>();
		ArrayDeque<Integer> ad2=new ArrayDeque<>();
		ad1.add(10);
		ad1.add(20);
		ad1.add(30);
		ad1.add(40);
		ad1.add(50);
		
		ad2.add(100);
		ad2.add(500);
		ad2.add(200);
		
		  ad1.addAll(ad2);
//		  ad1.addFirst(8);//add elements front side of array
//        ad1.offerFirst(5);//add elements front side of array
//        ad1.addLast(55);//add elements back side of array
//        ad1.offerLast(60);//add elements back side of array
//        System.out.println(ad1);
//        System.out.println(ad1.getFirst());//access element front end
//        System.out.println(ad1.peekFirst());
//        System.out.println(ad1.getLast());//access element back end
//        System.out.println(ad1.peekLast());
		  System.out.println(ad1);
//        System.out.println(ad1.removeFirst());
//        System.out.println(ad1.pollFirst());
//        System.out.println(ad1.removeLast());
//        System.out.println(ad1.pollLast());
          //System.out.println(ad1.poll());//remove first element from array deque
	}

}
