class ArrayStack {
    int[] arr = new int[100];
    int top = -1;

    int min() {
        int minVal = arr[0];
        for (int i = 0; i <= top; i++) {
            if (arr[i] < minVal)
                minVal = arr[i];
        }
        return minVal;
    }

    void push(int data) {
        if (top == arr.length - 1) {
            int[] temp = arr;
            arr = new int[arr.length * 2];
            for (int i = 0; i < temp.length; i++)
                arr[i] = temp[i];
        }
        top++;
        arr[top] = data;
    }

    int pop() {
        return arr[top--];
    }

    int peek() {
        return arr[top];
    }

    boolean isEmpty() {
        return (top == -1) ? true : false;
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(5);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        stack.print();
        System.out.println(stack.min());
    }
}
