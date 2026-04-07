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
        head.next.next.next.next = new Node_SIT(50);

        head.next.next.next.next.next = head.next; // Creating a cycle

        System.out.println("Linked List:");
        printList(head); // This will cause an infinite loop due to the cycle

        boolean hasCycle = detectCycle(head);
        if (hasCycle) {
            System.out.println("Cycle detected in the linked list.");
        } else {
            System.out.println("No cycle detected in the linked list.");
        }

    }

    private static boolean detectCycle(Node_SIT head) {
        Node_SIT slow = head;
        Node_SIT fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by 1
            fast = fast.next.next; // Move fast by 2

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle
    }
    private static void printList(Node_SIT head) {
        Node_SIT current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
