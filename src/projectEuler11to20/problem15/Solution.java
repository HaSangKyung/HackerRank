package projectEuler11to20.problem15;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        int T = scanner.nextInt();
        while( T >= 1 ){
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            System.out.println(solution.getSolution(N, M));
            T --;
        }
    }
    
    public String getSolution(int N, int M){
        BigInteger bigInteger = new BigInteger("1");
       // System.out.println(N+":"+ M);
        int largestNumber = 0;
        int smallestNumber = 0;
        if( N > M ){
            largestNumber = N;
            smallestNumber = M;
        }else{
            largestNumber = M;
            smallestNumber = N;
        }
        //System.out.println("------");
        
        //System.out.println(largestNumber+":"+ smallestNumber);
        for(int i = largestNumber + 1; i <= N+M; i++){
            bigInteger = bigInteger.multiply(new BigInteger(String.valueOf(i)));
        }
        //System.out.println("------"+bigInteger.toString());
        for(int j = smallestNumber; j > 1; j--){
            bigInteger = bigInteger.divide(new BigInteger(String.valueOf(j)));
        }
        
        return bigInteger.mod(new BigInteger("10").pow(9).add((new BigInteger("7")))).toString();
        
    }
}