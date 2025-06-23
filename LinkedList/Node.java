public class Node {
    private Node data;

    public Node(Node data) {
        this.data = data;
    }

    private Node next;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getData() {
        return data;
    }

    public void setData(Node data) {
        this.data = data;
    }
}


