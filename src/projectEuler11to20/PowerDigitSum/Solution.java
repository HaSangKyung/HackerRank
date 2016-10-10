package projectEuler11to20.PowerDigitSum;


import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        int T = scanner.nextInt();
        while(T >= 1){
            int N = scanner.nextInt();
            System.out.println(solution.getSolution(N).toString());
            T--;
        }
    }
    
    public BigInteger getSolution( int N ){
        
        BigInteger result = new BigInteger("0");
        BigInteger powOfTwo = new BigInteger("2").pow(N);
        String numberToString = powOfTwo.toString();
        for(int i =0; i < numberToString.length(); i++){
            result = result.add(new BigInteger(numberToString.substring(i, i+1)));
        }
        return result;
    }
    
}