package projectEuler31to40.DoubleBasePalindromes;

import java.util.Scanner;

public class Solution {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 Scanner scanner = new Scanner(System.in);
		 int N = scanner.nextInt();
		 int K = scanner.nextInt();
		 
		 System.out.println(getSolution(N, K));
		 
	    }
	 
	 public static int getSolution(int N, int K){
		 int sum = 0;
		 
		 for(int i = 1; i < N; i++){
			 if(checkPalindrome(String.valueOf(i)) && 
					 checkPalindrome(parseToBase(i, K))){
				 sum += i;
			 }
		 }
		 
		 return sum;
	 }
	 
	 public static boolean checkPalindrome(String str){
		 int length = str.length();
		 int left = 0;
		 int right = 0;
		 if(length % 2 == 1){
			 left = (length - 1) / 2;
			 right = (length - 1) / 2;
		 }else{
			 left = (length - 1) / 2;
			 right = (length + 1) / 2;
		 }
		 
		 for(int i = 0; i < (length+1)/2; i++){
			 String l = str.substring(left-i, left-i+1);
			 String r = str.substring(right+i, right+i+1);
			 if(!l.equals(r)){
				 return false;
			 }
		 }
		 
		 return true;
	 }
	 
	 public static String parseToBase(int number, int base){
		 int d = number;
		 String result = "";
		 while( d > 0 ){
			 int r = d % base;
			 result = r + result;
			 d = d / base;
		 }
		 return result;
	 } 
}
