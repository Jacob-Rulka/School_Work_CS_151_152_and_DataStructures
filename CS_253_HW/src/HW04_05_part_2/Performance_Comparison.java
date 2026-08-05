package HW04_05_part_2;

import java.util.*;

public class Performance_Comparison {
    static class BSTNode {
        int key;
        BSTNode left, right;

        BSTNode(int key) {
            this.key = key;
        }
    }

    static class AVLNode {
        int key, height;
        AVLNode left, right;

        AVLNode(int key) {
            this.key = key;
            this.height = 1;
        }
    }

    static class BST {
        BSTNode root;

        void insert(int key) {
            root = insertRec(root, key);
        }

        private BSTNode insertRec(BSTNode node, int key) {
            if (node == null) return new BSTNode(key);
            if (key < node.key) node.left = insertRec(node.left, key);
            else node.right = insertRec(node.right, key);
            return node;
        }

        boolean search(int key) {
            return searchRec(root, key);
        }

        private boolean searchRec(BSTNode node, int key) {
            if (node == null) return false;
            if (key == node.key) return true;
            if (key < node.key) return searchRec(node.left, key);
            else return searchRec(node.right, key);
        }
    }

    static class AVL {
        AVLNode root;

        void insert(int key) {
            root = insertRec(root, key);
        }

        private AVLNode insertRec(AVLNode node, int key) {
            if (node == null) return new AVLNode(key);

            if (key < node.key) node.left = insertRec(node.left, key);
            else node.right = insertRec(node.right, key);

            node.height = 1 + Math.max(height(node.left), height(node.right));
            int balance = getBalance(node);

            if (balance > 1 && key < node.left.key)
                return rotateRight(node);
            if (balance < -1 && key > node.right.key)
                return rotateLeft(node);
            if (balance > 1 && key > node.left.key) {
                node.left = rotateLeft(node.left);
                return rotateRight(node);
            }
            if (balance < -1 && key < node.right.key) {
                node.right = rotateRight(node.right);
                return rotateLeft(node);
            }

            return node;
        }

        boolean search(int key) {
            return searchRec(root, key);
        }

        private boolean searchRec(AVLNode node, int key) {
            if (node == null) return false;
            if (key == node.key) return true;
            if (key < node.key) return searchRec(node.left, key);
            else return searchRec(node.right, key);
        }

        private AVLNode rotateRight(AVLNode y) {
            AVLNode x = y.left;
            AVLNode z = x.right;

            x.right = y;
            y.left = z;

            y.height = Math.max(height(y.left), height(y.right)) + 1;
            x.height = Math.max(height(x.left), height(x.right)) + 1;

            return x;
        }

        private AVLNode rotateLeft(AVLNode x) {
            AVLNode y = x.right;
            AVLNode z = y.left;

            y.left = x;
            x.right = z;

            x.height = Math.max(height(x.left), height(x.right)) + 1;
            y.height = Math.max(height(y.left), height(y.right)) + 1;

            return y;
        }

        private int height(AVLNode node) {
            return (node == null) ? 0 : node.height;
        }

        private int getBalance(AVLNode node) {
            return (node == null) ? 0 : height(node.left) - height(node.right);
        }
    }

    public static void main(String[] args) {
        int[] testCases = {1000, 10000, 100000};
        Random rand = new Random();

        for (int i = 0; i < testCases.length; i++) {
            int n = testCases[i];
            System.out.println("Test with n = " + n);
            System.out.println("------------------------");

            List<Integer> values = new ArrayList<>();
            while (values.size() < n) {
                int randNum = rand.nextInt(900000) + 100000;
                boolean found = false;
                for (int j = 0; j < values.size(); j++) {
                    if (values.get(j) == randNum) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    values.add(randNum);
                }
            }

            BST bst = new BST();
            AVL avl = new AVL();

            // Task 1: Insertion Time
            double start = System.nanoTime();
            for (int j = 0; j < values.size(); j++) {
                bst.insert(values.get(j));
            }
            double end = System.nanoTime();
            System.out.println("BST insertion time " + (end - start) + " ns");

            start = System.nanoTime();
            for (int j = 0; j < values.size(); j++) {
                avl.insert(values.get(j));
            }
            end = System.nanoTime();
            System.out.println("AVL insertion time " + (end - start) + " ns");

            // Task 2: Basic Search Time
            List<Integer> searchVals = new ArrayList<>();
            for (int j = 0; j < 1000; j++) {
                searchVals.add(rand.nextInt(900000) + 100000);
            }

            start = System.nanoTime();
            for (int j = 0; j < searchVals.size(); j++) {
                bst.search(searchVals.get(j));
            }
            end = System.nanoTime();
            System.out.println("BST search time " + (end - start) + " ns");

            start = System.nanoTime();
            for (int j = 0; j < searchVals.size(); j++) {
                avl.search(searchVals.get(j));
            }
            end = System.nanoTime();
            System.out.println("AVL search time " + (end - start) + " ns");
            System.out.println();
            
            // Task 2 Extension: Successful vs. Unsuccessful Searches
            List<Integer> successfulSearches = values.subList(0, 500);
            List<Integer> unsuccessfulSearches = new ArrayList<>();
            while (unsuccessfulSearches.size() < 500) {
                int num = rand.nextInt(900000) + 100000;
                if (!values.contains(num)) {
                    unsuccessfulSearches.add(num);
                }
            }

            start = System.nanoTime();
            for (int j = 0; j < successfulSearches.size(); j++) {
                bst.search(successfulSearches.get(j));
            }
            end = System.nanoTime();
            System.out.println("BST successful search time: " + (end - start) + " ns");

            start = System.nanoTime();
            for (int j = 0; j < successfulSearches.size(); j++) {
                avl.search(successfulSearches.get(j));
            }
            end = System.nanoTime();
            System.out.println("AVL successful search time: " + (end - start) + " ns");

            start = System.nanoTime();
            for (int j = 0; j < unsuccessfulSearches.size(); j++) {
                bst.search(unsuccessfulSearches.get(j));
            }
            end = System.nanoTime();
            System.out.println("BST unsuccessful search time: " + (end - start) + " ns");

            start = System.nanoTime();
            for (int j = 0; j < unsuccessfulSearches.size(); j++) {
                avl.search(unsuccessfulSearches.get(j));
            }
            end = System.nanoTime();
            System.out.println("AVL unsuccessful search time: " + (end - start) + " ns");

            // Task 3: Mixed Operations
            int totalOperations = 2000;
            int[] insertRatios = {25, 50, 75};

            for (int ratioIndex = 0; ratioIndex < insertRatios.length; ratioIndex++) {
                int insertPercent = insertRatios[ratioIndex];
                int insertCount = (totalOperations * insertPercent) / 100;
                int searchCount = totalOperations - insertCount;

                System.out.println("\nMixed Operation (Insert " + insertPercent + "%, Search " + (100 - insertPercent) + "%):");

                BST bstMixed = new BST();
                AVL avlMixed = new AVL();

                for (int j = 0; j < values.size(); j++) {
                    bstMixed.insert(values.get(j));
                    avlMixed.insert(values.get(j));
                }

                List<Integer> newInsertValues = new ArrayList<>();
                while (newInsertValues.size() < insertCount) {
                    int newVal = rand.nextInt(900000) + 100000;
                    if (!values.contains(newVal) && !newInsertValues.contains(newVal)) {
                        newInsertValues.add(newVal);
                    }
                }

                List<Integer> mixedSearchValues = new ArrayList<>();
                for (int j = 0; j < searchCount; j++) {
                    mixedSearchValues.add(rand.nextInt(900000) + 100000);
                }

                String[] operationArray = new String[totalOperations];
                for (int j = 0; j < insertCount; j++) {
                    operationArray[j] = "insert";
                }
                for (int j = insertCount; j < totalOperations; j++) {
                    operationArray[j] = "search";
                }

                for (int j = totalOperations - 1; j > 0; j--) {
                    int k = rand.nextInt(j + 1);
                    String temp = operationArray[j];
                    operationArray[j] = operationArray[k];
                    operationArray[k] = temp;
                }

                int insertIndex = 0;
                int searchIndex = 0;
                start = System.nanoTime();
                for (int j = 0; j < operationArray.length; j++) {
                    if (operationArray[j].equals("insert")) {
                        bstMixed.insert(newInsertValues.get(insertIndex));
                        insertIndex++;
                    } else {
                        bstMixed.search(mixedSearchValues.get(searchIndex));
                        searchIndex++;
                    }
                }
                end = System.nanoTime();
                System.out.println("BST mixed op time: " + (end - start) + " ns");

                insertIndex = 0;
                searchIndex = 0;
                start = System.nanoTime();
                for (int j = 0; j < operationArray.length; j++) {
                    if (operationArray[j].equals("insert")) {
                        avlMixed.insert(newInsertValues.get(insertIndex));
                        insertIndex++;
                    } else {
                        avlMixed.search(mixedSearchValues.get(searchIndex));
                        searchIndex++;
                    }
                }
                end = System.nanoTime();
                System.out.println("AVL mixed op time: " + (end - start) + " ns");
            }

            System.out.println("\n"); // spacing between test cases
        }
    }
}
