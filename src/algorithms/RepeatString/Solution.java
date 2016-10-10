package algorithms.RepeatString;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int count = 0;
        long result = 0;
        int length = s.length();
        for(int i = 0; i < length; i++){
            if(s.substring(i,i+1).equals("a")){
                count ++;
            }
        }
        long divideCount = n / length;
        long remainCount = n % length;
        result = count * divideCount;
        for(int j = 0 ; j < remainCount; j++){
              if(s.substring(j,j+1).equals("a")){
                result ++;
            }
        }
        System.out.println(result);
        
    }
}
