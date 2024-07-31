// Binary Trees and Binary Search Trees - Greg Hogg DSA Course Materials Lecture 8

// Binary Tree Node Definition
class TreeNode {
    constructor(val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    toString() {
        return this.val.toString();
    }
}

// Recursive Pre Order Traversal (DFS)
function preOrder(node) {
    if (node === null) return;
    console.log(node);
    preOrder(node.left);
    preOrder(node.right);
}

// Recursive In Order Traversal (DFS)
function inOrder(node) {
    if (node === null) return;
    inOrder(node.left);
    console.log(node);
    inOrder(node.right);
}

// Iterative Pre Order Traversal (DFS)
function preOrderIterative(node) {
    if (node === null) return;
    let stack = [];
    stack.push(node);

    while (stack.length > 0) {
        let current = stack.pop();
        console.log(current);

        if (current.right !== null) stack.push(current.right);
        if (current.left !== null) stack.push(current.left);
    }
}

// Level Order Traversal (BFS)
function levelOrder(node) {
    if (node === null) return;
    let queue = [];
    queue.push(node);

    while (queue.length > 0) {
        let current = queue.shift();
        console.log(current);

        if (current.left !== null) queue.push(current.left);
        if (current.right !== null) queue.push(current.right);
    }
}

// Search for a value in the tree (DFS)
function search(node, target) {
    if (node === null) return false;
    if (node.val === target) return true;
    return search(node.left, target) || search(node.right, target);
}

// Binary Search Tree Node Definition
class BSTNode {
    constructor(val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    toString() {
        return this.val.toString();
    }
}

// Search in BST - O(log n) time, O(log n) space
function searchBST(node, target) {
    if (node === null) return false;
    if (node.val === target) return true;
    if (target < node.val) return searchBST(node.left, target);
    else return searchBST(node.right, target);
}

// Example Usage for Binary Tree
let A = new TreeNode(1);
let B = new TreeNode(2);
let C = new TreeNode(3);
let D = new TreeNode(4);
let E = new TreeNode(5);
let F = new TreeNode(10);

A.left = B;
A.right = C;
B.left = D;
B.right = E;
C.left = F;

console.log("Root Node: " + A);
console.log("Pre Order Traversal:");
preOrder(A);
console.log("In Order Traversal:");
inOrder(A);
console.log("Iterative Pre Order Traversal:");
preOrderIterative(A);
console.log("Level Order Traversal:");
levelOrder(A);
console.log("Value 11 found in tree: " + search(A, 11));

// Example Usage for Binary Search Tree
let A2 = new BSTNode(5);
let B2 = new BSTNode(1);
let C2 = new BSTNode(8);
let D2 = new BSTNode(-1);
let E2 = new BSTNode(3);
let F2 = new BSTNode(7);
let G2 = new BSTNode(9);

A2.left = B2;
A2.right = C2;
B2.left = D2;
B2.right = E2;
C2.left = F2;
C2.right = G2;

console.log("BST Root Node: " + A2);
console.log("BST In Order Traversal:");
inOrder(A2);
console.log("Value -1 found in BST: " + searchBST(A2, -1));
