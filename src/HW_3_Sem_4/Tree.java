package HW_3_Sem_4;

public class Tree {

    private Node root;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            insertNode(newNode);
        }
        fixInsertion(newNode);
    }

    private void insertNode(Node newNode) {
        Node current = root;
        Node parent = null;

        while (current != null) {
            parent = current;
            if (newNode.getValue() < current.getValue()) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }
        newNode.setParent(parent);
        assert parent != null;
        if (parent.getValue() > newNode.getValue()) {
            parent.setLeftChild(newNode);
        } else {
            parent.setRightChild(newNode);
            if (parent.isRed()) {
                fixInsertion(parent);
            }
        }
    }

    private void fixInsertion(Node newNode) {
        while (newNode.getParent() != null && newNode.getParent().isRed()) {
            Node oldParent = newNode.getParent().getParent();
            if (newNode.getParent() == oldParent.getLeftChild()) {
                Node uncle = oldParent.getRightChild();
                if (uncle != null && uncle.isRed()) {
                    newNode.getParent().setRed(false);
                    uncle.setRed(false);
                    oldParent.setRed(true);
                    newNode = oldParent;
                } else {
                    if (newNode == newNode.getParent().getRightChild()) {
                        newNode = newNode.getParent();
                        rotateLeft(newNode);
                    }
                    newNode.getParent().setRed(false);
                    oldParent.setRed(true);
                    rotateRight(oldParent);
                }
            } else {
                Node uncle = oldParent.getLeftChild();
                if (uncle != null && uncle.isRed()) {
                    newNode.getParent().setRed(false);
                    uncle.setRed(false);
                    oldParent.setRed(true);
                    newNode = oldParent;
                } else {
                    if (newNode == newNode.getParent().getLeftChild()) {
                        newNode = newNode.getParent();
                        rotateRight(newNode);
                    }
                    newNode.getParent().setRed(false);
                    oldParent.setRed(true);
                    rotateLeft(oldParent);
                }
            }
        }
        root.setRed(false);
    }

    private void rotateLeft(Node node) {
        Node pivot = node.getRightChild();
        node.setRightChild(pivot.getLeftChild());
        if (pivot.getLeftChild() != null) {
            pivot.getLeftChild().setParent(node);
        }
        pivot.setParent(node.getParent());
        if (node.getParent() == null) {
            root = pivot;
        } else if (node == node.getParent().getLeftChild()) {
            node.getParent().setLeftChild(pivot);
        } else {
            node.getParent().setRightChild(pivot);
        }
        pivot.setLeftChild(node);
        node.setParent(pivot);
    }

    private void rotateRight(Node node) {
        Node pivot = node.getLeftChild();
        node.setLeftChild(pivot.getRightChild());
        if (pivot.getRightChild() != null) {
            pivot.getRightChild().setParent(node);
        }
        pivot.setParent(node.getParent());
        if (node.getParent() == null) {
            root = pivot;
        } else if (node == node.getParent().getRightChild()) {
            node.getParent().setRightChild(pivot);
        } else {
            node.getParent().setLeftChild(pivot);
        }
        pivot.setRightChild(node);
        node.setParent(pivot);
    }

    public Node getRoot() {
        return root;
    }
}
