package HW04_05_part_2;

public class Node {
    int value;
    Node left;
    Node right;
    Node parent;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
