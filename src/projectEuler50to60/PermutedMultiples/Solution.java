package projectEuler50to60.PermutedMultiples;

import java.util.Scanner;

public class Solution {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 /*int N = scanner.nextInt();
		 int K = scanner.nextInt();
		 
		 System.out.println(getSolution(N, K));*/
		 	int n = scanner.nextInt();
	        
	        String symbol = "#";
	        
	        for(int i = 1; i <= n; i++){
	            System.out.println(String.format("%"+n+"s",symbol));
	            symbol+="#";
	        }
		 
	    }
	 
	 public static int getSolution(int N, int K){
		 int length = String.valueOf(N).length();
		 int t = N;
		 for(int i = 2; i <= K; i++){
			 if(String.valueOf(t*i).length() == length){
				 System.out.println(t*i);
			 }
		 }
		 
		 return 0;
	 }
}
