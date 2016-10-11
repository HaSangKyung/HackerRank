package algorithms.sorting.IntroToTutorialChallenge;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int size = scanner.nextInt();
        int count = 0;
        while(size >= 1){
            int input = scanner.nextInt();
            if(input == n ){
                break;
            }
            count++;
            size--;
        }
        System.out.println(count);
    }
}