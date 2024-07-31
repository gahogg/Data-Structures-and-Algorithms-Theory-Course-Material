// Recursion - Greg Hogg DSA Course Materials Lecture 6

public class Main {
    public static void main(String[] args) {
        int n = 12;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }

    // Fibonacci Sequence Calculation - O(2^n) time, O(n) space
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


public class Main {
    public static void main(String[] args) {
        SinglyNode head = createLinkedList();
        System.out.println("Reversed List:");
        reversePrint(head);
    }

    // Singly Linked List Node Definition
    static class SinglyNode {
        int val;
        SinglyNode next;

        SinglyNode(int val) {
            this.val = val;
            this.next = null;
        }

        public String toString() {
            return Integer.toString(val);
        }
    }

    // Create a Linked List
    public static SinglyNode createLinkedList() {
        SinglyNode head = new SinglyNode(1);
        head.next = new SinglyNode(3);
        head.next.next = new SinglyNode(4);
        head.next.next.next = new SinglyNode(7);
        return head;
    }

    // Reverse Print Linked List - O(n) time, O(n) space due to recursion
    public static void reversePrint(SinglyNode node) {
        if (node == null) return;
        reversePrint(node.next);
        System.out.println("Node value: " + node);
    }
}


