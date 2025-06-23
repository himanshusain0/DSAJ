//  static class Node {
//     int data ;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//     }
    
// }
public class Linke {
     static class Node {
    int data ;
    Node next;

    public Node(int data) {
        this.data = data;
    }
    
}

    public static Node convertArrayToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover =  head;
        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover  = temp;
         }
         return  head;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp =  temp.next;
        }
    }

    public  static Node deleteNodeTail(Node head){
        if(head == null || head.next==null){
            return head;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next =null;
        return head;
    }
    public static Node deleteNodeAtHead(Node head){
        if(head != null){
            head = head.next;
            return head;
        }

        return head;
    }
    public static Node insertHead(Node head ,int data){
        Node temp = new Node(data);
        if(head == null) return head;
        else{
            temp.next = head;
            head = temp;
        }
        return head;
    }
    public static Node insertTail(Node head, int data){
        Node temp = new Node(data);
        if(head == null){
           
            return temp;
        }
        Node temp1 = head;
        while(temp1.next != null ){
            temp1 = temp1.next;
        }
        temp1.next = temp;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7};
        Node head  = convertArrayToLL(arr);
        display(head);
        // System.out.println( "Head is this"+head.data);
        // head =  deleteNodeTail(head);
        // System.out.println();
        // display(head);
        // System.out.println( "Head is this"+head.data);
        head= deleteNodeAtHead(head);
        head= deleteNodeAtHead(head);
        head= deleteNodeAtHead(head);
        head= deleteNodeAtHead(head);
        head= deleteNodeAtHead(head);


        System.out.println();
        display(head);
        // System.out.println( "Head is this"+head.data);
        // head=insertHead(head,10);
        // System.out.println();
        // display(head);
        head = insertTail(head,39);
        System.out.println();
        display(head);
    }
}
