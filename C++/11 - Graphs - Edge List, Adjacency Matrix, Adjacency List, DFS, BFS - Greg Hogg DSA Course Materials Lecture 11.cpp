// Graphs - Edge List, Adjacency Matrix, Adjacency List, DFS, BFS - Greg Hogg DSA Course Materials Lecture 11

#include <iostream>
#include <vector>
#include <queue>
#include <stack>
#include <unordered_map>
#include <unordered_set>

// Build Adjacency Matrix
std::vector<std::vector<int>> buildAdjacencyMatrix(int n, const std::vector<std::pair<int, int>>& edges) {
    std::vector<std::vector<int>> matrix(n, std::vector<int>(n, 0));
    for (const auto& edge : edges) {
        matrix[edge.first][edge.second] = 1;
    }
    return matrix;
}

// Build Adjacency List
std::unordered_map<int, std::vector<int>> buildAdjacencyList(const std::vector<std::pair<int, int>>& edges) {
    std::unordered_map<int, std::vector<int>> adjList;
    for (const auto& edge : edges) {
        adjList[edge.first].push_back(edge.second);
    }
    return adjList;
}

// Recursive DFS
void dfsRecursive(int node, const std::unordered_map<int, std::vector<int>>& adjList, std::unordered_set<int>& seen) {
    if (seen.count(node)) return;
    seen.insert(node);
    std::cout << node << " ";
    if (adjList.find(node) != adjList.end()) {
        for (int neighbor : adjList.at(node)) {
            dfsRecursive(neighbor, adjList, seen);
        }
    }
}

// Iterative DFS
void dfsIterative(int startNode, const std::unordered_map<int, std::vector<int>>& adjList) {
    std::unordered_set<int> seen;
    std::stack<int> stack;
    stack.push(startNode);
    seen.insert(startNode);

    while (!stack.empty()) {
        int node = stack.top();
        stack.pop();
        std::cout << node << " ";
        if (adjList.find(node) != adjList.end()) {
            for (int neighbor : adjList.at(node)) {
                if (!seen.count(neighbor)) {
                    seen.insert(neighbor);
                    stack.push(neighbor);
                }
            }
        }
    }
}

// BFS
void bfs(int startNode, const std::unordered_map<int, std::vector<int>>& adjList) {
    std::unordered_set<int> seen;
    std::queue<int> queue;
    queue.push(startNode);
    seen.insert(startNode);

    while (!queue.empty()) {
        int node = queue.front();
        queue.pop();
        std::cout << node << " ";
        if (adjList.find(node) != adjList.end()) {
            for (int neighbor : adjList.at(node)) {
                if (!seen.count(neighbor)) {
                    seen.insert(neighbor);
                    queue.push(neighbor);
                }
            }
        }
    }
}

// Print Matrix
void printMatrix(const std::vector<std::vector<int>>& matrix) {
    for (const auto& row : matrix) {
        for (int val : row) {
            std::cout << val << " ";
        }
        std::cout << std::endl;
    }
}

// Print Adjacency List
void printAdjacencyList(const std::unordered_map<int, std::vector<int>>& adjList) {
    for (const auto& entry : adjList) {
        std::cout << entry.first << " -> ";
        for (int neighbor : entry.second) {
            std::cout << neighbor << " ";
        }
        std::cout << std::endl;
    }
}

int main() {
    int n = 8;
    std::vector<std::pair<int, int>> edges = {{0, 1}, {1, 2}, {0, 3}, {3, 4}, {3, 6}, {3, 7}, {4, 2}, {4, 5}, {5, 2}};

    // Convert Array of Edges -> Adjacency Matrix
    auto adjacencyMatrix = buildAdjacencyMatrix(n, edges);
    std::cout << "Adjacency Matrix:" << std::endl;
    printMatrix(adjacencyMatrix);

    // Convert Array of Edges -> Adjacency List
    auto adjacencyList = buildAdjacencyList(edges);
    std::cout << "Adjacency List:" << std::endl;
    printAdjacencyList(adjacencyList);

    // Depth First Search (DFS) - Recursive
    std::cout << "DFS Recursive:" << std::endl;
    std::unordered_set<int> seen;
    dfsRecursive(0, adjacencyList, seen);
    std::cout << std::endl;

    // Depth First Search (DFS) - Iterative
    std::cout << "DFS Iterative:" << std::endl;
    dfsIterative(0, adjacencyList);
    std::cout << std::endl;

    // Breadth First Search (BFS)
    std::cout << "BFS:" << std::endl;
    bfs(0, adjacencyList);
    std::cout << std::endl;

    return 0;
}
