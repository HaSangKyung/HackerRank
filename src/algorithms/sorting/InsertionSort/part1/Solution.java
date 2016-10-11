package algorithms.sorting.InsertionSort.part1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int arrSize = ar.length;
        int temp = 0;
        for(int i = 0; i < arrSize; i++){
            for(int j = 1; j < arrSize - i; j++){
                if(ar[j - 1] > ar[j]){
                    temp = ar[j];
                    ar[j] = ar[j - 1];
                    printArray(ar);
                    ar[j - 1] = temp;
                }
            }
        }
        printArray(ar);
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
