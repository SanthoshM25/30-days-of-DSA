import java.util.Stack;

public class Mainn{
    public static void reversestring(String str) {

        Stack<Character> s = new Stack<Character>();
        for (char c : str.toCharArray()) {
            s.push(c);
        }
        StringBuffer reverse = new StringBuffer();
        while (!s.isEmpty()) {
            reverse.append(s.pop());
        }

        System.out.println(reverse.toString());
    }

    public static void main(String[] args) {
        String s="Geeksforgeeks";
        reversestring(s);
    }


}