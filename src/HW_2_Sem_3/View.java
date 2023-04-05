package HW_2_Sem_3;



public class View {
    public static void run(){
        SinglyLinkedList s = new SinglyLinkedList();
        DoublyLinkedList d = new DoublyLinkedList();

        s.addFirst("Раз", "Два", "Три", "Четыре", "Пять");
        d.addFirst("Шесть", "Семь", "Восемь", "Девять", "Десять");

        System.out.println("Односвязный список: " + s);
        s.reverse();
        System.out.println("Развернутый односвязный список: " + s);

        System.out.println("Двухсвязный список: " + d);
        d.reverse();
        System.out.println("Развернутый Двухсвязный список: " + d);
    }
}
