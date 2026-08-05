package HW04_05;

public class DoublyNode {
    int value;
    DoublyNode left;
    DoublyNode right;
    DoublyNode parent;

    public DoublyNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public DoublyNode getLeft() {
        return left;
    }

    public DoublyNode getRight() {
        return right;
    }
}