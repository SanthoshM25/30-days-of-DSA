class ReverseKElements {
  // Function to reverse first k elements of a queue.
  public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
    Stack<Integer> stack = new Stack<Integer>();
    Queue<Integer> q2 = new LinkedList<>();

    for (int i = 0; i < k; i++)
      stack.push(q.remove());

    while (!stack.isEmpty())
      q2.add(stack.pop());

    while (q.size() > 0)
      q2.add(q.remove());

    return q2;
  }
}
