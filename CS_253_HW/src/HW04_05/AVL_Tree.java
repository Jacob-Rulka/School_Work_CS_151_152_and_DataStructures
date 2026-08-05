package HW04_05;

public class AVL_Tree {
    public DoublyNode root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private DoublyNode insert(DoublyNode node, int value) {
        if (node == null) return new DoublyNode(value);

        if (value < node.value)
            node.left = insert(node.left, value);
        else if (value > node.value)
            node.right = insert(node.right, value);

        return rebalance(node);
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

        return rebalance(node);
    }

    private DoublyNode findMin(DoublyNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    private int height(DoublyNode node) {
        if (node == null) return -1;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    private int getBalance(DoublyNode node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    private DoublyNode rebalance(DoublyNode node) {
        int balance = getBalance(node);

        if (balance > 1) {
            if (getBalance(node.left) < 0) {
                System.out.println("Double right-left rotation: " + node.value);
                node.left = rotateLeft(node.left);
            } else {
                System.out.println("Single right rotation: " + node.value);
            }
            return rotateRight(node);
        }

        if (balance < -1) {
            if (getBalance(node.right) > 0) {
                System.out.println("Double left-right rotation: " + node.value);
                node.right = rotateRight(node.right);
            } else {
                System.out.println("Single left rotation: " + node.value);
            }
            return rotateLeft(node);
        }

        return node;
    }

    private DoublyNode rotateRight(DoublyNode y) {
        DoublyNode x = y.left;
        DoublyNode z = x.right;

        x.right = y;
        y.left = z;

        return x;
    }

    private DoublyNode rotateLeft(DoublyNode x) {
        DoublyNode y = x.right;
        DoublyNode z = y.left;

        y.left = x;
        x.right = z;

        return y;
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

    public int checkBalance(DoublyNode node) throws Exception {
        if (node == null) return -1;

        int leftHeight = checkBalance(node.getLeft());
        int rightHeight = checkBalance(node.getRight());

        if (Math.abs(leftHeight - rightHeight) > 1 ||
            height(node.left) != leftHeight ||
            height(node.right) != rightHeight) {
            throw new Exception("Unbalanced tree detected.");
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
