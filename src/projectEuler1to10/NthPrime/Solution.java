package projectEuler1to10.NthPrime;


import java.io.*;
import java.util.*;

public class Solution {

    static List<Long> primeList = new ArrayList<>();
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        primeList.add(2L);
        primeList.add(3L);
        int T = scanner.nextInt();
        while( T >= 1){
            int N = scanner.nextInt();
            System.out.println(solution.getSolution(N));
            T--;
        }
    }
    
    public long getSolution(int N){
        //N = 6
        long result = 0;
        int size = primeList.size();
        long increaseNumber = primeList.get(size - 1) + 2 ;
        while(increaseNumber > 0){ 
            for(int i = 0; i < primeList.size(); i++){
                Long boonmo = primeList.get(i);
                 if(increaseNumber % boonmo == 0){
                    break;
                }else if(boonmo * boonmo > increaseNumber){
                    primeList.add(increaseNumber);
                    break;
                }
            }
            if(primeList.size() == N){
                break;
            }
            increaseNumber = increaseNumber + 2;
        }
        return primeList.get(N - 1);
    }
}
