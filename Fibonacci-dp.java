/*
1. You are given a number n.
2. You are required to print the nth element of fibonnaci sequence.(usind dp)
*/

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
   long arr[]=new long[n+1];
   arr[0]=0;
   arr[1]=1;
   for(int i=2; i<=n; i++){
       arr[i]=arr[i-1]+arr[i-2];
   }
   System.out.println(arr[n]);
 }

}
