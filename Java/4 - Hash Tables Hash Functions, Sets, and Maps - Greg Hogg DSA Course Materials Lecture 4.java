// Hash Tables - Hash Functions, Sets & Maps - Greg Hogg DSA Course Materials Lecture 4

import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // HashSets

        // Initialize a HashSet
        Set<Integer> s = new HashSet<>();
        System.out.println("Initial HashSet: " + s); // Output: []

        // Add item into Set - O(1)
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println("HashSet after adding elements: " + s); // Output: [1, 2, 3]

        // Lookup if item in set - O(1)
        if (!s.contains(1)) {
            System.out.println("1 is not in the set");
        }

        // Remove item from set - O(1)
        s.remove(3);
        System.out.println("HashSet after removing 3: " + s); // Output: [1, 2]

        // Set construction from a string
        String string = "aaaaaaabbbbbbbbbbbccccccccceeeeeeeee";
        Set<Character> sett = new HashSet<>();
        for (char c : string.toCharArray()) {
            sett.add(c);
        }
        System.out.println("Set from string: " + sett); // Output: [a, b, c, e]

        // Loop over items in set - O(n)
        System.out.println("Elements in HashSet:");
        for (int x : s) {
            System.out.println(x);
        }

        // HashMaps - Dictionaries

        // Initialize a HashMap
        Map<String, Integer> d = new HashMap<>();
        d.put("greg", 1);
        d.put("steve", 2);
        d.put("rob", 3);
        System.out.println("Initial HashMap: " + d); // Output: {greg=1, steve=2, rob=3}

        // Add key:value in dictionary: O(1)
        d.put("arsh", 4);
        System.out.println("HashMap after adding 'arsh': " + d); // Output: {greg=1, steve=2, rob=3, arsh=4}

        // Check for presence of key in dictionary: O(1)
        if (d.containsKey("greg")) {
            System.out.println("HashMap contains key 'greg'"); // Output: true
        }

        // Check the value corresponding to a key in the dictionary: O(1)
        System.out.println("Value for key 'greg': " + d.get("greg")); // Output: 1

        // Loop over the key:value pairs of the dictionary: O(n)
        System.out.println("Key:Value pairs in HashMap:");
        for (Map.Entry<String, Integer> entry : d.entrySet()) {
            System.out.println("Key " + entry.getKey() + ": Value " + entry.getValue());
        }

        // Counter in Java
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : string.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        System.out.println("Character counts: " + counter); // Output: {a=7, b=11, c=9, e=9}
    }
}
