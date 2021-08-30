/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        while(N-->0){
            int n=sc.nextInt();
            Queue<String> q=new LinkedList<>();
            q.add("1");
            q.add("2");
            for(int i=1;i<n;i++){ 
      
            String curr=q.peek();
            q.remove();
            q.add(curr+"1");
            q.add(curr+"2");
            }
            System.out.println(q.peek());
	
}
}
}