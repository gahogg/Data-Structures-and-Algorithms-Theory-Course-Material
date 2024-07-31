// Binary Search - Greg Hogg DSA Course Materials Lecture 7

#include <iostream>
#include <vector>

// Traditional Binary Search - O(log n) time, O(1) space
bool binarySearch(const std::vector<int>& arr, int target) {
    int L = 0;
    int R = arr.size() - 1;

    while (L <= R) {
        int M = L + (R - L) / 2;
        if (arr[M] == target) {
            return true;
        } else if (target < arr[M]) {
            R = M - 1;
        } else {
            L = M + 1;
        }
    }
    return false;
}

// Condition-based Binary Search - O(log n) time, O(1) space
int binarySearchCondition(const std::vector<bool>& arr) {
    int L = 0;
    int R = arr.size() - 1;

    while (L < R) {
        int M = L + (R - L) / 2;
        if (arr[M]) {
            R = M;
        } else {
            L = M + 1;
        }
    }
    return L;
}

int main() {
    std::vector<int> A = {-3, -1, 0, 1, 4, 7};
    int target = 8;
    bool result = binarySearch(A, target);
    std::cout << "Is " << target << " in the array? " << (result ? "Yes" : "No") << std::endl;

    std::vector<bool> B = {false, false, false, false, false, true, true};
    int conditionResult = binarySearchCondition(B);
    std::cout << "First true element index: " << conditionResult << std::endl;

    return 0;
}
