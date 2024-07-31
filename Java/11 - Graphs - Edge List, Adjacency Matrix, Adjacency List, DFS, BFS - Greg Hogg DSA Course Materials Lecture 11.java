// Graphs - Edge List, Adjacency Matrix, Adjacency List, DFS, BFS - Greg Hogg DSA Course Materials Lecture 11

// Graph Representation & Traversal
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 8;
        int[][] edges = {{0, 1}, {1, 2}, {0, 3}, {3, 4}, {3, 6}, {3, 7}, {4, 2}, {4, 5}, {5, 2}};

        // Convert Array of Edges -> Adjacency Matrix
        int[][] adjacencyMatrix = buildAdjacencyMatrix(n, edges);
        System.out.println("Adjacency Matrix:");
        printMatrix(adjacencyMatrix);

        // Convert Array of Edges -> Adjacency List
        Map<Integer, List<Integer>> adjacencyList = buildAdjacencyList(edges);
        System.out.println("Adjacency List:");
        printAdjacencyList(adjacencyList);

        // Depth First Search (DFS) - Recursive
        System.out.println("DFS Recursive:");
        Set<Integer> seen = new HashSet<>();
        dfsRecursive(0, adjacencyList, seen);

        // Depth First Search (DFS) - Iterative
        System.out.println("DFS Iterative:");
        dfsIterative(0, adjacencyList);

        // Breadth First Search (BFS)
        System.out.println("BFS:");
        bfs(0, adjacencyList);
    }

    // Build Adjacency Matrix
    public static int[][] buildAdjacencyMatrix(int n, int[][] edges) {
        int[][] matrix = new int[n][n];
        for (int[] edge : edges) {
            matrix[edge[0]][edge[1]] = 1;
        }
        return matrix;
    }

    // Build Adjacency List
    public static Map<Integer, List<Integer>> buildAdjacencyList(int[][] edges) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for (int[] edge : edges) {
            adjList.putIfAbsent(edge[0], new ArrayList<>());
            adjList.get(edge[0]).add(edge[1]);
        }
        return adjList;
    }

    // Recursive DFS
    public static void dfsRecursive(int node, Map<Integer, List<Integer>> adjList, Set<Integer> seen) {
        if (!seen.contains(node)) {
            seen.add(node);
            System.out.println(node);
            for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
                dfsRecursive(neighbor, adjList, seen);
            }
        }
    }

    // Iterative DFS
    public static void dfsIterative(int startNode, Map<Integer, List<Integer>> adjList) {
        Set<Integer> seen = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);
        seen.add(startNode);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.println(node);
            for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
                if (!seen.contains(neighbor)) {
                    seen.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }
    }

    // BFS
    public static void bfs(int startNode, Map<Integer, List<Integer>> adjList) {
        Set<Integer> seen = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startNode);
        seen.add(startNode);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(node);
            for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
                if (!seen.contains(neighbor)) {
                    seen.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }

    // Helper methods to print matrices and adjacency lists
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void printAdjacencyList(Map<Integer, List<Integer>> adjList) {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

// Custom Node Class for Graphs:
public class Main {
    String value;
    List<Node> neighbors;

    public Node(String value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Node(" + value + ")";
    }

    public String display() {
        List<String> connections = new ArrayList<>();
        for (Node neighbor : neighbors) {
            connections.add(neighbor.value);
        }
        return value + " is connected to: " + connections;
    }

    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");

        A.neighbors.add(B);
        B.neighbors.add(A);
        C.neighbors.add(D);
        D.neighbors.add(C);

        System.out.println(B.display());
    }
}

// Custom Node Class for Graphs
import java.util.*;

public class Main {
    // Node class to represent a graph node
    static class Node {
        String value;
        List<Node> neighbors;

        public Node(String value) {
            this.value = value;
            this.neighbors = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "Node(" + value + ")";
        }

        public String display() {
            List<String> connections = new ArrayList<>();
            for (Node neighbor : neighbors) {
                connections.add(neighbor.value);
            }
            return value + " is connected to: " + connections;
        }
    }

    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");

        A.neighbors.add(B);
        B.neighbors.add(A);
        C.neighbors.add(D);
        D.neighbors.add(C);

        System.out.println(B.display());
    }
}
