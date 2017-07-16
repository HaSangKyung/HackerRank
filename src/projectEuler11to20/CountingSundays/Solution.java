package projectEuler11to20.CountingSundays;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner scanner = new Scanner(System.in);
    	int T = scanner.nextInt();
    	
    	while( T >= 1 ){
			long year = scanner.nextLong();
			int month = scanner.nextInt();
			int dayOfMonth = scanner.nextInt();
			GregorianCalendar date = null;
			if(year > Integer.MAX_VALUE){
				date = setDate(year, month, dayOfMonth);
			}else{
				date = new GregorianCalendar((int)year, month, dayOfMonth);
			}
			System.out.println(date.get(GregorianCalendar.YEAR));
			System.out.println(date.get(GregorianCalendar.MONTH));
			System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH));
			//GregorianCalendar date = new GregorianCalendar(year, month, dayOfMonth);
    		
    		T--;
    	}
    	
    }
    
    public static GregorianCalendar setDate(long year, int month, int dayOfMonth){
    	GregorianCalendar date = new GregorianCalendar(1900, month, dayOfMonth);
    	year -= 1900;
    	while(year > Integer.MAX_VALUE){
    		date.add(GregorianCalendar.YEAR, Integer.MAX_VALUE);
    		year -= Integer.MAX_VALUE;
    	}
    	date.add(GregorianCalendar.YEAR, (int)year);
    	return date;
    }
}