import java.util.Scanner;

class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
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