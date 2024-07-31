// Stacks & Queues - Greg Hogg DSA Course Materials Lecture 5

// Stacks - Last in First Out (LIFO)
let stack = [];
console.log("Initial Stack: ", stack); // Output: []

// Append to top of stack - O(1)
stack.push(5);
stack.push(4);
stack.push(3);
console.log("Stack after pushing elements: ", stack); // Output: [5, 4, 3]

// Pop from stack - O(1)
let x = stack.pop();
console.log("Popped element: ", x); // Output: 3
console.log("Stack after popping: ", stack); // Output: [5, 4]

// Ask what's on the top of stack - O(1)
console.log("Top element of stack: ", stack[stack.length - 1]); // Output: 4

// Check if stack is not empty - O(1)
if (stack.length > 0) {
    console.log("Stack is not empty"); // Output: true
}

// Queues - First in First out (FIFO)
let queue = [];
console.log("Initial Queue: ", queue); // Output: []

// Enqueue - Add element to the right - O(1)
queue.push(5);
queue.push(6);
queue.push(7);
console.log("Queue after enqueuing elements: ", queue); // Output: [5, 6, 7]

// Dequeue (pop left) - Remove element from the left - O(1)
queue.shift();
console.log("Queue after dequeueing: ", queue); // Output: [6, 7]

// Peek from front - O(1)
console.log("Front element of queue: ", queue[0]); // Output: 6

// Peek from rear - O(1)
console.log("Rear element of queue: ", queue[queue.length - 1]); // Output: 7
