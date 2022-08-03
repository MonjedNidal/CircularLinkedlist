package src;

public class CircularLinkedList {
    private Item root;

    public CircularLinkedList() {
        root = null;
    }

    public void setRoot(Item root) {
        this.root = root;
    }

    public void insertAtHead(Item node){
        if (root == null){
            root = node;
            node.setNext(root);
        }else{
            Item current = root;
            while (current.getNext() != root){
                current = current.getNext();
            }
            node.setNext(root);
            root = node;
            current.setNext(root);
        }
    }
    public void print() {
        Item current = root;

        if (root != null){
            do {
                System.out.println(current.getData());
                current = current.getNext();
            }while (current != root);
        }
    }
}
