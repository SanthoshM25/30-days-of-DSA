import java.util.Scanner;

class Result {
    public int singleNumber(int[] nums) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s ^= nums[i];
        }
        return s;
    }
}

public class Main {

    public static void main(String[] args) {
        Result r = new Result();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the no of elements in array: ");
        int n = inp.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = inp.nextInt();
        }
        System.out.println(r.singleNumber(a));
    }
}
