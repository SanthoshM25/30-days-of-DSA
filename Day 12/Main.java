class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

class LinkedList {
    Node head;

    void addFirst(int data){
        if(head == null) head = new Node(data);
        else{
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(int data){
        if(head == null) head = new Node(data);
        else{
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = new Node(data);
        }
    }

    void add(int data, int index){
        if(head == null) head = new Node(data);
        else if(index == 0){
            Node node = new Node(data);
            node.next = head;
            head = node;
        }
        else{
            int count = 0;
            Node previous = head;
            Node current = head;
            while(count != index){
                previous = current;
                current = current.next;
                count++;
            }
            Node node = new Node(data);
            previous.next = node;
            node.next = current;
        }
    }

    void deleteDuplicates(){
        if(head == null) return;
        Node current = head;
        Node nextNode = head.next;
        while(nextNode!=null){
            if(current.data == nextNode.data){
                current.next = nextNode.next;
                nextNode = nextNode.next;
            }else{
                current = current.next;
                nextNode = nextNode.next;
            }
        }
    }

    void print(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class Main
{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addFirst(5);
        list.addLast(10);
        list.addLast(10);
        list.addLast(100);
        list.addLast(100);
        list.add(20, 6);
        list.print();
        System.out.println();
        list.deleteDuplicates();
        list.print();
    }
}