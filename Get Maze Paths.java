/*
1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Constraints
0 <= n <= 10
0 <= m <= 10
Sample Input
3
3
Sample Output
[hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> s= getMazePaths(0,0,n-1,m-1);
        System.out.println(s);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr>dr || sc>dr){
            return new ArrayList<>();
        }
        if(sr==dr && sc==dc){
            ArrayList<String> li = new ArrayList<>();
            li.add("");
            return li;
        }
        
        ArrayList<String> ho=getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> ve=getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> path= new ArrayList<>();
        
        for(String s : ho){
            path.add("h"+s);
        }
        for(String s : ve){
            path.add("v"+s);
        }
        
                


        return path;
    }

}
