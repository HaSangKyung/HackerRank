package projectEuler20to30.LexicographicPermutations;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;


public class Solution {

	//static final String TARGET_STRING = "abcdefghijklm";
	static final String TARGET_STRING = "abcd";
	static final NavigableMap<Integer, BigInteger> factorialMap = new TreeMap<>();
	
	Solution(){
		BigInteger number = new BigInteger("1");
		for(int i = 1; i <= 13; i ++){
			String indexParseToStr = String.valueOf(i);
			number = number.multiply(new BigInteger(indexParseToStr));
			factorialMap.put(Integer.valueOf(indexParseToStr), number);
		}
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scanner = new Scanner(System.in);
    	Solution solution = new Solution();
    	int T = scanner.nextInt();
    	while( T >= 1){
    		BigInteger N = scanner.nextBigInteger();
    		System.out.println(getSolution(N));
    		T--;
    	}
    	
    }
    
    public static String getSolution(BigInteger N){
    	String givenString = TARGET_STRING;
    	int length = givenString.length() - 1; 
    	int max = findMaxFactorial(N);
    	for(int i = max; i >= 2; i--){ 
    		System.out.println("-------");
    		System.out.println("N : " + N.toString() + " divide : " + factorialMap.get(i-1));
     		BigInteger temp = N.divide(factorialMap.get(i-1));
     		System.out.println(temp.toString());
    		N = N.mod(factorialMap.get(i-1));
    		//if()
    		givenString = strSwap(givenString, max - i, max-i+temp.intValue());
    		
//    		System.out.println("+++");
    		//N = N.mod(factorialMap.get(i));
    		System.out.println(N.toString());
    		System.out.println(givenString);
    	}
    	
    	return givenString;
    }
    
    public static String strSwap(String str, int a, int b){
    	char[] charArr = str.toCharArray();
    	char t = charArr[a];
        charArr[a] = charArr[b];
        charArr[b] = t;
    	return String.valueOf(charArr);
    }
    
    public static int findMaxFactorial(BigInteger N){
    	int max = 0;
    	for(Integer key : factorialMap.keySet()){
//    		System.out.println(key);
    		if(factorialMap.get(key).compareTo(N) <= 0){
//    			System.out.println("key : " + key + "/ value : " + factorialMap.get(key));
//    			System.out.println("compare To : " + N);
    		}else{
    			max = key;
//    			System.out.println("key : " + key + "/ value : " + factorialMap.get(key));
//    			System.out.println("compare To : " + N);
//    			System.out.println("----- break -----");
    			break;
    		}
    	}
    	return max;
    }
}