package HW_2_Sem_3;

public class SinglyLinkedList {

    private SinglyLinkedNode head;


    public void addFirst(String... values) {
        for (String string : values) {
            this.addFirst(string);
        }
    }

    public void addFirst(String value) {
        SinglyLinkedNode newNode = new SinglyLinkedNode(value);

        if (head == null) {
            head = newNode;
        } else {
            SinglyLinkedNode currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

    public String toString() {
        SinglyLinkedNode currentNode = head;
        StringBuilder result = new StringBuilder();

        while (currentNode != null) {
            result.append(currentNode.getValue()).append(" ");
            currentNode = currentNode.getNext();
        }
        return result.toString();
    }

    public void reverse() {
        SinglyLinkedNode previous = null;
        SinglyLinkedNode current = head;
        SinglyLinkedNode next;

        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        head = previous;
    }
}
