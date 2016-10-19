package openBracketCodeSprint.FraudulentActivityNotifications;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



//Time out
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        long n = scanner.nextLong();
        int d = scanner.nextInt();
        List<Integer> expenditureList = new ArrayList<>();
        for(long i = 0; i < n; i++){
            int Ei = scanner.nextInt();
            expenditureList.add(Ei);
        }
        System.out.println(getSolution(expenditureList, d));
    }
    
    public static long getSolution(List<Integer> expenditureList, int d){
    	long notification = 0;
    	Integer[] temp = new Integer[0];
    	Integer[] expenditureArr = expenditureList.toArray(temp);
    	int size = expenditureList.size();
    	for(int i = 0; i < size-d; i++){
    		int firstIndex = expenditureArr[i];
    		if( isNotifaction(expenditureList.subList(0, d), expenditureList.get(d)) ){
    			notification++;
    		}
    		expenditureList.remove((Object)firstIndex);
    	}
        return notification;
    }
    
    public static boolean isNotifaction(List<Integer> expenditureList, int nextDay){
    	if(nextDay >= 2 * Collections.max(expenditureList)){
    		return false;
    	}
        Collections.sort(expenditureList);
        int subListLength = expenditureList.size();
        double median = 0;
        if(subListLength % 2 != 0){
        	median = expenditureList.get(subListLength/2);
        }else{
        	median = expenditureList.get( (subListLength - 1) / 2 ) + expenditureList.get( (subListLength + 1) / 2 );
        	median = median / 2;
        }
        return nextDay >= (2 * median);
    }
    
}