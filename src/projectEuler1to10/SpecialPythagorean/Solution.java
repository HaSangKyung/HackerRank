package projectEuler1to10.SpecialPythagorean;


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while( T >= 1)
        {
            int N = scanner.nextInt();
            System.out.println(solution.getSolution(N));
            T--;
        }
    }
    
    public long getSolution(int N){
        Solution sol = new Solution();
        long result = -1l;
        for(int a = 1; a < N/3; a++){
            for(int b = a + 1; b <= (N - a)/2; b++){
                int c = N - b - a;
               /* System.out.println("a : " + a);
                    System.out.println("b : " + b);
                    System.out.println("c : " + c);
                    System.out.println("-----------------");*/
                if(a >= b  ){
                   break;
               }else if(b < c && (a + b > c) && sol.calPythagorean(a,b,c)){
                   long temp = a* b* c;
                    //System.out.println(temp);
                   if( temp > result ){
                       result = temp;
                   }
               }                 
            }
        }
        
        return result;
    }
    
    public boolean calPythagorean(int a , int b , int c){
        
        return (a*a+b*b) == c*c;
    }
}