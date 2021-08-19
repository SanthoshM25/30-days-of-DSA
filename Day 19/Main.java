class TwoStacks {
    int size, top1, top2;
    int[] arr;

    //default constructor
    public TwoStacks(){
        size = 100;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    void push1(int x)
    {
        if(top1 == 49) return;
        else arr[++top1] = x;
    }

    //Function to push an integer into the stack2.
    void push2(int x)
    {
        if(top2 == 50) return;
        else arr[--top2] = x;
    }

    //Function to remove an element from top of the stack1.
    void pop1()
    {
        if(top1 == -1) System.out.println(-1);
        else System.out.println(arr[top1--]);
    }

    //Function to remove an element from top of the stack2.
    void pop2()
    {
        if(top2 == size) System.out.println(-1);
        else System.out.println(arr[top2++]);
    }

    //Function to print all the elements in stack1.
    void print1(){
        if(top1 == -1) System.out.println(-1);
        else{
            System.out.println("Elements in Stack 2");
            for(int i = 0; i<=top1; i++)
                System.out.println(arr[i]);
        }
    }

    //Function to print all the elements in stack2.
    void print2(){
        if(top2 == 100) System.out.println(-1);
        else{
            System.out.println("Elements in Stack 2");
            for(int i = 99; i>=top2; i--)
                System.out.println(arr[i]);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks();
        ts.push1(5);
        ts.push1(6);
        ts.push1(10);
        ts.pop1();
        ts.push2(60);
        ts.push2(600);
        ts.pop2();
        ts.push2(6);
        ts.print1();
        ts.print2();
    }


}