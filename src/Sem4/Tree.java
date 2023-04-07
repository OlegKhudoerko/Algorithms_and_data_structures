package Sem4;

import java.util.Random;

public class Tree {
    static int[] value = {1, 9, 2, 8, 3, 7, 4, 6, 5, 10, 20, 15, 17};
    // static int k;

    public static void run() {

        Node root = new Node();
        root = buildBalanceTree(11);
        System.out.println(isBalance(root));
        System.out.println();
        printTree(root, "");
    }

    static void printTree(Node tree, String sp) {
        if (tree != null) {
            System.out.println(sp + tree.value);
            printTree(tree.left, sp + " ");
            printTree(tree.right, sp + " ");
        }
    }

    static int high(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(high(root.left), high(root.right));
    }

    static boolean isBalance(Node root) {
        int i = 0;
        if (root == null) {
            return true;
        }
        i = Math.abs(high(root.left) - high(root.right));
        return i < 2;
    }

    static Node buildBalanceTree(int count) {
        Node root;
        if (count <= 0) {
            return null;
        } else {
            root = new Node();
            root.value = new Random().nextInt(30);
            root.left = buildBalanceTree(count / 2);
            root.right = buildBalanceTree(count / 2);
        }
        return root;
    }
}



