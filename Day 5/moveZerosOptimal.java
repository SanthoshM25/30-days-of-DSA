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
    }
}