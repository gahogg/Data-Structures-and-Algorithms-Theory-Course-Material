// Static Arrays, Dynamic Arrays, and Strings - Greg Hogg DSA Course Materials Lecture 2

// Arrays
let A = [1, 2, 3];
console.log("Initial Array: ", A); // Output: [1, 2, 3]

// Append - Insert element at end of array - On average: O(1)
A.push(5);
console.log("After append (add 5): ", A); // Output: [1, 2, 3, 5]

// Pop - Deleting element at end of array - O(1)
A.pop();
console.log("After pop (remove last element): ", A); // Output: [1, 2, 3]

// Insert (not at end of array) - O(n)
A.splice(2, 0, 5); // Insert 5 at index 2
console.log("After insert (5 at index 2): ", A); // Output: [1, 2, 5, 3]

// Modify an element - O(1)
A[0] = 7;
console.log("After modifying element at index 0 to 7: ", A); // Output: [7, 2, 5, 3]

// Accessing element given index i - O(1)
console.log("Element at index 2: ", A[2]); // Output: 5

// Checking if array has an element - O(n)
if (A.includes(7)) {
    console.log("Array contains 7: true"); // Output: true
}

// Checking length - O(1)
console.log("Length of Array: ", A.length); // Output: 4

// Strings
let s = "hello";
let b = s + "z";

// Append to end of string - O(n)
console.log("String after append 'z': ", b); // Output: helloz

// Check if something is in string - O(n)
if (s.includes("f")) {
    console.log("String contains 'f': true"); // This line won't print as 'f' is not in "hello"
}

// Access positions - O(1)
console.log("Character at index 2: ", s.charAt(2)); // Output: l

// Check length of string - O(1)
console.log("Length of string: ", s.length); // Output: 5
