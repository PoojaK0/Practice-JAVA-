/*
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
Note - Please check the sample output for details.

INPUT:
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35


 OUTPUT:
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here 
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                arr[i][j]=sc.nextInt();
        // top_left(minr,mic) bottom_right(maxr,maxc)
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        //when to stop
        int total=n*m;
        int c=0;
        
        while(c < total){
            //left
          // changing row and taking col as constant
            for(int j=minr; j<=maxr && c <total; j++) 
            {
                System.out.println( arr[j][minc]);
                c++;
            }
            //so that element don't repeat
            minc++;
            
            // bottom
            for(int j=minc; j<=maxc && c <total; j++) 
            {
                System.out.println( arr[maxr][j]);
                c++;
            }
            maxr--;
            
            
            //right
            for(int j=maxr; j>=minr && c <total; j--) 
            {
                System.out.println( arr[j][maxc]);
                c++;
                
            }
            maxc--;
            
            //top
            for(int j=maxc; j>=minc && c <total; j--) 
            {
                System.out.println( arr[minr][j]);
                c++;
            }
            minr++;
        }
    }

}
