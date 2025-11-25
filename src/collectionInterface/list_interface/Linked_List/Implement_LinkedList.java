package collectionInterface.list_interface.Linked_List;

public class Implement_LinkedList {
    public static void main(String[] args) {

        Linkedlist linkedlist = new Linkedlist();
        linkedlist.addAtHead(10);
        System.out.println();

        linkedlist.addAtHead(5); // 5
        linkedlist.printLinkedList();
        linkedlist.deleteAtHead();
        linkedlist.printLinkedList();
        linkedlist.addAtTail(10); // 5 10
        linkedlist.addAtTail(20); // 5 10 20
        linkedlist.addAtHead(2); // 2 5 10 20
        linkedlist.addAtTail(30); // 2 5 10 20 30
        linkedlist.addAtHead(1); // 1 2 5 10 20 30
        linkedlist.addAtTail(40); // 2 5 10 20 30 40
        linkedlist.printLinkedList();
//        linkedlist.deleteAtHead();
//        linkedlist.printLinkedList();
//        linkedlist.getSize();

        linkedlist.deleteAtTail();
        linkedlist.deleteAtTail();
        linkedlist.printLinkedList();
        linkedlist.deleteAtHead();
        linkedlist.printLinkedList();
        linkedlist.getSize();

    }
}

