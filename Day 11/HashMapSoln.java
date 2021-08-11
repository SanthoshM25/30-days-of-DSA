import java.util.*;

class Solution {
    boolean isCycle(Node head) {
        Node temp = head;
        Map<Integer, Integer> map = new HashMap<>();
        while (temp != null && temp.next != null) {
            if (map.containsKey(temp.data))
                return true;
            map.put(temp.data, 1);
            temp = temp.next;
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

public class HashMapSoln {
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
