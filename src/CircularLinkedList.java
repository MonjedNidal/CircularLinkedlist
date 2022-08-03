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

    public void insertAtTail (Item node){
        if (root == null){
            root = node;
            node.setNext(root);
        }else {
            Item current = root;
            while (current.getNext() != root){
                current = current.getNext();
            }
            node.setNext(root);
            current.setNext(node);
        }
    }

//    public void delete(String data){
//        Item previous = root;
//        Item current = root;
//
//        if (root != null){
//            if (current.getData().equals(data)){
//
//            }
//        }


//        while (previous.getNext() != current && !current.getData().equals(data)) {
//            previous = current;
//            current = current.getNext();
//        }
//        System.out.println(previous.getData());
//        System.out.println(current.getData());

//        while (previous.getNext() != current){
//            previous = previous.getNext();
//        }


//    }

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
