package algorithms.JumpingOnTheClouds;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int flag = 0;
        int count = 0;
        
        for(int i = 0; i < c.length; i ++){
            
            if(i == c.length - 1){
                if(flag > 0){
                    count++;    
                }
            }else {
                int now = c[i];
                int next = c[i+1];
                if(now == 0 && next == 0 && flag > 0){
                    count++;
                    flag = 0;
                }else if( now == 0 && next == 0){
                    flag ++;
                }else if( now == 0 && next == 1 && flag > 0){
                    count += 2;
                    i++;
                    flag = 0;
                }else if( now == 0 && next == 1){
                    count ++;
                    i++;
                }
            } 
        }
        
        System.out.println(count);
    }
}
