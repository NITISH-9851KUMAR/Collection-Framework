package Linked_List;

public class UserDefineLL {
    public static void main() {
        LinkeddList<Integer> ll = new LinkeddList<>();
        ll.addLastNode(10);
        ll.addLastNode(20);
        ll.addLastNode(30);
        ll.addFirstNode(5);
        ll.addFirstNode(1);
        ll.addLastNode(40);
        ll.addAt(2, 8);
        ll.addAt(1, 3);
        ll.addAt(5, 16);
        ll.addAt(9, 50);
        ll.addAt(11, 80);
        ll.display();
        ll.displayReverse();
        System.out.println();
        ll.displayAt(4);
    }

}
