package projectEuler40to50.SelfPowers;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 
		 Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 BigInteger sum = new BigInteger("0");
		 
		 for(int i = 1; i <= n; i++){
			 sum = sum.add( new BigInteger(String.valueOf(i)).pow(i) );
		 }
		 
		 String sumOfPowers = sum.toString();
		 sumOfPowers = sumOfPowers.substring(sumOfPowers.length()-10);
		 System.out.println(Long.valueOf(sumOfPowers));
		 
	    }
}
