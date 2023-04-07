package HW_3_Sem_4;

public class PrintTree {
    public static final String RED = "\u001B[31m";
    public static final String BLACK = "\u001B[30m";
    public static final String RES = "\u001B[0m";

    public void printTree(Node node) {
        printTree(node, "", true);
    }

    private void printTree(Node node, String sp, boolean isLeft) {
        if (node != null) {
            System.out.print(sp + (isLeft ? "├──" : "└──"));
            System.out.print(node.isRed() ? RED + "(R) " + RES : BLACK + "(B) " + RES);
            System.out.println(node.getValue());
            printTree(node.getLeftChild(), sp + (isLeft ? "│   " : "    "), true);
            printTree(node.getRightChild(), sp + (isLeft ? "│   " : "    "), false);
        }
    }
}