// Graphs - Edge List, Adjacency Matrix, Adjacency List, DFS, BFS - Greg Hogg DSA Course Materials Lecture 11

// Graph Representation & Traversal

// Convert Array of Edges -> Adjacency Matrix
function buildAdjacencyMatrix(n, edges) {
    let matrix = Array.from({ length: n }, () => Array(n).fill(0));
    edges.forEach(([u, v]) => {
        matrix[u][v] = 1;
    });
    return matrix;
}

// Convert Array of Edges -> Adjacency List
function buildAdjacencyList(edges) {
    let adjList = new Map();
    edges.forEach(([u, v]) => {
        if (!adjList.has(u)) adjList.set(u, []);
        adjList.get(u).push(v);
    });
    return adjList;
}

// Recursive DFS
function dfsRecursive(node, adjList, seen = new Set()) {
    if (!seen.has(node)) {
        seen.add(node);
        console.log(node);
        (adjList.get(node) || []).forEach(neighbor => {
            dfsRecursive(neighbor, adjList, seen);
        });
    }
}

// Iterative DFS
function dfsIterative(startNode, adjList) {
    let seen = new Set();
    let stack = [startNode];
    seen.add(startNode);

    while (stack.length) {
        let node = stack.pop();
        console.log(node);
        (adjList.get(node) || []).forEach(neighbor => {
            if (!seen.has(neighbor)) {
                seen.add(neighbor);
                stack.push(neighbor);
            }
        });
    }
}

// BFS
function bfs(startNode, adjList) {
    let seen = new Set();
    let queue = [startNode];
    seen.add(startNode);

    while (queue.length) {
        let node = queue.shift();
        console.log(node);
        (adjList.get(node) || []).forEach(neighbor => {
            if (!seen.has(neighbor)) {
                seen.add(neighbor);
                queue.push(neighbor);
            }
        });
    }
}

// Helper methods to print matrices and adjacency lists
function printMatrix(matrix) {
    matrix.forEach(row => console.log(row));
}

function printAdjacencyList(adjList) {
    adjList.forEach((value, key) => {
        console.log(`${key} -> ${value}`);
    });
}

// Example usage
const n = 8;
const edges = [[0, 1], [1, 2], [0, 3], [3, 4], [3, 6], [3, 7], [4, 2], [4, 5], [5, 2]];

const adjacencyMatrix = buildAdjacencyMatrix(n, edges);
console.log("Adjacency Matrix:");
printMatrix(adjacencyMatrix);

const adjacencyList = buildAdjacencyList(edges);
console.log("Adjacency List:");
printAdjacencyList(adjacencyList);

console.log("DFS Recursive:");
dfsRecursive(0, adjacencyList);

console.log("DFS Iterative:");
dfsIterative(0, adjacencyList);

console.log("BFS:");
bfs(0, adjacencyList);

// Custom Node Class for Graphs
class Node {
    constructor(value) {
        this.value = value;
        this.neighbors = [];
    }

    toString() {
        return `Node(${this.value})`;
    }

    display() {
        let connections = this.neighbors.map(neighbor => neighbor.value);
        return `${this.value} is connected to: ${connections}`;
    }
}

// Example usage for Node Class
let A = new Node("A");
let B = new Node("B");
let C = new Node("C");
let D = new Node("D");

A.neighbors.push(B);
B.neighbors.push(A);
C.neighbors.push(D);
D.neighbors.push(C);

console.log(B.display());
