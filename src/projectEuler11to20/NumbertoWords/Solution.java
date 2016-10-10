package projectEuler11to20.NumbertoWords;

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
    Map<String, String> numberMap;
    
    Solution(){
        numberMap = new HashMap<>();
        numberMap.put("1","One");
        numberMap.put("2","Two");
        numberMap.put("3","Three");
        numberMap.put("4","Four");
        numberMap.put("5","Five");
        numberMap.put("6","Six");
        numberMap.put("7","Seven");
        numberMap.put("8","Eight");
        numberMap.put("9","Nine");
        numberMap.put("10","Ten");
        numberMap.put("11","Eleven");
        numberMap.put("12","Twelve");
        numberMap.put("13","Thirteen");
        numberMap.put("14","Fourteen");
        numberMap.put("15","Fifteen");
        numberMap.put("16","SixTeen");
        numberMap.put("17","Seventeen");
        numberMap.put("18","Eighteen");
        numberMap.put("19","Nineteen");
        numberMap.put("20","Twenty");
        numberMap.put("30","Thirty");
        numberMap.put("40","Forty");
        numberMap.put("50","Fifty");
        numberMap.put("60","Sixty");
        numberMap.put("70","Seventy");
        numberMap.put("80","Eighty");
        numberMap.put("90","Ninety");
        numberMap.put("1001","Thousand");
        numberMap.put("1002","Million");
        numberMap.put("1003","Billion");
        numberMap.put("1004","Trillion");
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while(T >= 1){
            String N = scanner.next();
            System.out.println(solution.getSolution(N));
            T--;
        }
    }
    
    public String getSolution(String N){
        int length = N.length();
        
        if(new BigInteger(N).compareTo(new BigInteger("0")) == 0){
            return "Zero";
        }
       StringBuffer result = new StringBuffer();
        String greatestUnit = "";
        int unitNumber = (length-1) / 3;
        
        if(length % 3 != 0){
            int  temp = length % 3;
            for(int i =0; i < 3-temp; i++){
                N = "0"+N;
            }
        }
        //System.out.println("------remake" + N);
        for(int i = 1; i <= N.length()/3; i++){
            String threeNumber = N.substring(3*(i-1), 3*i);
            String letterNumber = getThreeNumberLetter(threeNumber) ;
            result.append(letterNumber);
            if(unitNumber >= 1 && !threeNumber.equals("000")){
                result.append(" ");
                result.append(numberMap.get("100"+unitNumber));
            }
             unitNumber --;
        }
        
        return result.toString().trim();
    }
    
    public String getThreeNumberLetter(String input){
        StringBuffer result = new StringBuffer();
        String hundredNumber = input.substring(0, 1);
        String tenNumber = input.substring(1, 2);
        String singleNumber = input.substring(2);
       // System.out.println("=== func : "+input);
        if(!hundredNumber.equals("0")){
            result.append(" ");
            result.append(numberMap.get(hundredNumber));
            result.append(" ");
            result.append("Hundred");
        }
        if(tenNumber.equals("0") && singleNumber.equals("0")){
       }else if(tenNumber.equals("0")){
            result.append(" ");
            result.append(numberMap.get(singleNumber));
        }else if(tenNumber.equals("1") ){
            result.append(" ");
            result.append(numberMap.get(tenNumber+singleNumber));
        }else if(singleNumber.equals("0")){
            result.append(" ");
             result.append(numberMap.get(tenNumber+"0"));
        }else{
            result.append(" ");
            result.append(numberMap.get(tenNumber+"0"));
            result.append(" ");
            result.append(numberMap.get(singleNumber));
        }
        
        return result.toString();
    }
    
}