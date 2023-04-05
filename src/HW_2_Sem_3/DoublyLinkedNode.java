package HW_2_Sem_3;

public class DoublyLinkedNode {

    private final String value;
    private DoublyLinkedNode next;
    private DoublyLinkedNode prev;

    public DoublyLinkedNode(String value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public String getValue() {
        return value;
    }

    public DoublyLinkedNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkedNode next) {
        this.next = next;
    }

    public DoublyLinkedNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedNode prev) {
        this.prev = prev;
    }
}