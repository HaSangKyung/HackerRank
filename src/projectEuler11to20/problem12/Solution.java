package projectEuler11to20.problem12;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    Map<Integer, Long> answerMap = new HashMap<>();
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        int T = scanner.nextInt();
        while( T >= 1){
            int N = scanner.nextInt();    
            System.out.println(solution.getSolution(N));
            T--;
        }
        scanner.close();
    }
    
    public long getSolution(int N){
        long sum = 0;
        long i = 1;
        
        if(answerMap.get(N) != null){
            sum = answerMap.get(N);
            return sum;
        }
        
        while(true){
            sum += i;
            if(checkMax(sum, N) && getNumberOfDivisors(sum, N) ){
                break;
            }
            i++;
        }
        answerMap.put(N, sum);
        return sum;
    }
    
    public boolean checkMax(long number, int N){

        int half = N / 2;
        //System.out.println("---" + number);
        //System.out.println("---" + (half * (half + 1)));
        
        //System.out.println("---checkMax ---");
        return number >  half * (half + 1);
        
    }
    
    public boolean getNumberOfDivisors(long number, int N ){
        //System.out.println("--- start ---------------------");
        
        int maxDivisor = (int)Math.floor(Math.sqrt((double)number));
        //System.out.println("---maxDivisor : " + maxDivisor);
        
        int count = 0;
        boolean result = false;
       
       if(number == 1){
            //System.out.println("---break on : " + number);
            return 1 > N;
        }
        
        for(int i = 1; i <= maxDivisor; i++){
            
            //System.out.println("---start count : " + count);
            if( ( count + (maxDivisor - (i - 1 )) * 2 ) < N){
               // System.out.println("---break on count : " + count);
               // System.out.println("---because max is : " + ( count + (maxDivisor - i) * 2 ));
                result = false;
                break;
            }
            
            if(i * maxDivisor == number && number % i == 0 ){
               // System.out.println("---count+1 at index : " + i);
                count = count + 1;
            }else if( number % i == 0 ){
                //System.out.println("---count+2 at index : " + i);
                count = count + 2;
            }
            
            if( count > N ){
                //System.out.println("---break on count : " + count);
                result = true;
                break;
            }
            
            
        }
        
        return result;
    }
}