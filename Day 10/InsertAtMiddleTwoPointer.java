import java.util.Scanner;

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void print() {
        if (head == null)
            return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtMid(int data) {
        if (head == null)
            head = new Node(data);
        else {
            Node newNode = new Node(data);
            Node temp = head;
            Node temp2 = head;
            while (temp != null && temp.next != null) {
                temp = temp.next.next;
                if (temp == null)
                    break;
                temp2 = temp2.next;
            }
            newNode.next = temp2.next;
            temp2.next = newNode;
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class InsertAtMiddleTwoPointer {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Enter no of elements in the list");
        int n = inp.nextInt();
        for (int i = 0; i < n; i++) {
            list.insert(inp.nextInt());
        }
        System.out.println("Enter the value to be inserted");
        int data = inp.nextInt();
        list.insertAtMid(data);
        list.print();
    }
}
