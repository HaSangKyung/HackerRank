package projectEuler20to30.NamesScores;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

	final static Map<Character, Integer> alphabetMap = new HashMap<>();
	
	Solution(){
		for(int i = 65; i <= 90; i++){
			alphabetMap.put((char)i, i-64);
		}
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Solution solution = new Solution();
    	Scanner scanner = new Scanner(System.in);
    	Map<String, Integer> nameScoreMap = new TreeMap<>();
    	
    	int N = scanner.nextInt();
    	int index = 1;
    	while(index <= N){
    		String name = scanner.next();
    		nameScoreMap.put(name, solution.getWorthOfName(name));
    		index++;
    	}
    	
    	int Q = scanner.nextInt();
    	while(Q >= 1){
    		int rank = 1;
    		String findName = scanner.next();
    		for(String key : nameScoreMap.keySet()){
    			System.out.println(key);
    			if(key.equals(findName)){
    				break;
    			}
    			rank++;
    		}
    		System.out.println(nameScoreMap.get(findName)*rank);
    		Q--;
    	}
    }
    
    public Integer getWorthOfName(String name){
    	
    	int sum = 0;
    	for(int i = 0; i < name.length(); i++){
    		sum += alphabetMap.get(name.charAt(i));
    	}
    	return sum;
    }
}