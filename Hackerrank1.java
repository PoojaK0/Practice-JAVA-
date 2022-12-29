/*
Write a program that takes a number and returns its multiplicative persistence, which is the number of times you must multiply the digits in number until you reach a single digit.

Examples bugger(39) ➞ 3 // Because 3 * 9 = 27, 2 * 7 = 14, 1 * 4 = 4 and 4 has only one digit.
bugger(999) ➞ 4 // Because 9 * 9 * 9 = 729, 7 * 2 * 9 = 126, 1 * 2 * 6 = 12, and finally 1 * 2 = 2.

Input Format:
Input consists single integer N.

Constraints:
1<=N<=10^6

Output Format:
Output consists an integer.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int cnt=0;
        while(n>9){
            int mul=1;
            
            while(n>0){
                int r=n%10;
                n=n/10;
                mul=mul*r;
            }
            cnt++;
            if( mul < 10){
                System.out.println(cnt);
                return;
            }   
            else
                n=mul; 
        } 
        System.out.println("0");
    }
}
