package projectEuler31to40.DigitFactorials;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 Scanner scanner = new Scanner(System.in);
		 int N = scanner.nextInt();
		 System.out.println(getSolution(N));
		 
	    }
	 
	 public static int getSolution(int N){
		 Map<String, Integer> factorialMap = new HashMap<>();
		 int result = 0;
		for(int j = 10; j < N; j++){
			String numberToString = String.valueOf(j);
//			System.out.println("Number : "+numberToString);
			int sum = 0;
			 for(int i = 0; i < numberToString.length(); i++ ){
				 String numberAtIndex = numberToString.substring(i, i+1);
				 Integer getNumber = factorialMap.get(numberAtIndex);
				 if( getNumber != null ){
				 }else{
					 getNumber = calFactorial(numberAtIndex);
					 factorialMap.put(numberAtIndex, getNumber);
//					 System.out.println("Put " + numberAtIndex + " : " + getNumber);
				 }
				 sum += getNumber;
			 }
			 if(sum % j == 0){
				 result += j;
//				 System.out.println("Sum : "+ sum);
//				 System.out.println("j : "+ j);
			 }
		} 
		 
		 return result;
	 }
	 
	 public static int calFactorial(String number){
		 int result = 1;
		 
		 if(Integer.valueOf(number) == 0){
			 return 1;
		 }
		
		 for(int i = 1; i <= Integer.valueOf(number); i++){
			 result *= i;
		 }
		 return result;
	 }
}
