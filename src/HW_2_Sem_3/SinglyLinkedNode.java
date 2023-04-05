package HW_2_Sem_3;

public class SinglyLinkedNode {

    private final String value;
    private SinglyLinkedNode next;

    public SinglyLinkedNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public SinglyLinkedNode getNext() {
        return next;
    }

    public void setNext(SinglyLinkedNode next) {
        this.next = next;
    }
}