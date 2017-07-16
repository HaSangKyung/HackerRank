package openBracketCodeSprint.ViralAdvertising;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double result = 0;
        double advertised = 5;
        while(n >= 1){
            double interestedPeople = Math.floor(advertised/2);
            result += interestedPeople;
            advertised = interestedPeople * 3;
            n--;
        }
        System.out.println((int)result);
    }
}