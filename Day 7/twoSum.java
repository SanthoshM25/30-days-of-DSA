class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a[] = new int[2];
        int l=0,r=numbers.length-1;
        while(l<r)
        {
            if(numbers[l]+numbers[r]==target){
                a[0] = l+1;
                a[1] = r+1;
                return a;
            }
            else if(numbers[l]+numbers[r]>target)
                r--;
            else
                l++;
        }
        return a;
    }
}