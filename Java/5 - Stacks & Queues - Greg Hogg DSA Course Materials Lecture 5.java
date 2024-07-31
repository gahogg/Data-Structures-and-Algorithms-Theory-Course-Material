// Stacks & Queues - Greg Hogg DSA Course Materials Lecture 5

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Stacks - Last in First Out (Lifo)

        Stack<Integer> stk = new Stack<>();
        System.out.println("Initial Stack: " + stk); // Output: []

        // Append to top of stack - O(1)
        stk.push(5);
        stk.push(4);
        stk.push(3);
        System.out.println("Stack after pushing elements: " + stk); // Output: [5, 4, 3]

        // Pop from stack - O(1)
        int x = stk.pop();
        System.out.println("Popped element: " + x); // Output: 3
        System.out.println("Stack after popping: " + stk); // Output: [5, 4]

        // Ask what's on the top of stack - O(1)
        System.out.println("Top element of stack: " + stk.peek()); // Output: 4

        // Ask if something is in the stack - O(1)
        if (!stk.isEmpty()) {
            System.out.println("Stack is not empty"); // Output: true
        }

        // Queues - First in First out (Fifo)

        Deque<Integer> q = new LinkedList<>();
        System.out.println("Initial Queue: " + q); // Output: []

        // Enqueue - Add element to the right - O(1)
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println("Queue after enqueuing elements: " + q); // Output: [5, 6, 7]

        // Dequeue (pop left) - Remove element from the left - O(1)
        q.removeFirst();
        System.out.println("Queue after dequeueing: " + q); // Output: [6, 7]

        // Peek from left side - O(1)
        System.out.println("Front element of queue: " + q.peekFirst()); // Output: 6

        // Peek from right side - O(1)
        System.out.println("Rear element of queue: " + q.peekLast()); // Output: 7
    }
}
