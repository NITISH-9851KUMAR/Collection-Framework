package collectionInterface.list_interface.Linked_List;

class Linkedlist {
    Node head;
    Node tail;

    int size = 0;

    // Add Node from Head
    void addAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    // Add Node from tail
    void addAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;

        else {
            if (head.next == null) {
                head.next = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }
        size++;
    }

    // Delete Node from Head
    void deleteAtHead() {
        if (head == null) {
            System.out.println("Empty Node");
            return;
        }
        // if Many Node present in the node
        else head = head.next;

        // when only one node is present in the list
        if (head == null) tail = null;
        size--;
    }

    void deleteAtTail(){
        if (head == null) {
            System.out.println("Empty Node");
            return;
        }
        // when only one node is present in the Node
        if(tail.next==null){
            head=tail=null;
        }

        // When many node present in the LinkedList
        Node temp= head;
        // It will go before the tail Node
        while(temp.next.next!=null){
            temp= temp.next;
        }

        tail= temp;
        tail.next= null;
        size--;
    }

    // Display LinkedList
    void printLinkedList() {
        Node temp = head;
        if (head == null)
            System.out.println("Node is Empty!");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void getSize(){
        System.out.println("Size: "+size);
    }
}
