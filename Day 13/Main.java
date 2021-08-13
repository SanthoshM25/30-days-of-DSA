class Node{
    int data;
    Node prev;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

class LinkedList {
    Node head;

    void addElementAtPosition(int position, int data){
        int count = 0;
        Node temp = head;
        while(count != position){
            temp = temp.next;
            count++;
        }
        Node newNode = new Node(data);
        if(temp.next != null){
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
            newNode.next.prev = newNode;
        }
        else{
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void add(int data){
        if(head == null) head = new Node(data);
        else{
            Node temp = head;
            while(temp.next!=null) temp = temp.next;
            Node newNode = new Node(data);
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void print(){
        if(head==null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void printReverse(){
        if(head == null) return;
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(10);
        list.add(20);
        list.add(8);
        list.print();
        System.out.println();
        list.addElementAtPosition(3, 50);
        list.print();
    }
}
