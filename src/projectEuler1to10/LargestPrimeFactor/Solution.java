package projectEuler1to10.LargestPrimeFactor;


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int T  = scanner.nextInt();
        while( T >= 1 ){
            Map<Long, Boolean> primeMap = new HashMap<>();
            long N = scanner.nextLong();
            long largestNumber = 0L;
            while(N > 1){
                long primeNumber = getPrimeNumber(N, primeMap);
                if( largestNumber < primeNumber ){
                    largestNumber = primeNumber;
                }
                N = N / primeNumber;
            }
            System.out.println(largestNumber);
            T--;
        }
    }
    
    public static long getPrimeNumber(long N, Map<Long, Boolean> primeMap ){
         for(long key : primeMap.keySet()){
             if( N % key == 0){
                 return key;
             }
         }
        for(long i = 2L; i <= N; i++){
            if( i * i > N){
                primeMap.put(N, true);
                return N;
            }
            if( N % i == 0){
                primeMap.put(i, true);
                return i;
            }
        }
        return N;
    }
}