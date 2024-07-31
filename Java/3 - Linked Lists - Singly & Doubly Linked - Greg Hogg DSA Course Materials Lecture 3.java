// Linked Lists - Singly & Doubly Linked - Greg Hogg DSA Course Materials Lecture 3


// Singly Linked Lists

class SinglyNode {
    int val;
    SinglyNode next;

    SinglyNode(int val, SinglyNode next) {
        this.val = val;
        this.next = next;
    }

    SinglyNode(int val) {
        this(val, null);
    }

    public String toString() {
        return Integer.toString(val);
    }
}

public class Main {
    public static void main(String[] args) {
        SinglyNode head = new SinglyNode(1);
        SinglyNode A = new SinglyNode(3);
        SinglyNode B = new SinglyNode(4);
        SinglyNode C = new SinglyNode(7);

        head.next = A;
        A.next = B;
        B.next = C;

        System.out.println("Head of the list: " + head); // Output: 1

        // Traverse the list - O(n)
        SinglyNode curr = head;
        System.out.println("Traversing the singly linked list:");
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();

        // Display linked list - O(n)
        display(head);

        // Search for node value - O(n)
        int searchValue = 7;
        boolean found = search(head, searchValue);
        System.out.println("Search for value " + searchValue + " in list: " + found);

        // Doubly Linked Lists
        DoublyNode headD = new DoublyNode(1);
        DoublyNode tailD = headD;
        System.out.println("Head of the doubly linked list: " + tailD); // Output: 1

        // Display - O(n)
        display(headD);

        // Insert at beginning - O(1)
        headD = insertAtBeginning(headD, tailD, 3);
        display(headD);

        // Insert at end - O(1)
        tailD = insertAtEnd(headD, tailD, 7);
        display(headD);
    }

    // Display singly linked list - O(n)
    static void display(SinglyNode head) {
        SinglyNode curr = head;
        StringBuilder elements = new StringBuilder();
        while (curr != null) {
            elements.append(curr.val).append(" -> ");
            curr = curr.next;
        }
        elements.append("null");
        System.out.println("Singly linked list: " + elements);
    }

    // Search for node value in singly linked list - O(n)
    static boolean search(SinglyNode head, int val) {
        SinglyNode curr = head;
        while (curr != null) {
            if (curr.val == val) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    // Doubly Linked Lists
    static class DoublyNode {
        int val;
        DoublyNode next, prev;

        DoublyNode(int val) {
            this.val = val;
        }

        public String toString() {
            return Integer.toString(val);
        }
    }

    // Display doubly linked list - O(n)
    static void display(DoublyNode head) {
        DoublyNode curr = head;
        StringBuilder elements = new StringBuilder();
        while (curr != null) {
            elements.append(curr.val).append(" <-> ");
            curr = curr.next;
        }
        elements.append("null");
        System.out.println("Doubly linked list: " + elements);
    }

    // Insert at beginning of doubly linked list - O(1)
    static DoublyNode insertAtBeginning(DoublyNode head, DoublyNode tail, int val) {
        DoublyNode newNode = new DoublyNode(val);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }

    // Insert at end of doubly linked list - O(1)
    static DoublyNode insertAtEnd(DoublyNode head, DoublyNode tail, int val) {
        DoublyNode newNode = new DoublyNode(val);
        newNode.prev = tail;
        if (tail != null) {
            tail.next = newNode;
        }
        return newNode;
    }
}
