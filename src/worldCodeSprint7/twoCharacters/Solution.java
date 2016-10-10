package worldCodeSprint7.twoCharacters;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        System.out.println(solution.solveSolution(len, s));
    }
    
    public int solveSolution(int len, String s){
        
        String input = s;
        int result = 0;
        boolean flag = true;
        Map<Character, Integer> characterCountMap = null;
        //int index = 0;
              
        //Fisrt, Delete Consecutive and Count each Characters
        while( input.length() >= 2 && flag ){
            characterCountMap = new HashMap<>();
            char[] charArray = input.toCharArray();
            //System.out.println("------- : " + input);
            for(int i = 0; i < charArray.length; i++){
                if(i < (charArray.length - 2) && charArray[i] == charArray[i + 1]){
                    input = input.replaceAll(String.valueOf(charArray[i]), "");
                    break;
                }else if(characterCountMap.get(charArray[i]) != null){
                    //System.out.println("key + 1 : " + charArray[i]);
                    characterCountMap.put(charArray[i], characterCountMap.get(charArray[i]) + 1);
                }else{
                    //System.out.println("key = 1 : " + charArray[i]);
                    characterCountMap.put(charArray[i], 1);
                }
                if( i == charArray.length - 1){
                    flag = false;
                }
            }
        }
        
        //NavigableSet<Character> keys = new TreeSet<Character>(characterCountMap.);
        if( !flag ){ 
            characterCountMap = sortByValue(characterCountMap);
            Character[] keyArray =  characterCountMap.keySet().toArray(new Character[0]);

            for(int i = 0; i < keyArray.length; i++){
                char first = keyArray[i];
                //System.out.println("fisrt key : " + first);
                int firstCount = characterCountMap.get(keyArray[i]);
                //System.out.println("fisrt count : " + firstCount);
                for(int j = i + 1; j < keyArray.length; j++){
                    char second = keyArray[j];
                    //System.out.println("second key : " + second);
                    int secondCount = characterCountMap.get(keyArray[j]);
                    //System.out.println("second count : " + secondCount);
                    String temp = input;
                    if(firstCount == secondCount || firstCount == (secondCount + 1)){
                        for(int k = 0; k < keyArray.length; k++){
                            if( keyArray[k] != first && keyArray[k] != second ){
                                temp = temp.replaceAll(String.valueOf(keyArray[k]), "");            
                            }
                        }
                        //System.out.println("-- temp : " + temp);
                        if( result > firstCount + secondCount){
                            return result;
                        }else if(checkConsecutive(temp.toCharArray())){
                            result = firstCount + secondCount;
                        }
                    }else{
                        break;
                    }
                }    
            }
        }
        return result;
    }
    
    public boolean checkConsecutive(char[] charArray){
        for(int i = 0; i < charArray.length - 1; i++){
            if( charArray[i] == charArray[i+1] ){
                return false;
            }
        }
        return true;
    }
   
    public Map<Character, Integer> sortByValue( Map<Character, Integer> unsortMap ) {

         //reference by https://www.mkyong.com/java/how-to-sort-a-map-in-java/
         
        // 1. Convert Map to List of Map
        List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
     
    
}
