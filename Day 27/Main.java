class Solution {
    // Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while (q.size() > 0)
            stack.push(q.remove());
        while (!stack.empty())
            q.add(stack.pop());
        return q;
    }
}