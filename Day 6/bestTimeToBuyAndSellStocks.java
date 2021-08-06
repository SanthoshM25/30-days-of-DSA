import java.util.Scanner;

class Solution {
    public void maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]) profit+= prices[i] - prices[i-1];
        }
        System.out.print(profit);
    }
}


public class Main
{
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
		System.out.print("Enter no.of.digits: ");
		int n = inp.nextInt();
		int prices[] = new int[n];
		for(int i = 0; i<n; i++){
		    prices[i] = inp.nextInt();
		}
		Solution s = new Solution();
		s.maxProfit(prices);
	}
}
