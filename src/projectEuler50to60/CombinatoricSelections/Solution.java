package projectEuler50to60.CombinatoricSelections;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	static Map<Integer, BigInteger> factorialMap = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		factorialMap.put(0, new BigInteger("1"));
		
		int N = scanner.nextInt();
		long K = scanner.nextLong();
		System.out.println(getSolution(N, K));
		
	}
	
	public static int getSolution(int N, long K){
		int result = 0;
		for(int i = 1; i <= N; i++){
			result += getCombination(i, K);
		}
		return result;
	}
	
	public static int getCombination(int i, long K){
		int result = 0;
		if(checkMaxCombination(i, (i+1)/2).compareTo(new BigInteger(String.valueOf(K))) != 1){
			return result;
		}else{
			for(int j = i/2; j >= 0; j-- ){
				if( checkMaxCombination(i, j).compareTo(new BigInteger(String.valueOf(K))) == 1){
					result++;
				}else{
					break;
				}
			}
		} 
		
		if( i % 2 == 0){
			return result * 2 - 1;
		}else{
			return result * 2;
		}
	}
	
	public static BigInteger checkMaxCombination(int n, int r){
		BigInteger bunja = null;
		BigInteger bunmo = null;
		
		if( (n-r) > r ){
			bunja = getFactorial(n, n-r+1);
			bunmo = getFactorial(r);
		}else{
			bunja = getFactorial(n, r+1);
			bunmo = getFactorial(n-r);
		}
		
		return bunja.divide(bunmo);
	}
	
	public static BigInteger getFactorial(int target){
		if(factorialMap.get(target) != null){
			return factorialMap.get(target); 
		}
		
		BigInteger result = new BigInteger("1");
		for(int i = 2; i <= target; i++){
			result = result.multiply(new BigInteger(String.valueOf(i)));
		}
		factorialMap.put(target, result);
		return result;
	}
	
	public static BigInteger getFactorial(int target, int start){
		BigInteger result = new BigInteger("1");
		for(int i = start; i <= target; i++){
			result = result.multiply(new BigInteger(String.valueOf(i)));
		}
		
		return result;
	}
	
}
