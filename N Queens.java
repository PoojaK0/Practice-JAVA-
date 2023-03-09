/*
1. You are given a number n, the size of a chess board.
2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
Note - Queens kill at distance in all 8 directions
3. Complete the body of printNQueens function - without changing signature - 
to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.

Constraints
1 <= n <= 10
Sample Input
4
Sample Output
0-1, 1-3, 2-0, 3-2, .
0-2, 1-0, 2-3, 3-1, .
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row==chess.length){
            System.out.println(qsf+".");
            return;
        }
        for(int i=0; i<chess.length; i++){
            if(issafe(chess,row,i) == true)
            {chess[row][i]=1;
            printNQueens(chess,qsf+row+"-"+i+", ",row+1);
            chess[row][i]=0;}
        }
        
    }
    
    public static boolean issafe(int[][] arr, int r, int c){
        for(int i=r, j=c; i>=0; i--){
            if(arr[i][j] == 1)
            return false;
        }
        
        for(int i=r, j=c; i>=0 && j>=0; i--,j--){
            if(arr[i][j] == 1)
            return false;
        }
        
        for(int i=r, j=c; i>=0 && j < arr.length; i--,j++){
            if(arr[i][j] == 1)
            return false;
        }
        
        return true;
    }
}
