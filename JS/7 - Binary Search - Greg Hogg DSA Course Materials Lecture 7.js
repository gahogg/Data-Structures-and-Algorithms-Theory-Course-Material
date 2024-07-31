// Binary Search - Greg Hogg DSA Course Materials Lecture 7

// Traditional Binary Search - O(log n) time, O(1) space
function binarySearch(arr, target) {
    let L = 0;
    let R = arr.length - 1;

    while (L <= R) {
        let M = Math.floor(L + (R - L) / 2);
        if (arr[M] === target) {
            return true;
        } else if (target < arr[M]) {
            R = M - 1;
        } else {
            L = M + 1;
        }
    }
    return false;
}

let A = [-3, -1, 0, 1, 4, 7];
let target = 8;
let result = binarySearch(A, target);
console.log("Is " + target + " in the array? " + result); // Output: false

// Condition-based Binary Search - O(log n) time, O(1) space
function binarySearchCondition(arr) {
    let L = 0;
    let R = arr.length - 1;

    while (L < R) {
        let M = Math.floor((L + R) / 2);
        if (arr[M]) {
            R = M;
        } else {
            L = M + 1;
        }
    }
    return L;
}

let B = [false, false, false, false, false, true, true];
let resultCondition = binarySearchCondition(B);
console.log("First true element index: " + resultCondition); // Output: 5
