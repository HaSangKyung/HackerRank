package algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumDistances {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        Map<Integer, Integer> numberMap = new HashMap<>();
        Map<Integer, Integer> minMap = new HashMap<>();
        
        int[] numberArr = new int[10];
        int[] minArr = new int[10];
   
        int min = -1;
        for(int j = 0; j < A.length; j++){
            int numberOfIndex = A[j];
            
            //(numberMap.get(numberOfIndex) != null)
            if( numberMap.get(numberOfIndex) != null){
                //numberMap.get(numberOfIndex)
                int distance = Math.abs(j - numberMap.get(numberOfIndex));
                if(distance == 1){
                    min = distance;
                    break;
                    //minMap.get(numberOfIndex)
                }else if(minMap.get(numberOfIndex) == null || distance < minMap.get(numberOfIndex)){
                    minMap.put(numberOfIndex, distance);
                    //minArr[numberOfIndex] = distance;
                } 
            }
            numberMap.put(numberOfIndex, j);
            //numberArr[numberOfIndex] = j;
        }
        
        for(int key : minMap.keySet()){
            if(min < 0 || minMap.get(key) < min){
                min = minMap.get(key);
            }
        }
        
        System.out.println(min);
    }
}
