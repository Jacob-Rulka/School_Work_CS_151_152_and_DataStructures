package HW04_05;

import java.util.*;

public class Part_1 {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();

        System.out.println("TASK 1: Binary Search Tree (BST)");
        System.out.println("The root is on the left and branches to the right \n");

        BinarySearchTree bst;
        while (true) {
            bst = new BinarySearchTree();
            List<Integer> bstValues = new ArrayList<>();
            while (bst.getHeight() < 5) {
                int randNum = 10 + rand.nextInt(90);
                if (!bstValues.contains(randNum)) {
                    bstValues.add(randNum);
                    bst.insert(randNum);
                }
            }
            if (bst.getHeight() == 5) {
                break;
            }
        }

        System.out.println("BST (Height = 5):");
        bst.printTree();

        while (!bst.isEmpty()) {
            System.out.println("\nDeleting root: " + bst.root.value + "\n");
            bst.deleteRoot();
            bst.printTree();
        }

        System.out.println("\nTASK 2: AVL Tree");
        System.out.println("The root is on the left and branches to the right \n");

        AVL_Tree avl = new AVL_Tree();
        List<Integer> avlValues = new ArrayList<>();
        while (avlValues.size() < 35) {
            int randNum = 10 + rand.nextInt(90);
            if (!avlValues.contains(randNum)) {
                avlValues.add(randNum);
                avl.insert(randNum);
                avl.printTree();
                System.out.println("----------------------------------------------");
                avl.checkBalance(avl.root);
            }
        }

        while (!avl.isEmpty()) {
            System.out.println("\nDeleting root: " + avl.root.value);
            avl.deleteRoot();
            avl.printTree();
            System.out.println("----------------------------------------------");
            if (!avl.isEmpty()) {
                avl.checkBalance(avl.root);
            }
        }
    }
}