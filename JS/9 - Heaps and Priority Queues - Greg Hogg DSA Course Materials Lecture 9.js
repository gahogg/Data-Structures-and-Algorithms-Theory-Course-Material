// Heaps and Priority Queues - Greg Hogg DSA Course Materials Lecture 9

const { MinPriorityQueue, MaxPriorityQueue } = require('@datastructures-js/priority-queue');

// Min Heap
function minHeapOperations() {
    const minHeap = new MinPriorityQueue();
    const A = [-4, 3, 1, 0, 2, 5, 10, 8, 12, 9];
    A.forEach(num => minHeap.enqueue(num));
    console.log("Min Heap: ", minHeap.toArray());

    // Heap Push (Insert element)
    minHeap.enqueue(4);
    console.log("Heap after push: ", minHeap.toArray());

    // Heap Pop (Extract min)
    const min = minHeap.dequeue().element;
    console.log("Extracted min: ", min);
    console.log("Heap after pop: ", minHeap.toArray());

    // Heap Sort
    const sortedArray = heapsort([1, 3, 5, 7, 9, 2, 4, 6, 8, 0]);
    console.log("Heap sorted array: ", sortedArray);

    // Heap Push Pop
    minHeap.enqueue(99);
    const pushPopResult = minHeap.dequeue().element;
    console.log("Push pop result: ", pushPopResult);
    console.log("Heap after push-pop: ", minHeap.toArray());

    // Peek at Min
    console.log("Min element: ", minHeap.front().element);
}

// Heap Sort using a min heap
function heapsort(arr) {
    const heap = new MinPriorityQueue();
    arr.forEach(num => heap.enqueue(num));
    const sortedArray = [];
    while (heap.size()) {
        sortedArray.push(heap.dequeue().element);
    }
    return sortedArray;
}

// Max Heap
function maxHeapOperations() {
    const maxHeap = new MaxPriorityQueue();
    const B = [-4, 3, 1, 0, 2, 5, 10, 8, 12, 9];
    B.forEach(num => maxHeap.enqueue(num));
    console.log("Max Heap: ", maxHeap.toArray());

    // Extract the largest element
    const largest = maxHeap.dequeue().element;
    console.log("Extracted largest: ", largest);

    // Insert into Max Heap
    maxHeap.enqueue(7);
    console.log("Max Heap after inserting 7: ", maxHeap.toArray());

    // Build heap from scratch
    const C = [-5, 4, 2, 1, 7, 0, 3];
    const heapFromScratch = new MaxPriorityQueue();
    C.forEach(num => heapFromScratch.enqueue(num));
    console.log("Heap: ", heapFromScratch.toArray(), ", size: ", heapFromScratch.size());
}

// Run the functions
minHeapOperations();
maxHeapOperations();
