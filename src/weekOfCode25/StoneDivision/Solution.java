package weekOfCode25.StoneDivision;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	long n = scanner.nextLong();
    	int m = scanner.nextInt();
    	Set<Long> integerSet = new HashSet<>();
    	while( m >= 1 ){
    		long si = scanner.nextLong();
    		integerSet.add(si);
    		m--;
    	}
    	Iterator<Long> iter = integerSet.iterator();
    	Long[] longArray = null;
    	integerSet.toArray(longArray);
    	int count = 0;
    	while(iter.hasNext()){
    		long next = iter.next();
    		if(n % next == 0){
    			count++;
    		}
    	}
    	
    	if(count % 2 == 1){
    		System.out.println("First");
    	}else{
    		System.out.println("Second");
    	}
    }
}
