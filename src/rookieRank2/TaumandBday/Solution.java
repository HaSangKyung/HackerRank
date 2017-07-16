package rookieRank2.TaumandBday;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            
            System.out.println(getSolution(b,w,x,y,z));
            
        }
    }
    
    public static long getSolution(long b, long w, long x, long y, long z){
    	long sum = 0;
    	
    	if( x > y ){
    		sum += y * w + y * b;
    		x = x - y;
    		if( x > z ) {
    			x = z;
    		}
    		sum += x * b;
    	} else {
    		sum += x * b + x * w;
    		y = y - x;
    		if( y > z ) {
    			y = z;
    		}
    		sum += y * w;
    	}
    	
    	return sum;
    }
    
    public static boolean checkConverting(long x, long y, long z){
    	return  ( x + z > y) || ( y + z > x); 
    }
}