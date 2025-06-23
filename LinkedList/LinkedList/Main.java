package LinkedList;

public class Main {
    public static void main(String[] args) {
        Node ten = new Node(10);
        Node five = new Node(5);
        Node four = new Node(4);
        Node five2 = new Node(5);
        Node Head = ten;
//        ten.setData(10);
        ten.setNext(ten);
        ten.setNext(five);
        five.setNext(four);
        four.setNext(five2);
        five2.setNext(null);
        Head = insertAtHead(Head,6);
        printList(Head);

        Head = deleteNodeAtGead(Head);
        printList(Head);

       Head=  deleteNodeAtTail(Head);
       printList(Head);


//        ten.setNext(Head);
    }

//    public static  Node insertAtHead (Node head,int data){
//        Node nn = new Node(data);
//        nn.setNext(head);
//        if(head == null){
//            head = nn;
//        }
//        else {
//            nn.setNext(head);
//            head= nn;
//        }
//        return head;
//    }


    public static Node insertAtHead(Node head,int data){
        System.out.println("Printing head");
        Node nn = new Node(data);
        nn.setNext(head);
        if(head == null){
            nn= head;
        }
        else{
//            nn.setNext(head);
            head= nn;
        }
        return head;
    }
    public static Node deleteNodeAtGead(Node head){
        if(head != null){
            head = head.getNext();
            return head;
        }
        return head;
    }
    public static Node deleteNodeAtTail(Node head){
        if(head != null || head.getNext() == null){
            return null;
        }
        Node temp = head;
        while(temp.getNext().getNext() != null){
            temp = temp.getNext();
        }
        temp.getNext() = null;
        return head;
    }

    public static  void printList(Node head){
        System.out.println("Printing head");
        Node curr = head;
        while(curr != null){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }
}
