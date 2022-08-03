package src;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertAtTail(new Item("Mohammad"));
        list.insertAtTail(new Item("Monjed"));
        list.insertAtTail(new Item("Ahamad"));
        list.insertAtTail(new Item("Alii"));
        list.insertAtTail(new Item("Maswadeh"));
//        list.delete("Ahamad");
//        list.print();
    }
}
