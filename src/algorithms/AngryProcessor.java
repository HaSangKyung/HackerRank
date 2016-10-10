package algorithms;

import java.io.*;
import java.util.*;

public class AngryProcessor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while( T >= 1){
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            String result = "YES";
            int count = 0;
            for(int i = 0; i < N; i++ ){
                int temp = scanner.nextInt();
                if(temp <= 0){
                    count++;
                }
                if(count >= K){
                    result = "NO";
                }
            }
            System.out.println(result);
            T--;
        }
        
        
    }
}