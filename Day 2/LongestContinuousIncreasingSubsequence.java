import java.util.Scanner;

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 0, max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                count++;
            }
            if (nums[i] >= nums[i + 1] || i + 1 == nums.length - 1) {
                if (max < count) {
                    max = count;
                }
                count = 0;
            }
        }
        return max + 1;
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
        System.out.println(s.findLengthOfLCIS(a));
    }
}
