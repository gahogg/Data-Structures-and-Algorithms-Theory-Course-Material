// Binary Trees and Binary Search Trees - Greg Hogg DSA Course Materials Lecture 8

#include <iostream>
#include <queue>
#include <stack>

// Node class for the Binary Tree and Binary Search Tree
class TreeNode {
public:
    int val;
    TreeNode* left;
    TreeNode* right;

    TreeNode(int val) : val(val), left(nullptr), right(nullptr) {}

    std::string toString() const {
        return std::to_string(val);
    }
};

// Recursive Pre Order Traversal (DFS)
void preOrder(TreeNode* node) {
    if (node == nullptr) return;
    std::cout << node->toString() << " ";
    preOrder(node->left);
    preOrder(node->right);
}

// Recursive In Order Traversal (DFS)
void inOrder(TreeNode* node) {
    if (node == nullptr) return;
    inOrder(node->left);
    std::cout << node->toString() << " ";
    inOrder(node->right);
}

// Iterative Pre Order Traversal (DFS)
void preOrderIterative(TreeNode* node) {
    if (node == nullptr) return;
    std::stack<TreeNode*> stack;
    stack.push(node);

    while (!stack.empty()) {
        TreeNode* current = stack.top();
        stack.pop();
        std::cout << current->toString() << " ";

        if (current->right != nullptr) stack.push(current->right);
        if (current->left != nullptr) stack.push(current->left);
    }
}

// Level Order Traversal (BFS)
void levelOrder(TreeNode* node) {
    if (node == nullptr) return;
    std::queue<TreeNode*> queue;
    queue.push(node);

    while (!queue.empty()) {
        TreeNode* current = queue.front();
        queue.pop();
        std::cout << current->toString() << " ";

        if (current->left != nullptr) queue.push(current->left);
        if (current->right != nullptr) queue.push(current->right);
    }
}

// Search for a value in the tree (DFS)
bool search(TreeNode* node, int target) {
    if (node == nullptr) return false;
    if (node->val == target) return true;
    return search(node->left, target) || search(node->right, target);
}

// Search in BST - O(log n) time, O(log n) space
bool searchBST(TreeNode* node, int target) {
    if (node == nullptr) return false;
    if (node->val == target) return true;
    if (target < node->val) return searchBST(node->left, target);
    else return searchBST(node->right, target);
}

int main() {
    // Binary Tree Example
    TreeNode* A = new TreeNode(1);
    TreeNode* B = new TreeNode(2);
    TreeNode* C = new TreeNode(3);
    TreeNode* D = new TreeNode(4);
    TreeNode* E = new TreeNode(5);
    TreeNode* F = new TreeNode(10);

    A->left = B;
    A->right = C;
    B->left = D;
    B->right = E;
    C->left = F;

    std::cout << "Root Node: " << A->toString() << std::endl;

    // Traversal Examples
    std::cout << "Pre Order Traversal: ";
    preOrder(A);
    std::cout << std::endl;

    std::cout << "In Order Traversal: ";
    inOrder(A);
    std::cout << std::endl;

    std::cout << "Iterative Pre Order Traversal: ";
    preOrderIterative(A);
    std::cout << std::endl;

    std::cout << "Level Order Traversal: ";
    levelOrder(A);
    std::cout << std::endl;

    // Search in Binary Tree
    int target = 11;
    bool found = search(A, target);
    std::cout << "Value " << target << " found in tree: " << (found ? "Yes" : "No") << std::endl;

    // Binary Search Tree Example
    TreeNode* A2 = new TreeNode(5);
    TreeNode* B2 = new TreeNode(1);
    TreeNode* C2 = new TreeNode(8);
    TreeNode* D2 = new TreeNode(-1);
    TreeNode* E2 = new TreeNode(3);
    TreeNode* F2 = new TreeNode(7);
    TreeNode* G2 = new TreeNode(9);

    A2->left = B2;
    A2->right = C2;
    B2->left = D2;
    B2->right = E2;
    C2->left = F2;
    C2->right = G2;

    std::cout << "BST Root Node: " << A2->toString() << std::endl;

    std::cout << "BST In Order Traversal: ";
    inOrder(A2);
    std::cout << std::endl;

    target = -1;
    found = searchBST(A2, target);
    std::cout << "Value " << target << " found in BST: " << (found ? "Yes" : "No") << std::endl;

    return 0;
}
