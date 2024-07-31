// Heaps and Priority Queues - Greg Hogg DSA Course Materials Lecture 9

import java.util.PriorityQueue;

// Min Heap
public class Main {
    public static void main(String[] args) {
        // Build Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] A = {-4, 3, 1, 0, 2, 5, 10, 8, 12, 9};
        for (int num : A) {
            minHeap.add(num);
        }
        System.out.println("Min Heap: " + minHeap);

        // Heap Push (Insert element)
        minHeap.add(4);
        System.out.println("Heap after push: " + minHeap);

        // Heap Pop (Extract min)
        int min = minHeap.poll();
        System.out.println("Extracted min: " + min);
        System.out.println("Heap after pop: " + minHeap);

        // Heap Sort
        int[] sortedArray = heapsort(new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0});
        System.out.println("Heap sorted array: " + java.util.Arrays.toString(sortedArray));

        // Heap Push Pop
        minHeap.add(99);
        int pushPopResult = minHeap.poll();
        System.out.println("Push pop result: " + pushPopResult);
        System.out.println("Heap after push-pop: " + minHeap);

        // Peek at Min
        System.out.println("Min element: " + minHeap.peek());
    }

    // Heap Sort using a min heap
    public static int[] heapsort(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : arr) {
            heap.add(num);
        }
        int[] sortedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArray[i] = heap.poll();
        }
        return sortedArray;
    }
}

// Max Heap
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Build Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int[] B = {-4, 3, 1, 0, 2, 5, 10, 8, 12, 9};
        for (int num : B) {
            maxHeap.add(num);
        }
        System.out.println("Max Heap: " + maxHeap);

        // Extract the largest element
        int largest = maxHeap.poll();
        System.out.println("Extracted largest: " + largest);

        // Insert into Max Heap
        maxHeap.add(7);
        System.out.println("Max Heap after inserting 7: " + maxHeap);

        // Build heap from scratch
        int[] C = {-5, 4, 2, 1, 7, 0, 3};
        PriorityQueue<Integer> heapFromScratch = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : C) {
            heapFromScratch.add(num);
            System.out.println("Heap: " + heapFromScratch + ", size: " + heapFromScratch.size());
        }

        // Handling tuples (here, using a custom comparator or additional structure)
    }
}
