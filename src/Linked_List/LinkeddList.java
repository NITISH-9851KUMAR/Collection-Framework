package Linked_List;

public class LinkeddList<T> {
    //    Node Class
    class Node {
        T val;
        Node next;

        Node(T val) {
            this.val = val;
        }
    }

    //    Head Node
    Node head;

    //    Add Node at first Position
    public void addFirstNode(T val) {
        Node node = new Node(val);
//        When there head node is null
        if (head != null) node.next = head;
        head = node;
    }

    //    Add Node at Last Position
    public void addLastNode(T val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    //    Add at position Node
    public void addAt(int idx, T val) {
//        If add at 0th position means at First Node
        if (idx == 0) {
            addFirstNode(val);
            return;
        }
        if (idx == getSize()) {
            addLastNode(val);
            return;
        }
        if (idx > getSize()) {
            System.out.printf("Invalid Position: %d\n", idx);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

    }

    //    Print Node
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Empty Node");
        } else {
            while (temp != null) {
                System.out.printf("%s ", temp.val);
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // display at position element
    void displayAt(int idx){
        if ( idx<0 ||  idx > getSize()) {
            System.out.printf("Invalid Position: %d\n", idx);
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        System.out.println(temp.val);

    }

    // Reverse Print linked List
    void displayReverse(){
        reverse(head);
    }

    //    Get the size of Node
    public int getSize() {
        int count = 0;
        Node temp = head;
        if (temp == null) {
            return count;
        } else {
            while (temp.next != null) {
                temp = temp.next;
                count++;
            }
            count++;
        }

        return count;
    }

    public void reverse(Node temp){
        if(temp== null){
            return;
        }
        reverse(temp.next);
        System.out.printf("%s ", temp.val);
    }

}
