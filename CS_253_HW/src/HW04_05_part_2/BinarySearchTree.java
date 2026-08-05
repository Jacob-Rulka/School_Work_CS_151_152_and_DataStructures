package HW04_05_part_2;

public class BinarySearchTree {
    DoublyNode root;

    public void insert(int value) {
        root = insert(root, value, null);
    }

    private DoublyNode insert(DoublyNode node, int value, DoublyNode parent) {
        if (node == null) {
            DoublyNode newNode = new DoublyNode(value);
            newNode.parent = parent;
            return newNode;
        }

        if (value < node.value) {
            node.left = insert(node.left, value, node);
        } else if (value > node.value) {
            node.right = insert(node.right, value, node);
        }

        return node;
    }

    public void deleteRoot() {
        if (root != null) {
            root = delete(root, root.value);
        }
    }

    private DoublyNode delete(DoublyNode node, int value) {
        if (node == null) return null;

        if (value < node.value) {
            node.left = delete(node.left, value);
        } else if (value > node.value) {
            node.right = delete(node.right, value);
        } else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;

            DoublyNode min = findMin(node.right);
            node.value = min.value;
            node.right = delete(node.right, min.value);
        }
        return node;
    }

    private DoublyNode findMin(DoublyNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public int height(DoublyNode node) {
        if (node == null) return -1;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int getHeight() {
        return height(root);
    }

    public void printTree() {
        printTree(root, 0);
    }

    private void printTree(DoublyNode node, int level) {
        if (node == null) return;
        printTree(node.right, level + 1);
        System.out.println("    ".repeat(level) + node.value);
        printTree(node.left, level + 1);
    }

    public boolean isEmpty() {
        return root == null;
    }
}