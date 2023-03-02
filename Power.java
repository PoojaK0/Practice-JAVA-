/*
1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function .
Input Format
A number x
A number n
Output Format
x raised to the power n
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
         if(n==0)
        return 1;
        
        int a=power(x,n-1);
        int ans= a*x;
        return ans;
        
    }

}   



// power-log

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0)
        return 1;
        
        int ret=power(x,n/2);
        int ans=ret*ret;
        
        if(n%2==1)
        ans=ans*x;
        
        return ans;
    }

}
