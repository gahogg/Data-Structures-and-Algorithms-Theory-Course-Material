// Stacks & Queues - Greg Hogg DSA Course Materials Lecture 5

#include <iostream>
#include <stack>
#include <deque>

int main() {
    // Stacks - Last in First Out (LIFO)

    std::stack<int> stk;
    std::cout << "Initial Stack: empty" << std::endl;

    // Append to top of stack - O(1)
    stk.push(5);
    stk.push(4);
    stk.push(3);
    std::cout << "Stack after pushing elements: [5, 4, 3]" << std::endl;

    // Pop from stack - O(1)
    int x = stk.top();
    stk.pop();
    std::cout << "Popped element: " << x << std::endl;
    std::cout << "Stack after popping: [5, 4]" << std::endl;

    // Ask what's on the top of stack - O(1)
    std::cout << "Top element of stack: " << stk.top() << std::endl;

    // Ask if something is in the stack - O(1)
    if (!stk.empty()) {
        std::cout << "Stack is not empty" << std::endl;
    }

    // Queues - First in First out (FIFO)

    std::deque<int> q;
    std::cout << "Initial Queue: empty" << std::endl;

    // Enqueue - Add element to the right - O(1)
    q.push_back(5);
    q.push_back(6);
    q.push_back(7);
    std::cout << "Queue after enqueuing elements: [5, 6, 7]" << std::endl;

    // Dequeue (pop left) - Remove element from the left - O(1)
    q.pop_front();
    std::cout << "Queue after dequeueing: [6, 7]" << std::endl;

    // Peek from left side - O(1)
    std::cout << "Front element of queue: " << q.front() << std::endl;

    // Peek from right side - O(1)
    std::cout << "Rear element of queue: " << q.back() << std::endl;

    return 0;
}
