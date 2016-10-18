package projectEuler11to20.MaximumPathSum1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner scanner = new Scanner(System.in);
    	int T = scanner.nextInt();
    	while(T >= 1 ){
    		int N = scanner.nextInt();
    		List<Long> numberList = new ArrayList<>(); 
    		for(int i = 0; i < N; i++){
        		for(int j = 0; j < i+1; j++){
        			long numbers = scanner.nextLong();
        			numberList.add(numbers);
        		}
        	}
    		System.out.println(getSolution(numberList, N));
    		T--;
    	}
    }
    
    public static String getSolution(List<Long> numberList, int height){
    	int level = 1;
    	for(int i = 0; i < height; i++){
    		for(int j = 0; j < level; j++){
    			numberList.get(j);
    		}
    	}
    	
		return null;
    	
    }
    
}

