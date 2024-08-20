// Binary Numbers and Bit Manipulation - Greg Hogg DSA Course Materials Lecture 16

#include <iostream>
#include <bitset>

int main() {
    // Decimal to Binary
    std::cout << std::bitset<8>(5).to_string().substr(3) << std::endl;

    // Convert Binary to Decimal
    std::string binary_5 = "101";
    std::cout << std::stoi(binary_5, nullptr, 2) << std::endl;

    // Bitwise AND
    std::cout << (5 & 7) << std::endl;

    // Bitwise OR
    std::cout << (5 | 7) << std::endl;

    // Bitwise XOR
    std::cout << (5 ^ 7) << std::endl;

    // Bitwise NOT
    std::cout << (~5) << std::endl;

    // Left Shift
    std::cout << (5 << 2) << std::endl;

    // Arithmetic (Signed) Right Shift
    std::cout << (5 >> 1) << std::endl;

    // Hexadecimal (Base 16)
    std::cout << std::hex << 890 << std::endl;

    return 0;
}
