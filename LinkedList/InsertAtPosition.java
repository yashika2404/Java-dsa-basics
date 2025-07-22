class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class InsertAtPosition {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(30);

        head = insertAtPos(head, 20, 2);
        printList(head);
    }

    static Node insertAtPos(Node head, int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return head;

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
