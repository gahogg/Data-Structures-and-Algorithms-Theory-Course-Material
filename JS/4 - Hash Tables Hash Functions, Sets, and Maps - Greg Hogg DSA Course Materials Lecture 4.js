// Hash Tables - Hash Functions, Sets & Maps - Greg Hogg DSA Course Materials Lecture 4

// HashSets

// Initialize a Set
let s = new Set();
console.log("Initial Set: ", s); // Output: Set {}

// Add items to Set - O(1)
s.add(1);
s.add(2);
s.add(3);
console.log("Set after adding elements: ", s); // Output: Set { 1, 2, 3 }

// Check if item is in Set - O(1)
if (!s.has(1)) {
    console.log("1 is not in the set");
}

// Remove item from Set - O(1)
s.delete(3);
console.log("Set after removing 3: ", s); // Output: Set { 1, 2 }

// Set construction from a string
let string = "aaaaaaabbbbbbbbbbbccccccccceeeeeeeee";
let sett = new Set(string);
console.log("Set from string: ", sett); // Output: Set { 'a', 'b', 'c', 'e' }

// Loop over items in Set - O(n)
console.log("Elements in Set:");
for (let x of s) {
    console.log(x);
}

// HashMaps - Dictionaries

// Initialize a Map
let d = new Map();
d.set("greg", 1);
d.set("steve", 2);
d.set("rob", 3);
console.log("Initial Map: ", d); // Output: Map { 'greg' => 1, 'steve' => 2, 'rob' => 3 }

// Add key:value in Map: O(1)
d.set("arsh", 4);
console.log("Map after adding 'arsh': ", d); // Output: Map { 'greg' => 1, 'steve' => 2, 'rob' => 3, 'arsh' => 4 }

// Check for presence of key in Map: O(1)
if (d.has("greg")) {
    console.log("Map contains key 'greg'"); // Output: true
}

// Get the value corresponding to a key in the Map: O(1)
console.log("Value for key 'greg': ", d.get("greg")); // Output: 1

// Loop over the key:value pairs of the Map: O(n)
console.log("Key:Value pairs in Map:");
for (let [key, value] of d) {
    console.log("Key " + key + ": Value " + value);
}

// Counter in JavaScript
let counter = new Map();
for (let c of string) {
    counter.set(c, (counter.get(c) || 0) + 1);
}
console.log("Character counts: ", counter); // Output: Map { 'a' => 7, 'b' => 11, 'c' => 9, 'e' => 9 }
