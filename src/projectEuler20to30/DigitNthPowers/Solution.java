package projectEuler20to30.DigitNthPowers;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println(getSolution(N));
    }
	
	public static int getSolution(int N){
		int result = 0;
		int min = 100;
		int max = 600000;
		for(int j = min; j <= max; j++){
			int nDigitPower = checkNDigitPowers(j, N);
			if(j == nDigitPower){
//				System.out.println(nDigitPower);
				result += nDigitPower;
			}
		}
		
		return result;
	}
	
	public static int checkNDigitPowers(int j, int N){
		String numberToStr = String.valueOf(j);
		int sum = 0;
		int n = numberToStr.length();
		for(int i = 0; i < n; i++){
			String temp = numberToStr.substring(i, i+1);
			BigInteger powerOfTemp = new BigInteger(temp).pow(N);
			sum += powerOfTemp.intValue();
		}
		
		return sum;
	}
}
