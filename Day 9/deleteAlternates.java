class Solution {
    public void deleteAlternate (Node head){
        if(head == null) return;
        Node previous = head;
        Node current = head.next;
        while(previous !=null && current!=null){
            previous.next = current.next;
            previous = previous.next;
            current = null;
            if(previous != null) current = previous.next;
        }
    }
}
