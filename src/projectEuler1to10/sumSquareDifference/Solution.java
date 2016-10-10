package projectEuler1to10.sumSquareDifference;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while( T >= 1 ){
            long N = scanner.nextLong();
            System.out.println(solution.getSolution(N));
            T--;
        }
    }
    
    public long getSolution(long N){
        long squaresSum = getSquaresSum(N);
        long sum = getSum(N);
        long sumSquares = sum * sum;
        //System.out.println("squaresSum" + squaresSum);
        //System.out.println("sumSquares" + sumSquares);
        if(squaresSum > sumSquares){
            return squaresSum - sumSquares;
        }else{
            return sumSquares - squaresSum;
        }
    }
    public long getSum(long N){
        return (1+N)*N/2;
    }
    
    public long getSquaresSum(long N){
        return N*(N+1)*(2*N+1)/6;
    }
}