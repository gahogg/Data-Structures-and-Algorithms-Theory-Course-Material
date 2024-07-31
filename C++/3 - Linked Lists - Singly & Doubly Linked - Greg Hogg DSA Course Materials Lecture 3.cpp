// Linked Lists - Singly & Doubly Linked - Greg Hogg DSA Course Materials Lecture 3


#include <iostream>
#include <string>

class SinglyNode {
public:
    int val;
    SinglyNode* next;

    SinglyNode(int val, SinglyNode* next = nullptr) : val(val), next(next) {}

    std::string toString() const {
        return std::to_string(val);
    }
};

class DoublyNode {
public:
    int val;
    DoublyNode* next;
    DoublyNode* prev;

    DoublyNode(int val) : val(val), next(nullptr), prev(nullptr) {}

    std::string toString() const {
        return std::to_string(val);
    }
};

void display(SinglyNode* head) {
    SinglyNode* curr = head;
    std::cout << "Singly linked list: ";
    while (curr) {
        std::cout << curr->val << " -> ";
        curr = curr->next;
    }
    std::cout << "null" << std::endl;
}

bool search(SinglyNode* head, int val) {
    SinglyNode* curr = head;
    while (curr) {
        if (curr->val == val) return true;
        curr = curr->next;
    }
    return false;
}

void display(DoublyNode* head) {
    DoublyNode* curr = head;
    std::cout << "Doubly linked list: ";
    while (curr) {
        std::cout << curr->val << " <-> ";
        curr = curr->next;
    }
    std::cout << "null" << std::endl;
}

DoublyNode* insertAtBeginning(DoublyNode* head, DoublyNode*& tail, int val) {
    DoublyNode* newNode = new DoublyNode(val);
    newNode->next = head;
    if (head) head->prev = newNode;
    else tail = newNode;
    return newNode;
}

DoublyNode* insertAtEnd(DoublyNode* head, DoublyNode*& tail, int val) {
    DoublyNode* newNode = new DoublyNode(val);
    if (tail) {
        tail->next = newNode;
        newNode->prev = tail;
    } else {
        head = newNode;
    }
    tail = newNode;
    return head;
}

int main() {
    // Singly Linked List
    SinglyNode* head = new SinglyNode(1);
    SinglyNode* A = new SinglyNode(3);
    SinglyNode* B = new SinglyNode(4);
    SinglyNode* C = new SinglyNode(7);

    head->next = A;
    A->next = B;
    B->next = C;

    std::cout << "Head of the list: " << head->toString() << std::endl;
    std::cout << "Traversing the singly linked list: ";
    display(head);

    int searchValue = 7;
    bool found = search(head, searchValue);
    std::cout << "Search for value " << searchValue << " in list: " << (found ? "true" : "false") << std::endl;

    // Doubly Linked List
    DoublyNode* headD = new DoublyNode(1);
    DoublyNode* tailD = headD;
    std::cout << "Head of the doubly linked list: " << headD->toString() << std::endl;
    display(headD);

    headD = insertAtBeginning(headD, tailD, 3);
    display(headD);

    headD = insertAtEnd(headD, tailD, 7);
    display(headD);

    return 0;
}
