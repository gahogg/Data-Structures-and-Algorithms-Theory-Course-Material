// Heaps and Priority Queues - Greg Hogg DSA Course Materials Lecture 9

#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>

// Function for heap sort using a min-heap
std::vector<int> heapsort(const std::vector<int>& arr) {
    std::priority_queue<int, std::vector<int>, std::greater<int>> minHeap;
    for (int num : arr) {
        minHeap.push(num);
    }
    std::vector<int> sortedArray;
    while (!minHeap.empty()) {
        sortedArray.push_back(minHeap.top());
        minHeap.pop();
    }
    return sortedArray;
}

int main() {
    // Min Heap operations
    std::priority_queue<int, std::vector<int>, std::greater<int>> minHeap;
    std::vector<int> A = {-4, 3, 1, 0, 2, 5, 10, 8, 12, 9};
    for (int num : A) {
        minHeap.push(num);
    }
    std::cout << "Min Heap built from array A" << std::endl;

    // Heap Push
    minHeap.push(4);
    std::cout << "Heap after push (adding 4)" << std::endl;

    // Heap Pop
    int min = minHeap.top();
    minHeap.pop();
    std::cout << "Extracted min: " << min << std::endl;

    // Heap Sort
    std::vector<int> sortedArray = heapsort({1, 3, 5, 7, 9, 2, 4, 6, 8, 0});
    std::cout << "Heap sorted array: ";
    for (int num : sortedArray) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    // Heap Push Pop
    minHeap.push(99);
    int pushPopResult = minHeap.top();
    minHeap.pop();
    std::cout << "Push pop result: " << pushPopResult << std::endl;

    // Peek at Min
    std::cout << "Min element: " << minHeap.top() << std::endl;

    // Max Heap operations
    std::priority_queue<int> maxHeap;
    std::vector<int> B = {-4, 3, 1, 0, 2, 5, 10, 8, 12, 9};
    for (int num : B) {
        maxHeap.push(num);
    }
    std::cout << "Max Heap built from array B" << std::endl;

    // Extract the largest element
    int largest = maxHeap.top();
    maxHeap.pop();
    std::cout << "Extracted largest: " << largest << std::endl;

    // Insert into Max Heap
    maxHeap.push(7);
    std::cout << "Max Heap after inserting 7" << std::endl;

    // Build heap from scratch
    std::vector<int> C = {-5, 4, 2, 1, 7, 0, 3};
    std::priority_queue<int> heapFromScratch;
    for (int num : C) {
        heapFromScratch.push(num);
        std::cout << "Heap size: " << heapFromScratch.size() << std::endl;
    }

    return 0;
}
