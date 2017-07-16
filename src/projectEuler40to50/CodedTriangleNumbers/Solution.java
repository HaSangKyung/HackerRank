package projectEuler40to50.CodedTriangleNumbers;

import java.util.Scanner;

public class Solution {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 Scanner scanner = new Scanner(System.in);
		 int T = scanner.nextInt();
		 while(T >= 1){
			 long tn = scanner.nextLong();
			 System.out.println(getSolution(tn));
			 T--;
		 }
		 
    }
	 
	 public static long getSolution(long tn){
		 long c = 2*tn;
		 long valueInRoot = 1 + 4*c;
		 
		 double root = Math.sqrt(valueInRoot);
		 
		 if(root == (long)root && (root - 1) % 2 == 0){
			 return (long)(root-1)/2;
		 }
		 return -1;
	 }
	 
}
