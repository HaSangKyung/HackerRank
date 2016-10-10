package projectEuler11to20.LargestProductInGrid;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    final static int gridNumber = 20;
    final static int adjacentNumber = 4;
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int greatestProduct = 0;
        
        int[][] twoDemesionArray = new int[20][20];
        
        for(int i = 0 ; i < gridNumber; i++ ){
            for(int j = 0; j < gridNumber; j++){
                int input = scanner.nextInt();
                int product = 0;
                twoDemesionArray[i][j] = input;
                if(input > 0){
                    //System.out.println("input"+twoDemesionArray[i][j]);
                    if( checkGreater(i) && checkDiagonal(j) ){
                        greatestProduct = getProductAndCompare(twoDemesionArray[i][j], twoDemesionArray[i-1][j+1], 
                                             twoDemesionArray[i-2][j+2], twoDemesionArray[i-3][j+3], greatestProduct);
                    }
                    if( checkGreater(j) && checkDiagonal(i) ){
                        greatestProduct = getProductAndCompare(twoDemesionArray[i][j], twoDemesionArray[i-1][j-1], 
                                             twoDemesionArray[i-2][j-2], twoDemesionArray[i-3][j-3], greatestProduct);
                    }
                    if( checkGreater(i) ){
                        greatestProduct = getProductAndCompare(twoDemesionArray[i][j], twoDemesionArray[i-1][j], 
                                             twoDemesionArray[i-2][j], twoDemesionArray[i-3][j], greatestProduct);
                    }
                    if( checkGreater(j) ){
                        greatestProduct = getProductAndCompare(twoDemesionArray[i][j], twoDemesionArray[i][j-1], 
                                             twoDemesionArray[i][j-2], twoDemesionArray[i][j-3], greatestProduct);
                    }
                }
            }
        }
        
        System.out.println(greatestProduct);
    }
    
    public static boolean checkGreater(int index){
        if( (index + 1) >= adjacentNumber){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean checkDiagonal(int index){
        if( checkGreater(index) && ( index + adjacentNumber ) <= gridNumber){
            return true;
        }else{
            return false;
        }
    }
    
    public static int getProductAndCompare(int num1, int num2, int num3, int num4, int greatestNum){
        int product = num1 * num2 * num3 * num4;
        if(product > greatestNum){
            //System.out.println("numbers : " + num1 + "/" + num2 + "/" + num3 + "/" + num4);
            //System.out.println(product);
            return product;
        }else{
            return greatestNum;
        }
    }
}