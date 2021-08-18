import java.util.Stack;

class ArrayStack {
    int[] arr = new int[100];
    int top = -1;

    void push(int data){
        if(top == arr.length-1){
            int[] temp = arr;
            arr = new int[arr.length * 2];
            for(int i = 0; i<temp.length; i++) arr[i] = temp[i];
        }
        top++;
        arr[top] = data;
    }

    int pop(){
        return arr[top--];
    }

    int peek(){
        return arr[top];
    }

    boolean isEmpty(){
        return (top == -1) ? true : false;
    }

    void print(){
        for(int i = 0; i<=top; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


class Solution{
    boolean pairChecker(String str){
        if(str=="") {
            throw new IllegalArgumentException("Enter a valid string");
        }

        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == '(' || ch=='[' || ch=='<'){
                stack.push(ch);
            }else if(ch == ')' || ch==']' || ch=='>'){
                if(stack.empty()) return false;
                switch (ch){
                    case ')':
                        if(stack.peek() == '(') {
                            stack.pop();
                            break;
                        }
                    case ']':
                        if(stack.peek() == '[') {
                            stack.pop();
                            break;
                        }
                    case '>':
                        if(stack.peek() == '<'){ 
                            stack.pop();
                            break;
                        }
                    default:
                        return false;
                }
            }
        }
        if(!stack.empty()) return false;
        return true;
    }
}

public class Main {

    public static void main(String[] args) {
        String str = "";
        Solution s = new Solution();
        System.out.println(s.pairChecker(str));
    }

}
