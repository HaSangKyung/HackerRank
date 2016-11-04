package weekOfCode25.BabyStepGiantStep;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		while( q >= 1 ){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int d = scanner.nextInt();
			System.out.println(getSolution(a, b ,d));
			q--;
		}
    }
	
	public static int getSolution(int a, int b, int d){
		int result = 0;
		
		while( d > 0){
			if( d == a || d == b ){
				result +=1;
				d = 0;
			} else if( d > b + b ){
				d = d - b;
				result +=1;
			} else if ( b > d ){
				result += 2;
				d = d - b;
			} else {
				result += 2;
				d = 0;
			}
		}
		
		return result;
	}
	
}
