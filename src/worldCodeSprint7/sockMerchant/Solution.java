package worldCodeSprint7.sockMerchant;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        System.out.println(solution.solveSolution(c));
    }
    
    public int solveSolution(int[] inputArray ){
        Map<Integer, Integer> countMap = new HashMap<>();
        int pairOfSocks = 0;
        for(int i = 0; i < inputArray.length; i++){
            Integer sock = Integer.valueOf(inputArray[i]);
            if(countMap.get(sock) != null ){
                countMap.put(sock, countMap.get(sock) + 1 );
            }else{
                countMap.put(sock,  1 );
            }
        }
        
        for(Integer key : countMap.keySet() ){
            pairOfSocks += countMap.get(key) / 2 ;
        }
        return pairOfSocks;
    }
}
