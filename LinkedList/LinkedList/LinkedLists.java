package LinkedList;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(2,50);
        System.out.println(ll.contains(40));
//        Node head = deletehead(head);
//        Iterator<Integer> it = ll.iterator();
        Iterator<Integer> it = ll.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        public static Node deletehead(Node head ){
//            if(head== null) retrun head;
//            else{
//                head = head.getNext(head);
//
//            }
//            retrun head;
//        }



    }
}
