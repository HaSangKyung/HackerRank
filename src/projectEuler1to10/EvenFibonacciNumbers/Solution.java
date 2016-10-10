package projectEuler1to10.EvenFibonacciNumbers;

import java.io.*;
import java.util.*;

public class Solution {

    static List<Long> fibonacciArray = new ArrayList<>();
    static Map<Integer, Long> sumMap = new HashMap<>();
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        //init
        fibonacciArray.add(1L);
        fibonacciArray.add(2L);
        sumMap.put(2, 2L);
        
        while( T >= 1 ){
            long N = scanner.nextLong();
            int index = 2;
            long result = 0L;
            
            while( fibonacci(index) < N ){
                index++;
            }
            for(Integer key : sumMap.keySet()){
                if(key < index){
                    result += sumMap.get(key);
                }
            }
            System.out.println(result);
            T--;
        }
        
        
    }
    
    public static long fibonacci(int index){
       int size = fibonacciArray.size();
       if(index >= size){
            long inputValue = fibonacci( index - 2 ) + fibonacci( index - 1 );
            fibonacciArray.add(index, inputValue);
            if(inputValue % 2 == 0){
                sumMap.put(index, inputValue);
            }
            return inputValue;
        }
        
        return fibonacciArray.get(index).longValue();
    }
    

}