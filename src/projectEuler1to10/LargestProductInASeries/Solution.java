package projectEuler1to10.LargestProductInASeries;


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T >= 1){
            int K = scanner.nextInt();
            int N = scanner.nextInt();
            String NdigitNumber = scanner.next();
            System.out.println(solution.getSolution(K, N, NdigitNumber));
            T--;
        }
    }
    
    public long getSolution(int K, int N, String NdigitNumber){
        long largestNumber = 0L;
        int lastIndex = 0;
        while( lastIndex <= K - N ){
            long NdigitProduct = 1L;
            for(int j = lastIndex; j < N + lastIndex; j++){
                String stringOfIndexJ = NdigitNumber.substring(j, j+1);
                if(stringOfIndexJ.equals("0")){
                    lastIndex = j + 1;
                    break;
                }else{
                    NdigitProduct = NdigitProduct * Long.valueOf(stringOfIndexJ); 
                }
                if( j + 1 == lastIndex + N ){
                    if(NdigitProduct > largestNumber){
                        largestNumber = NdigitProduct;
                    }
                    lastIndex++;
                    break;
                }
            }
        }
        
        return largestNumber;
    }
}