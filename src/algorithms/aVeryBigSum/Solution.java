package algorithms.aVeryBigSum;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Long> numberList = new ArrayList<>();
        while( N >= 1){
            long A = scanner.nextLong();
            numberList.add(A);
            N --;
        }
        System.out.println(getSum(numberList));
    }
    
    public static long getSum(List<Long> numberList){
        long result = 0L;
        for(int i = 0; i<numberList.size(); i++){
            result = numberList.get(i) + result;
        }
        return result;
    }
}