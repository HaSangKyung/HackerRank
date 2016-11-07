package weekOfCode25.BetweenTwoSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	//Fail for testcase #2
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        int maximumFactor = 101;
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
            if(b[b_i] < maximumFactor){
            	maximumFactor = b[b_i]; 
            }
        }
        
        Set<Integer> factorSet = getFactorSet(maximumFactor);
        int result = factorSet.size();
        
        Iterator<Integer> iter = factorSet.iterator();
        while(iter.hasNext()){
        	int factor = iter.next();
        	for(int i = 0; i < n; i++){
        		if(factor % a[i] != 0){
        			result --;
        			break;
        		}
        	}
        }
        
        System.out.println(result);
        
    }
	
	public static Set<Integer> getFactorSet(int number){
		Set<Integer> factorSet = new HashSet<>();
		for(int i = 1; i <= Math.sqrt(number); i++){
			if(number % i == 0){
				factorSet.add(i);
				factorSet.add(number / i);
			}
		}
		
		return factorSet;
	}
	
}
