package algorithms.pangrams;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<String, Boolean> strMap = new HashMap<>();
        
        for(int i = 0 ; i < s.length(); i++){
            s = s.toLowerCase();
            s = s.replaceAll("\\s+","");
            
            strMap.put(s.substring(i, i+1), true);
            
            if(strMap.size() >= 26){
                System.out.print("pangram");
                return;
            }
        }
        System.out.print("not pangram");
    }
}