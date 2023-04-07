package HW_3_Sem_4;

public class Node {

    private final int value;
    private Node leftChild;
    private Node rightChild;
    private Node parent;
    private boolean isRed;

    public Node(int value) {
        this.value = value;
        this.isRed = true;
    }

    public int getValue() {
        return value;
    }


    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public boolean isRed() {
        return isRed;
    }

    public void setRed(boolean isRed) {
        this.isRed = isRed;
    }
}
