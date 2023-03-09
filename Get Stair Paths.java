/*
1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.

Constraints
0 <= n <= 10
Sample Input
3
Sample Output
[111, 12, 21, 3]
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> p = new ArrayList<>();
            p.add("");
            return p;
        }else if(n < 0){
            ArrayList<String> p = new ArrayList<>();
            return p;
            
        }
        
        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(String s : path1)
        paths.add(1+s);
        
        for(String s : path2)
        paths.add(2+s);
        
        for(String s : path3)
        paths.add(3+s);
        
        return paths;
    }

}



//dp

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n+1];
        arr[0]=1;
       
        for(int i=1; i<=n; i++){
            if(i>= 1)
            arr[i]+=arr[i-1];
            
            if(i>=2)
            arr[i]+=arr[i-2];
            
            if(i>=3)
            arr[i]+=arr[i-3];
        }
        
        System.out.println(arr[n]);
    }

}
