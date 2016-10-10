package projectEuler11to20.LargeSum;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        BigInteger result = new BigInteger("0");
        while(N >= 1){
            String largeNumber = scanner.next();
            BigInteger bigInt = new BigInteger(largeNumber);
            result = result.add(bigInt);
            N--;
        }
        System.out.println(result.toString().substring(0, 10));
        
    }
}