/*
1. You are given a number n.
2. You are required to calculate the factorial of the number. Don't change the signature of factorial function
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        int sum=1;
        if(n==1)
        return n;
        
        return n*factorial(n-1);
    }

}
