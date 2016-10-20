package projectEuler11to20.FactorialDigitSum;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scanner = new Scanner(System.in);
    	int T = scanner.nextInt();
    	while( T >= 1 )
    	{
    		int N = scanner.nextInt();
    		System.out.println(getSolution(N));
    	}
    }
    
    public static String getSolution(int N){
    	BigInteger factorialOfInput = new BigInteger("1");
    	for(int i = 1; i <= N; i++){
    		factorialOfInput = factorialOfInput.multiply(new BigInteger(String.valueOf(i)));
    	}
    	System.out.println(factorialOfInput.toString());
    	String sumToString = factorialOfInput.toString();
    	BigInteger digitSum = new BigInteger("0");
    	for(int j = 0; j < sumToString.length(); j++){
    		digitSum = digitSum.add(new BigInteger(sumToString.substring(j, j+1)));
    	}
    	
    	return digitSum.toString();
    }
}