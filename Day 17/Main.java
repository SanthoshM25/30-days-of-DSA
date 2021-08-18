import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public long[] findElements( long a[], long n)
    {
        Arrays.sort(a);
        long[] b;
        b= new long[(int)(n-2)];
        for(int i = 0; i<n-2; i++){
            b[i] = a[i];
        }
        return b;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("No.of.elements: ");
	    int n = inp.nextInt();
		long a[] = new long[(int)(n)];
		for(int i = 0; i<n; i++) a[i] = inp.nextInt();
		Solution  s = new Solution();
		long[] b = (s.findElements(a, n));
	    for(long i : b) System.out.print(i + " ");
	    
	}
}
