import java.util.*;

class Solution {
    boolean isCycle(Node head) {
        Node temp = head;
        Node tempTwo = head;
        while (tempTwo != null && tempTwo.next != null && temp != null) {
            temp = temp.next;
            tempTwo = tempTwo.next.next;
            if (temp == tempTwo)
                return true;
        }
        return false;
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class TwoPointer {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Node head = new Node(5);
        head.next = new Node(8);
        head.next.next = new Node(10);
        head.next.next.next = head.next;
        Solution s = new Solution();
        System.out.println(s.isCycle(head));
    }
}
