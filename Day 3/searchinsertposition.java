import java.util.Scanner;
class Solution {
    public int searchinsertposition(int[] arr,int target) {
        int left=0,right=arr.length;
        while(left<right){
        int mid=(left+right)/2;
        if(arr[mid]<target){
            left=mid+1;
        }else{
            right=mid;
        }
    }
    return left;
    }
}
class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner inp = new Scanner(System.in);
        int target;
        System.out.println("Enter the no of elements in array: ");
        int n = inp.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = inp.nextInt();
        }
        System.out.println("Enter the target value");
        target = inp.nextInt();
        System.out.println(s.searchinsertposition(a,target));
    }
}
