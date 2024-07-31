// Sorting Algorithms - Greg Hogg DSA Course Materials Lecture 10

// Bubble Sort
function bubbleSort(arr) {
    let n = arr.length;
    let flag = true;
    while (flag) {
        flag = false;
        for (let i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                flag = true;
                [arr[i - 1], arr[i]] = [arr[i], arr[i - 1]];
            }
        }
    }
}

let A = [-5, 3, 2, 1, -3, -3, 7, 2, 2];
bubbleSort(A);
console.log("Bubble Sorted Array:", A);

// Insertion Sort
function insertionSort(arr) {
    let n = arr.length;
    for (let i = 1; i < n; i++) {
        for (let j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
            [arr[j], arr[j - 1]] = [arr[j - 1], arr[j]];
        }
    }
}

let B = [-5, 3, 2, 1, -3, -3, 7, 2, 2];
insertionSort(B);
console.log("Insertion Sorted Array:", B);

// Selection Sort
function selectionSort(arr) {
    let n = arr.length;
    for (let i = 0; i < n; i++) {
        let minIndex = i;
        for (let j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        [arr[i], arr[minIndex]] = [arr[minIndex], arr[i]];
    }
}

let C = [-3, 3, 2, 1, -5, -3, 7, 2, 2];
selectionSort(C);
console.log("Selection Sorted Array:", C);

// Merge Sort
function mergeSort(arr) {
    if (arr.length <= 1) return arr;
    let mid = Math.floor(arr.length / 2);
    let left = mergeSort(arr.slice(0, mid));
    let right = mergeSort(arr.slice(mid));
    return merge(left, right);
}

function merge(left, right) {
    let result = [];
    let l = 0, r = 0;
    while (l < left.length && r < right.length) {
        if (left[l] < right[r]) result.push(left[l++]);
        else result.push(right[r++]);
    }
    return result.concat(left.slice(l)).concat(right.slice(r));
}

let D = [-5, 3, 2, 1, -3, -3, 7, 2, 2];
let sortedD = mergeSort(D);
console.log("Merge Sorted Array:", sortedD);

// Quick Sort
function quickSort(arr, low = 0, high = arr.length - 1) {
    if (low < high) {
        let pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
}

function partition(arr, low, high) {
    let pivot = arr[high];
    let i = low - 1;
    for (let j = low; j < high; j++) {
        if (arr[j] <= pivot) {
            i++;
            [arr[i], arr[j]] = [arr[j], arr[i]];
        }
    }
    [arr[i + 1], arr[high]] = [arr[high], arr[i + 1]];
    return i + 1;
}

let E = [-5, 3, 2, 1, -3, -3, 7, 2, 2];
quickSort(E);
console.log("Quick Sorted Array:", E);

// Counting Sort
function countingSort(arr) {
    let n = arr.length;
    let max = Math.max(...arr);
    let counts = new Array(max + 1).fill(0);
    for (let num of arr) {
        counts[num]++;
    }
    let index = 0;
    for (let i = 0; i <= max; i++) {
        while (counts[i]-- > 0) {
            arr[index++] = i;
        }
    }
}

let F = [5, 3, 2, 1, 3, 3, 7, 2, 2];
countingSort(F);
console.log("Counting Sorted Array:", F);
