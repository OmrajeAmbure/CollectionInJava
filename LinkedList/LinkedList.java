package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }
    public void append(int value){
        Node newnode = new Node(value);
        if (length == 0){
            head = newnode;
            tail = newnode;
        }else {
            tail.next = newnode;
            tail =  newnode;
        }
        length++;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public boolean insert(int index,int value){
        if (index < 0 || index > length) return false;
        if (index == 0){
            prepend(value);
            return true;
        }
        if (length==index){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp =   temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
    public void removeLast(){
        if (length==0){
            return;
        }
        if (length == 1){
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            length--;
        }
    }
}
