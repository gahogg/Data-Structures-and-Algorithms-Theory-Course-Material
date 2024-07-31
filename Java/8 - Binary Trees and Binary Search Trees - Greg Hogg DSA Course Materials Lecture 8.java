// Binary Trees and Binary Search Trees - Greg Hogg DSA Course Materials Lecture 8

// Binary Tree Functions
public class Main {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        TreeNode D = new TreeNode(4);
        TreeNode E = new TreeNode(5);
        TreeNode F = new TreeNode(10);

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;

        System.out.println("Root Node: " + A);

        // Recursive Pre Order Traversal (DFS)
        System.out.println("Pre Order Traversal:");
        preOrder(A);

        // Recursive In Order Traversal (DFS)
        System.out.println("In Order Traversal:");
        inOrder(A);

        // Iterative Pre Order Traversal (DFS)
        System.out.println("Iterative Pre Order Traversal:");
        preOrderIterative(A);

        // Level Order Traversal (BFS)
        System.out.println("Level Order Traversal:");
        levelOrder(A);

        // Search for a value in the tree
        int target = 11;
        boolean found = search(A, target);
        System.out.println("Value " + target + " found in tree: " + found);
    }

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }

        public String toString() {
            return Integer.toString(val);
        }
    }

    // Recursive Pre Order Traversal (DFS)
    public static void preOrder(TreeNode node) {
        if (node == null) return;
        System.out.println(node);
        preOrder(node.left);
        preOrder(node.right);
    }

    // Recursive In Order Traversal (DFS)
    public static void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node);
        inOrder(node.right);
    }

    // Iterative Pre Order Traversal (DFS)
    public static void preOrderIterative(TreeNode node) {
        if (node == null) return;
        java.util.Stack<TreeNode> stack = new java.util.Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            System.out.println(current);

            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
    }

    // Level Order Traversal (BFS)
    public static void levelOrder(TreeNode node) {
        if (node == null) return;
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.println(current);

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    // Search for a value in the tree (DFS)
    public static boolean search(TreeNode node, int target) {
        if (node == null) return false;
        if (node.val == target) return true;
        return search(node.left, target) || search(node.right, target);
    }
}



// Binary Search Trees:

public class Main {
    public static void main(String[] args) {
        TreeNode A2 = new TreeNode(5);
        TreeNode B2 = new TreeNode(1);
        TreeNode C2 = new TreeNode(8);
        TreeNode D2 = new TreeNode(-1);
        TreeNode E2 = new TreeNode(3);
        TreeNode F2 = new TreeNode(7);
        TreeNode G2 = new TreeNode(9);

        A2.left = B2;
        A2.right = C2;
        B2.left = D2;
        B2.right = E2;
        C2.left = F2;
        C2.right = G2;

        System.out.println("BST Root Node: " + A2);

        // In Order Traversal (DFS)
        System.out.println("BST In Order Traversal:");
        inOrder(A2);

        // Search in BST
        int target = -1;
        boolean found = searchBST(A2, target);
        System.out.println("Value " + target + " found in BST: " + found);
    }

    // Node class for the Binary Search Tree
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }

        public String toString() {
            return Integer.toString(val);
        }
    }

    // In Order Traversal (DFS)
    public static void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node);
        inOrder(node.right);
    }

    // Search in BST - O(log n) time, O(log n) space
    public static boolean searchBST(TreeNode node, int target) {
        if (node == null) return false;
        if (node.val == target) return true;
        if (target < node.val) return searchBST(node.left, target);
        else return searchBST(node.right, target);
    }
}
