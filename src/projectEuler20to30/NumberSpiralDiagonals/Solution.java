package projectEuler20to30.NumberSpiralDiagonals;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	static Map<BigInteger, BigInteger> sumMap = new HashMap<>(); 
	
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 Scanner scanner = new Scanner(System.in);
		 int T = scanner.nextInt();
		 sumMap.put(new BigInteger("1"), new BigInteger("1"));
		 while(T >= 1){
			 BigInteger N = scanner.nextBigInteger();
			 System.out.println(getSolution(N));
			 T--;
		 }
		 
	 }
	 
	 public static String getSolution(BigInteger N){
		 BigInteger index = N.add(new BigInteger("1")).divide(new BigInteger("2")); 
		 BigInteger mouduler = new BigInteger("10").pow(9).add(new BigInteger("7"));
		 return getNthSum(index).mod(mouduler).toString();
	 }
	 
	 public static BigInteger getNthSum(BigInteger index){
		 return getRightUpperDigonalSum(index)
				 .add(getRightLowerDigonalSum(index))
				 .multiply(new BigInteger("2"))
				 .subtract(new BigInteger("3"));
	 }
	 
	 public static BigInteger getRightUpperDigonalSum(BigInteger index){
		 // Sigma (N-1)^2 = Sigma (4N^2 - 4N + 1)
		 return getSquareOfSigma(index).multiply(new BigInteger("4"))
				 .subtract(getKOfSigma(index).multiply(new BigInteger("4")))
				 .add(index);
	 }
	 
	 public static BigInteger getRightLowerDigonalSum(BigInteger index){
		// Sigma K^2-3K+3, And K = (2N-1) 
		// Sigma (2N-1)^2-3(2N-1)+3 = 4N^2 - 10N + 7
		return getSquareOfSigma(index).multiply(new BigInteger("4"))
				.subtract(getKOfSigma(index).multiply(new BigInteger("10")))
				 .add(index.multiply(new BigInteger("7")));
	 }
	 
	 public static BigInteger getSquareOfSigma(BigInteger number){
		  /* n(n+1)(2n+1)/6 */
		 return number.multiply(number.add(new BigInteger("1")))
				 .multiply(number.multiply(new BigInteger("2")).add(new BigInteger("1")))
				 .divide(new BigInteger("6"));
	 }
	 
	 public static BigInteger getKOfSigma(BigInteger number){
		 /*n(n+1)/2*/
		 return number.multiply(number.add(new BigInteger("1"))).divide(new BigInteger("2"));
	 }
}
