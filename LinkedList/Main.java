package LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(30);
        list.append(20);
        list.append(50);
        list.append(40);
        list.printList();
        list.insert(2,60);
        list.printList();
        list.prepend(90);
        list.printList();
        list.removeLast();
        list.removeLast();
        list.printList();
    }
}