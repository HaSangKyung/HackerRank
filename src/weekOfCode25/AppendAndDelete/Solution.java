package weekOfCode25.AppendAndDelete;

import java.util.Scanner;

public class Solution {

	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        String t = in.next();
	        int k = in.nextInt();
	        //hackerhappy hackerrank
	        //9 11 13 15 17 19 
	        
	        System.out.println(getSolution(s, t, k));
	    }
	
	  public static String getSolution(String s, String t, int k){
		  int sameStringLength = 0;
		  int lengthOfS = s.length();
		  int lengthOfT = t.length();
		  int shorterLength = 0;
		  if(lengthOfS > lengthOfT){
			  shorterLength = lengthOfT;
		  }else{
			  shorterLength = lengthOfS;
		  }
		  for(int i = 0; i < shorterLength; i++){
			  sameStringLength = i;
			  String indexOfStringS = s.substring(i, i+1);
			  String indexOfStringT = t.substring(i, i+1);
			  if(!indexOfStringS.equals(indexOfStringT)){
				  break;
			  }
		  }
		  
		  int maximumOperNumber = lengthOfS + lengthOfT;
		  int minimumOperNumber = lengthOfS + lengthOfT - 2 * sameStringLength; 
		  
		  if(k >= maximumOperNumber){
			  return "Yes";
		  }
		  
		  for(int j = minimumOperNumber; j < maximumOperNumber; j+=2){
			  if(k == j){
				  return "Yes";
			  }
		  }
		  
		  return "No";
	  }
	  
	  
}
