class Node_SIT {
    int data;
    Node_SIT next;

    public Node_SIT(int data) {
        this.data = data;
        this.next = null;
    }
}


public class SIT_202 {
    public static void main(String[] args) {
        Node_SIT head = new Node_SIT(10);

        head.next = new Node_SIT(20);
        head.next.next = new Node_SIT(30);
        head.next.next.next = new Node_SIT(40);


    }
}
