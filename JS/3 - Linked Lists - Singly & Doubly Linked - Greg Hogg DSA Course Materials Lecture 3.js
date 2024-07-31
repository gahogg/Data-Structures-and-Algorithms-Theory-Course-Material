// Linked Lists - Singly & Doubly Linked - Greg Hogg DSA Course Materials Lecture 3


// Singly Linked Lists
class SinglyNode {
    constructor(val, next = null) {
        this.val = val;
        this.next = next;
    }

    toString() {
        return this.val.toString();
    }
}

class SinglyLinkedList {
    constructor() {
        this.head = null;
    }

    // Add a new node at the end
    append(val) {
        if (!this.head) {
            this.head = new SinglyNode(val);
        } else {
            let current = this.head;
            while (current.next) {
                current = current.next;
            }
            current.next = new SinglyNode(val);
        }
    }

    // Display linked list - O(n)
    display() {
        let elements = "";
        let current = this.head;
        while (current) {
            elements += current.val + " -> ";
            current = current.next;
        }
        elements += "null";
        console.log("Singly linked list: " + elements);
    }

    // Search for node value - O(n)
    search(val) {
        let current = this.head;
        while (current) {
            if (current.val === val) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

// Doubly Linked Lists
class DoublyNode {
    constructor(val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }

    toString() {
        return this.val.toString();
    }
}

class DoublyLinkedList {
    constructor() {
        this.head = null;
        this.tail = null;
    }

    // Insert at beginning - O(1)
    insertAtBeginning(val) {
        const newNode = new DoublyNode(val);
        if (this.head) {
            newNode.next = this.head;
            this.head.prev = newNode;
        }
        this.head = newNode;
        if (!this.tail) {
            this.tail = newNode;
        }
    }

    // Insert at end - O(1)
    insertAtEnd(val) {
        const newNode = new DoublyNode(val);
        if (this.tail) {
            this.tail.next = newNode;
            newNode.prev = this.tail;
        }
        this.tail = newNode;
        if (!this.head) {
            this.head = newNode;
        }
    }

    // Display doubly linked list - O(n)
    display() {
        let elements = "";
        let current = this.head;
        while (current) {
            elements += current.val + " <-> ";
            current = current.next;
        }
        elements += "null";
        console.log("Doubly linked list: " + elements);
    }
}

// Example Usage
const singlyList = new SinglyLinkedList();
singlyList.append(1);
singlyList.append(3);
singlyList.append(4);
singlyList.append(7);
console.log("Head of the list: " + singlyList.head);
singlyList.display();

const searchValue = 7;
const found = singlyList.search(searchValue);
console.log("Search for value " + searchValue + " in list: " + found);

const doublyList = new DoublyLinkedList();
doublyList.insertAtBeginning(1);
console.log("Head of the doubly linked list: " + doublyList.head);
doublyList.display();

doublyList.insertAtBeginning(3);
doublyList.display();

doublyList.insertAtEnd(7);
doublyList.display();
