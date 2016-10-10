package projectEuler11to20.problem14;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    Map<Long, Integer> historyMap = new HashMap<>();
    Map<Long, Long> answerMap = new HashMap<>();    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        
        int T = scanner.nextInt();
        while(T >= 1){
            long N = scanner.nextLong();
            System.out.println(solution.getSolution(N));
            T--;
        }
    }
    public long getSolution(long N){
        long input = N;
        long answer = 0;
        int maxCount = 0;
        
        while( N >= 1 ){
            int collatzCount = 0;
            if( answerMap.get(N) != null ){
                collatzCount = historyMap.get(answerMap.get(N));
                if ( collatzCount > maxCount ){
                    maxCount = collatzCount;
                    answer = answerMap.get(N);
                }
                break;
            }else{ 
                collatzCount = getCollatz(N);
                if ( collatzCount > maxCount ){
                    maxCount = collatzCount;
                    answer = N;
                }
                N --;
            }
        }
        answerMap.put(input, answer);
        return answer;
    }
    
    public int getCollatz(long N ){
        int result = 0;
        int count = 0;
        List<Long> linkedList = new ArrayList<>();
        while( N >= 1){
            //if already know result, then return result
            if(historyMap.get(N) != null){
                count += historyMap.get(N);
                break;
            }
            //Save number that we meet fisrt
            linkedList.add(N);
            
            if( N == 1){
                N = 0;
            }else if( N % 2 == 0 ){
                N = N / 2 ;
            }else{
                N = 3 * N + 1;
            }
            
            count++;
        }
        
        result = count;
        
        Iterator<Long> iterator = linkedList.iterator();
        
        while(iterator.hasNext()){
            historyMap.put(iterator.next(), count);
            count--;
        }
        
        return result;
    }
    
}