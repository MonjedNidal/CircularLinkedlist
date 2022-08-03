package src;


public class Item {
    String data;
    Item next;

    public static int index = 0;

    public Item(String data){
        this.data =data;
        index++;
    }

    public int getIndex() {
        return index;
    }

    public void setName(String name){
        this.data=name;
    }

    public String getData(){
        return data;
    }
    public void setNext(Item next){
        this.next=next;
    }

    public Item getNext(){
        return next;
    }
}
