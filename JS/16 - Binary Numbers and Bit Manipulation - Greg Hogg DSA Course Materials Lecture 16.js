// Binary Numbers and Bit Manipulation - Greg Hogg DSA Course Materials Lecture 16


var binaryToDecimal = function(binary) {
    return parseInt(binary, 2);
};

console.log((5).toString(2));  // Decimal to Binary

var binary_5 = '101';
console.log(binaryToDecimal(binary_5));  // Convert Binary to Decimal

console.log(5 & 7);  // Bitwise AND

console.log(5 | 7);  // Bitwise OR

console.log(5 ^ 7);  // Bitwise XOR

console.log(~5);  // Bitwise NOT

console.log(5 << 2);  // Left Shift

console.log(5 >> 1);  // Arithmetic (Signed) Right Shift

console.log((890).toString(16));  // Hexadecimal (Base 16)
