package projectEuler40to50.TriangularPentagonalAndHexagonal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 	
		 Scanner scanner = new Scanner(System.in);
		 long N = scanner.nextLong();
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 
		 List<Long> result = getSolution(N, a, b);
		 
		 int answerLength = result.size();
		 System.out.println(1);
		 for(int i = 0; i < answerLength; i++){
			 System.out.println(result.get(i));
		 }
		 
	    }
	 
	 public static List<Long> getSolution(long N, int a, int b){
		 int inputCase = a + b;
		 List<Long> result = new ArrayList<>();
		 int index1 = 2;
		 int index2 = 2;
		 long num1 = 0;
		 long num2 = 0;
		
		 while(true){
			 if(inputCase == 8){
				 num1 = getTriangular(index1);
				 num2 = getPentagonal(index2);
			 }else if(inputCase == 9){
				 num1 = getTriangular(index1);
				 num2 = getHexagonal(index2);
			 }else{
				 num1 = getPentagonal(index1);
				 num2 = getHexagonal(index2);
			 }
			 
			 if(num1 >= N || num2 >= N){
				 break;
			 }else if( num1 == num2 ){
				 result.add(num1);
				 index1++;
				 index2++;
			 }else if(num1 > num2){
				 index2++;
			 }else{
				 index1++;
			 }
			 
		 }
		 
		 return result;
	 }
	 
	 public static long getTriangular(long N){
		 return N*(N+1)/2;
	 }
	 
	 public static long getPentagonal(long N){
		 return N*(3*N-1)/2;
	 }
	 
	 public static long getHexagonal(long N){
		 return N*(2*N-1);
	 }
}
