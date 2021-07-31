import java.util.Scanner;

class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the no of elements in array: ");
        int n = inp.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = inp.nextInt();
        }
        System.out.println(s.singleNumber(a));
    }
}
