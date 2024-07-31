// Recursion - Greg Hogg DSA Course Materials Lecture 6

// Fibonacci
#include <iostream>

int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main() {
    int n = 12;
    std::cout << "Fibonacci of " << n << " is: " << fibonacci(n) << std::endl;
    return 0;
}


// Reverse printing of Linked List
#include <iostream>

class SinglyNode {
public:
    int val;
    SinglyNode* next;

    SinglyNode(int val) : val(val), next(nullptr) {}

    std::string toString() const {
        return std::to_string(val);
    }
};

SinglyNode* createLinkedList() {
    SinglyNode* head = new SinglyNode(1);
    head->next = new SinglyNode(3);
    head->next->next = new SinglyNode(4);
    head->next->next->next = new SinglyNode(7);
    return head;
}

void reversePrint(SinglyNode* node) {
    if (node == nullptr) return;
    reversePrint(node->next);
    std::cout << "Node value: " << node->val << std::endl;
}

int main() {
    SinglyNode* head = createLinkedList();
    std::cout << "Reversed List:" << std::endl;
    reversePrint(head);
    return 0;
}
