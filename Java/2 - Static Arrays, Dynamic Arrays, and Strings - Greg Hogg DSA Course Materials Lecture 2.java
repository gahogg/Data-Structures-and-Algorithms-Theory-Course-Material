// Static Arrays, Dynamic Arrays, and Strings - Greg Hogg DSA Course Materials Lecture 2

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Arrays
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);

        System.out.println("Initial ArrayList: " + A);  // Output: [1, 2, 3]

        // Append - Insert element at end of array - On average: O(1)
        A.add(5);
        System.out.println("After append (add 5): " + A);  // Output: [1, 2, 3, 5]

        // Pop - Deleting element at end of array - O(1)
        A.remove(A.size() - 1);
        System.out.println("After pop (remove last element): " + A);  // Output: [1, 2, 3]

        // Insert (not at end of array) - O(n)
        A.add(2, 5);
        System.out.println("After insert (5 at index 2): " + A);  // Output: [1, 2, 5, 3]

        // Modify an element - O(1)
        A.set(0, 7);
        System.out.println("After modifying element at index 0 to 7: " + A);  // Output: [7, 2, 5, 3]

        // Accessing element given index i - O(1)
        System.out.println("Element at index 2: " + A.get(2));  // Output: 5

        // Checking if array has an element - O(n)
        if (A.contains(7)) {
            System.out.println("ArrayList contains 7: true");  // Output: true
        }

        // Checking length - O(1)
        System.out.println("Length of ArrayList: " + A.size());  // Output: 4

        // Strings
        String s = "hello";
        String b = s + "z";

        // Append to end of string - O(n)
        System.out.println("String after append 'z': " + b);  // Output: helloz

        // Check if something is in string - O(n)
        if (s.contains("f")) {
            System.out.println("String contains 'f': true");  // This line won't print as 'f' is not in "hello"
        }

        // Access positions - O(1)
        System.out.println("Character at index 2: " + s.charAt(2));  // Output: l

        // Check length of string - O(1)
        System.out.println("Length of string: " + s.length());  // Output: 5
    }
}
