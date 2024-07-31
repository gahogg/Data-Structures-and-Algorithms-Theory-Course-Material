// Hash Tables - Hash Functions, Sets & Maps - Greg Hogg DSA Course Materials Lecture 4

#include <iostream>
#include <unordered_set>
#include <unordered_map>
#include <string>

int main() {
    // HashSets

    // Initialize a HashSet
    std::unordered_set<int> s;
    std::cout << "Initial HashSet: "; // Output: []
    for (int x : s) std::cout << x << " ";
    std::cout << std::endl;

    // Add item into Set - O(1)
    s.insert(1);
    s.insert(2);
    s.insert(3);
    std::cout << "HashSet after adding elements: ";
    for (int x : s) std::cout << x << " ";
    std::cout << std::endl;

    // Lookup if item in set - O(1)
    if (s.find(1) == s.end()) {
        std::cout << "1 is not in the set" << std::endl;
    }

    // Remove item from set - O(1)
    s.erase(3);
    std::cout << "HashSet after removing 3: ";
    for (int x : s) std::cout << x << " ";
    std::cout << std::endl;

    // Set construction from a string
    std::string string = "aaaaaaabbbbbbbbbbbccccccccceeeeeeeee";
    std::unordered_set<char> sett;
    for (char c : string) {
        sett.insert(c);
    }
    std::cout << "Set from string: ";
    for (char c : sett) std::cout << c << " ";
    std::cout << std::endl;

    // Loop over items in set - O(n)
    std::cout << "Elements in HashSet:" << std::endl;
    for (int x : s) {
        std::cout << x << std::endl;
    }

    // HashMaps - Dictionaries

    // Initialize a HashMap
    std::unordered_map<std::string, int> d;
    d["greg"] = 1;
    d["steve"] = 2;
    d["rob"] = 3;
    std::cout << "Initial HashMap: ";
    for (const auto& entry : d) {
        std::cout << "{" << entry.first << ": " << entry.second << "} ";
    }
    std::cout << std::endl;

    // Add key:value in dictionary: O(1)
    d["arsh"] = 4;
    std::cout << "HashMap after adding 'arsh': ";
    for (const auto& entry : d) {
        std::cout << "{" << entry.first << ": " << entry.second << "} ";
    }
    std::cout << std::endl;

    // Check for presence of key in dictionary: O(1)
    if (d.find("greg") != d.end()) {
        std::cout << "HashMap contains key 'greg'" << std::endl;
    }

    // Check the value corresponding to a key in the dictionary: O(1)
    std::cout << "Value for key 'greg': " << d["greg"] << std::endl;

    // Loop over the key:value pairs of the dictionary: O(n)
    std::cout << "Key:Value pairs in HashMap:" << std::endl;
    for (const auto& entry : d) {
        std::cout << "Key " << entry.first << ": Value " << entry.second << std::endl;
    }

    // Counter in C++
    std::unordered_map<char, int> counter;
    for (char c : string) {
        counter[c]++;
    }
    std::cout << "Character counts: ";
    for (const auto& entry : counter) {
        std::cout << "{" << entry.first << ": " << entry.second << "} ";
    }
    std::cout << std::endl;

    return 0;
}
