import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

class Solution {
    boolean validAnagram(String s1, String s2) {
        char tempS1Array[] = s1.toCharArray();
        Arrays.sort(tempS1Array);
        s1 = new String(tempS1Array);
        char tempS2Array[] = s2.toCharArray();
        Arrays.sort(tempS2Array);
        s2 = new String(tempS2Array);
        if (s1.equals(s2))
            return true;
        return false;
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
