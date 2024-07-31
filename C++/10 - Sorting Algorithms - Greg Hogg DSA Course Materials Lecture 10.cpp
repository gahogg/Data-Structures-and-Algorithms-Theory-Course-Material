// Sorting Algorithms - Greg Hogg DSA Course Materials Lecture 10

#include <iostream>
#include <vector>
#include <algorithm> // For std::max_element

// Bubble Sort
void bubbleSort(std::vector<int>& arr) {
    int n = arr.size();
    bool flag = true;
    while (flag) {
        flag = false;
        for (int i = 1; i < n; ++i) {
            if (arr[i - 1] > arr[i]) {
                flag = true;
                std::swap(arr[i - 1], arr[i]);
            }
        }
    }
}

// Insertion Sort
void insertionSort(std::vector<int>& arr) {
    int n = arr.size();
    for (int i = 1; i < n; ++i) {
        for (int j = i; j > 0 && arr[j - 1] > arr[j]; --j) {
            std::swap(arr[j], arr[j - 1]);
        }
    }
}

// Selection Sort
void selectionSort(std::vector<int>& arr) {
    int n = arr.size();
    for (int i = 0; i < n; ++i) {
        int minIndex = i;
        for (int j = i + 1; j < n; ++j) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        std::swap(arr[i], arr[minIndex]);
    }
}

// Merge Sort
std::vector<int> merge(const std::vector<int>& left, const std::vector<int>& right) {
    std::vector<int> result;
    size_t l = 0, r = 0;
    while (l < left.size() && r < right.size()) {
        if (left[l] < right[r]) {
            result.push_back(left[l++]);
        } else {
            result.push_back(right[r++]);
        }
    }
    while (l < left.size()) result.push_back(left[l++]);
    while (r < right.size()) result.push_back(right[r++]);
    return result;
}

std::vector<int> mergeSort(std::vector<int> arr) {
    if (arr.size() <= 1) return arr;
    int mid = arr.size() / 2;
    std::vector<int> left(arr.begin(), arr.begin() + mid);
    std::vector<int> right(arr.begin() + mid, arr.end());
    return merge(mergeSort(left), mergeSort(right));
}

// Quick Sort
int partition(std::vector<int>& arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; ++j) {
        if (arr[j] <= pivot) {
            std::swap(arr[++i], arr[j]);
        }
    }
    std::swap(arr[i + 1], arr[high]);
    return i + 1;
}

void quickSort(std::vector<int>& arr, int low, int high) {
    if (low < high) {
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
}

// Counting Sort
void countingSort(std::vector<int>& arr) {
    int maxVal = *std::max_element(arr.begin(), arr.end());
    std::vector<int> counts(maxVal + 1, 0);
    for (int num : arr) {
        counts[num]++;
    }
    int index = 0;
    for (int i = 0; i <= maxVal; ++i) {
        while (counts[i]-- > 0) {
            arr[index++] = i;
        }
    }
}

int main() {
    std::vector<int> arr1 = {-5, 3, 2, 1, -3, -3, 7, 2, 2};
    bubbleSort(arr1);
    std::cout << "Bubble Sorted Array: ";
    for (int num : arr1) std::cout << num << " ";
    std::cout << std::endl;

    std::vector<int> arr2 = {-5, 3, 2, 1, -3, -3, 7, 2, 2};
    insertionSort(arr2);
    std::cout << "Insertion Sorted Array: ";
    for (int num : arr2) std::cout << num << " ";
    std::cout << std::endl;

    std::vector<int> arr3 = {-3, 3, 2, 1, -5, -3, 7, 2, 2};
    selectionSort(arr3);
    std::cout << "Selection Sorted Array: ";
    for (int num : arr3) std::cout << num << " ";
    std::cout << std::endl;

    std::vector<int> arr4 = {-5, 3, 2, 1, -3, -3, 7, 2, 2};
    std::vector<int> sortedArr4 = mergeSort(arr4);
    std::cout << "Merge Sorted Array: ";
    for (int num : sortedArr4) std::cout << num << " ";
    std::cout << std::endl;

    std::vector<int> arr5 = {-5, 3, 2, 1, -3, -3, 7, 2, 2};
    quickSort(arr5, 0, arr5.size() - 1);
    std::cout << "Quick Sorted Array: ";
    for (int num : arr5) std::cout << num << " ";
    std::cout << std::endl;

    std::vector<int> arr6 = {5, 3, 2, 1, 3, 3, 7, 2, 2};
    countingSort(arr6);
    std::cout << "Counting Sorted Array: ";
    for (int num : arr6) std::cout << num << " ";
    std::cout << std::endl;

    return 0;
}
