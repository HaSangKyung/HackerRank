package algorithms.FibonacciModified;

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String t1 = scanner.next();
        String t2 = scanner.next();
        int n = scanner.nextInt();
        List<BigInteger> arrayList = new ArrayList<>();
        arrayList.add(new BigInteger(t1));
        arrayList.add(new BigInteger(t2));
        int index = 0;
        while(index < n){
            arrayList.add(modFibonacci(arrayList.get(index), arrayList.get(index+1)));
            index++;
        }
        System.out.println(arrayList.get(n-1));
    }
    
    public static BigInteger modFibonacci(BigInteger num1, BigInteger num2){
        
        return num1.add(num2.pow(2));
    }
    
}