package collectionInterface.list_interface.Linked_List;

public class Basic {

    // Print Recursively LinkedList
    public static void displayRecursively(Node head) {
        if (head == null) return;

        System.out.print(head.val + " ");
        displayRecursively(head.next);

    }
    // Print Normally
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // Link one node to another
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

//        display(a);
//        displayRecursively(a);

        System.out.println(getVal(a, 2));
    }

    public static int getVal(Node head, int idx){

        for(int i= 0; i<idx; i++){
            head= head.next;
        }
        return head.val;
    }

}
