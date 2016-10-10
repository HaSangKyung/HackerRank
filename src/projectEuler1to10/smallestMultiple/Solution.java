package projectEuler1to10.smallestMultiple;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while( T >= 1 ){
            int N = scanner.nextInt();
            System.out.println(solution.getSolution(N));
            T--;
        }
    }
    
    public long getSolution(int N){
        long result = 1;
        for(int i = 1; i <= N; i++){
            result = getGB(result, i);
        }
        return result;
    }
    
    public long getGB(long X, long Y){
        long large = 0l;
        long small = 0l;
        
        if(X > Y){
            large = X;
            small = Y;
        }else{
            large = Y;
            small = X;
        }
        
        if(large % small == 0l ){
            return large;
        }else{
            List<Long> numArr = new ArrayList<>();
            int i = 1;
            long result = 1l;
            while(i <= small){
                if(large %i==0 && small %i==0){
                    numArr.add(Long.valueOf(String.valueOf(i)));
                    large = large / i;
                    small = small / i;
                    i = 1;
                }else if(i == small){
                    numArr.add(small);
                    numArr.add(large);
                }
                i++;
            }
            for( int j = 0; j < numArr.size(); j++){
                result = numArr.get(j) * result;
            }
            return result;
        }
    }
}