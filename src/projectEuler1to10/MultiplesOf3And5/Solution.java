package projectEuler1to10.MultiplesOf3And5;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
               
        for(int i = 0; i < T ;i ++){
            long total = 0;
            int N = scanner.nextInt();
          
            total += addNumber(3, N);
            total += addNumber(5, N);
            total -= addNumber(15, N);
            
            System.out.println(total);
        }
    }
    
    public static long addNumber(long index, long origin){
        long lastNumber = origin - origin%index;
        if(lastNumber == origin){
            lastNumber = lastNumber - index;
        }
        
        return  (index+lastNumber)*(lastNumber/index)/2;
    }
    
}