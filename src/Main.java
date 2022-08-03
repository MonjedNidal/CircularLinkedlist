package src;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertAtHead(new Item("Mohammad"));
        list.insertAtHead(new Item("Monjed"));
        list.insertAtHead(new Item("Ahamad"));
        list.insertAtHead(new Item("Alii"));
        list.print();
    }
}
