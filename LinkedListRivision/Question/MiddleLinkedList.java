public class MiddleLinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add at Last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Find Middle
    public String findMiddle() {
        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // move 1 step
            fast = fast.next.next;    // move 2 steps
        }
        return slow.data;
    }

    // Print list
    public void print() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MiddleLinkedList list1 = new MiddleLinkedList();
        list1.addLast("a");
        list1.addLast("b");
        list1.addLast("c");
        list1.addLast("d");
        list1.addLast("e");

        list1.print();   // a -> b -> c -> d -> e -> null

        System.out.println("Middle element: " + list1.findMiddle()); // c
    }
}
