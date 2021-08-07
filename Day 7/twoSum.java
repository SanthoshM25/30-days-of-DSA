import java.util.Scanner;

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


public class Main
{
	public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int numbers[] = new int[n];
        int target = inp.nextInt();
        for(int i = 0; i<n; i++){
            numbers[i] = inp.nextInt();
        }
        Solution s = new Solution();
        int a[] = s.twoSum(numbers, target);
        for(int i:a){
            System.out.print(i + " ");
        }
	}
}
