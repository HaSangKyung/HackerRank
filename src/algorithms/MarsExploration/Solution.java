package algorithms.MarsExploration;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        String S = in.next();
        int length = S.length();
        for(int i = 0; i < length/3; i++){
            String temp = S.substring(3*i, 3*(i+1));
            //System.out.println(temp);
            if(!temp.equals("SOS")){
               count+=countSOS(temp); 
            }
        }
        System.out.println(count);
    }
    public static int countSOS(String str){
        int count = 0;
        String[] SOS = {"S","O","S"};
        for(int i=0 ;i<3;i++){
            if(!str.substring(i,i+1).equals(SOS[i])){
               count++; 
            }
        }
        return count;
    }
    
}
