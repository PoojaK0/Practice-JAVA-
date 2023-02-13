/*
String Compression
Easy  Prev   Next
1. You are given a string. 
2. You have to compress the given string in the following two ways - 
   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".
Input Format
A String
Output Format
Two strings representing first compressed string and second compressed string respectively.
Constraints
1 <= length of string <= 1000
Sample Input
wwwwaaadexxxxxx
Sample Output
wadex
w4a3dex6
*/

import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
		StringBuilder sb= new StringBuilder();
		int i=0,j=0;
		sb.append(str.charAt(i));
		while(j<str.length())
            {
                if(str.charAt(i) == str.charAt(j))
                j++;
                else{
                    i=j;
                sb.append(str.charAt(i));
                j++;
                    
                }
            }
		return sb.toString();
	}

	public static String compression2(String str){
		// write your code here
			StringBuilder sb= new StringBuilder();
		int i=0,j=0;
	
		while(j<str.length())
            {
                int c=0;
                while(j < str.length() && str.charAt(i) == str.charAt(j) ){
                c++;
                j++;
                }
                
                
                sb.append(str.charAt(i));
                if(c!=1)
                sb.append(c);
                i=j;
                    
                
            }
		return sb.toString();

	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
