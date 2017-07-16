package projectEuler50to60.CombinatoricSelections;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
	static SortedMap<Integer, BigInteger> factorialMap = new TreeMap<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		factorialMap.put(0, new BigInteger("1"));
		factorialMap.put(1, new BigInteger("1"));
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
		return getFactorial(n).divide(getFactorial(r).multiply(getFactorial(n-r)));
	}
	
	public static BigInteger getFactorial(int target){
		if(factorialMap.get(target) != null){
			return factorialMap.get(target); 
		}else{
			int lastKey = factorialMap.lastKey();
			BigInteger lastValue = factorialMap.get(lastKey);
			for(int i = lastKey+1; i<= target; i++){
				lastValue = lastValue.multiply(new BigInteger(String.valueOf(i)));
				factorialMap.put(i, lastValue);
			}
			return lastValue;
		}
	}
}
