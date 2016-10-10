package algorithms.compareTheTriplets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] aliceArr = new int[3];
        int[] bobArr = new int[3];
        int alice = 0;
        int bob = 0;
        
        for( int i = 0 ;i < 3; i++){
            aliceArr[i] = in.nextInt();
        }
        for( int i = 0 ;i < 3; i++){
            bobArr[i] = in.nextInt();
        }
        for( int i = 0 ;i < 3; i ++){
            int result = comparison(aliceArr[i], bobArr[i]);
            if(result == -1){
                alice ++;
            }else if(result == 1){
                bob++;
            }
        }
        System.out.println(alice+" "+bob);
    }
    
    public static int comparison(int a, int b){
        if( a > b ){
            return -1;
        }else if( a < b ){
            return 1;
        }else{
            return 0;
        }
    }
}
