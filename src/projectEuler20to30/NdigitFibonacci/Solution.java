package projectEuler20to30.NdigitFibonacci;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
	
	public static Map<Integer, BigInteger> fibonacciList = new TreeMap<>();
	public static Map<Integer, Integer> answerList = new TreeMap<>();
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		fibonacciList.put(1, new BigInteger("1"));
		fibonacciList.put(2, new BigInteger("1"));
		
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while(T >= 1){
			int N = scanner.nextInt();
			System.out.println(getSolution(N));
			T--;
		}
    }
	
	public static Integer getSolution(int N){
		if(answerList.get(N) != null){
			return answerList.get(N); 
		}else{
			int lastOfKey = 1;  
			int index = 3;
			
			for(Integer key : answerList.keySet()){
				lastOfKey = key;
				index = answerList.get(key);
			}
			
			for(int i = lastOfKey+1; i <= N; i++){
				while(true){
					if(getFibonacci(index).compareTo(new BigInteger("10").pow(i-1)) >= 0){
						break;
					}
					index++;
				}
				answerList.put(i, index);
			}
			return index;
		}
		
	}
	
	public static BigInteger getFibonacci(int index){
		if(fibonacciList.get(index) != null ){
			return fibonacciList.get(index); 
		}else{
			BigInteger newValue = getFibonacci(index-1).add(getFibonacci(index-2));
			fibonacciList.put(index, newValue);
			return newValue;
		}
	}
	
}
