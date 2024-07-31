// Static Arrays, Dynamic Arrays, and Strings - Greg Hogg DSA Course Materials Lecture 2

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

int main() {
    // Dynamic Arrays
    std::vector<int> A = {1, 2, 3};
    std::cout << "Initial vector: ";
    for (int n : A) std::cout << n << " ";
    std::cout << std::endl;

    // Append - Insert element at end of vector - On average: O(1)
    A.push_back(5);
    std::cout << "After append (add 5): ";
    for (int n : A) std::cout << n << " ";
    std::cout << std::endl;

    // Pop - Deleting element at end of vector - O(1)
    A.pop_back();
    std::cout << "After pop (remove last element): ";
    for (int n : A) std::cout << n << " ";
    std::cout << std::endl;

    // Insert (not at end of vector) - O(n)
    A.insert(A.begin() + 2, 5);
    std::cout << "After insert (5 at index 2): ";
    for (int n : A) std::cout << n << " ";
    std::cout << std::endl;

    // Modify an element - O(1)
    A[0] = 7;
    std::cout << "After modifying element at index 0 to 7: ";
    for (int n : A) std::cout << n << " ";
    std::cout << std::endl;

    // Accessing element given index i - O(1)
    std::cout << "Element at index 2: " << A[2] << std::endl;

    // Checking if vector has an element - O(n)
    if (std::find(A.begin(), A.end(), 7) != A.end()) {
        std::cout << "Vector contains 7: true" << std::endl;
    }

    // Checking length - O(1)
    std::cout << "Length of vector: " << A.size() << std::endl;

    // Strings
    std::string s = "hello";
    std::string b = s + 'z';

    // Append to end of string - O(n)
    std::cout << "String after append 'z': " << b << std::endl;

    // Check if something is in string - O(n)
    if (s.find('f') != std::string::npos) {
        std::cout << "String contains 'f': true" << std::endl; // This line won't print as 'f' is not in "hello"
    }

    // Access positions - O(1)
    std::cout << "Character at index 2: " << s[2] << std::endl;

    // Check length of string - O(1)
    std::cout << "Length of string: " << s.length() << std::endl;

    return 0;
}
