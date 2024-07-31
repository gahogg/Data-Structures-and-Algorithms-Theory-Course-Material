// Recursion - Greg Hogg DSA Course Materials Lecture 6

// Fibonacci Sequence Calculation - O(2^n) time, O(n) space
function fibonacci(n) {
    if (n === 0) return 0;
    if (n === 1) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

console.log("Fibonacci of 12 is: " + fibonacci(12)); // Output: Fibonacci of 12 is: 144

// Singly Linked List Node Definition
class SinglyNode {
    constructor(val) {
        this.val = val;
        this.next = null;
    }

    toString() {
        return this.val.toString();
    }
}

// Create a Linked List
function createLinkedList() {
    let head = new SinglyNode(1);
    head.next = new SinglyNode(3);
    head.next.next = new SinglyNode(4);
    head.next.next.next = new SinglyNode(7);
    return head;
}

// Reverse Print Linked List - O(n) time, O(n) space due to recursion
function reversePrint(node) {
    if (node === null) return;
    reversePrint(node.next);
    console.log("Node value: " + node);
}

let head = createLinkedList();
console.log("Reversed List:");
reversePrint(head);
