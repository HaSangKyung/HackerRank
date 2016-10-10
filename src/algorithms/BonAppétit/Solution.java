package algorithms.BonAppétit;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int index = 0;
        int sum = 0;
        while(index < n ){
            int c = scanner.nextInt();    
            if( index != k ){
                sum += c;
            }
            index++;
        }               
        int b = scanner.nextInt();
        if( b == sum/2){
            System.out.println("Bon Appetit");
        }else if(b - sum/2 >= 0){
            System.out.println(b - sum/2);
        }else{
            System.out.println(0);
        }
        
    }
}