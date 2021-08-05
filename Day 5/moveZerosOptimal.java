import java.util.Scanner;

class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = 0, temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[nonZero];
                nums[nonZero++] = nums[i];
                nums[i] = temp;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter no of digits: ");
        int n = inp.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = inp.nextInt();
        }
        Solution s = new Solution();
        s.moveZeroes(nums);
    }
}