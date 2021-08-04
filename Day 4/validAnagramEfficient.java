import java.util.Scanner;

class Solution {
    boolean validAnagram(String s1, String s2) {
        int arr[] = new int[26];
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }
        for (int count : arr) {
            if (count > 0)
                return false;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1 = inp.nextLine();
        System.out.println("Enter string 2");
        String s2 = inp.nextLine();
        Solution s = new Solution();
        boolean result = s.validAnagram(s1, s2);
        System.out.println(result);
    }
}