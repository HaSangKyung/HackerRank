package projectEuler1to10.largestPalindrome;

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
            System.out.println(solution.getSolution(N - 1));
            T--;
        }
    }
    
    public long getSolution(long N){
        Solution sol = new Solution();
        while( N >= 10000L ){
            if(sol.getPalindromeYn(N)){
                long result = sol.getFactor(N);
                if(result > 0L ){
                    return result;
                }
            }
            N--;
        }
        return 0L;
    }
    
    public boolean getPalindromeYn(long input){
        String inputToString = String.valueOf(input);
        int index = 0;
        int stringLength = inputToString.length();
        while( index < stringLength / 2 ){
            if(inputToString.charAt(index) != inputToString.charAt((stringLength-1)-index)){
                return false;
            }
            index++;
        }
        return true;
    }
    
    public long getFactor(long input){
        double max = Math.ceil(Math.sqrt(Double.parseDouble(String.valueOf(input))));
        for(int min = (int)Math.ceil(input/999f); min <= max; min++){
            if(input % min == 0){
               return input;
            }
        }
        return 0l;
    }
}