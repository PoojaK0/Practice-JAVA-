/*
1. You are given a string. 
2. You have to print all palindromic substrings of the given string.
Input Format
A String
Output Format
All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

Sample Input
abcc
Sample Output
a
b
c
cc
c
*/
import java.io.*;
import java.util.*;

public class Main {
    public static boolean palin(String s){
        if(s.length() == 1)
        return true;
        
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }

	public static void solution(String str){
		//write your code here
		for(int i=0; i<str.length(); i++)
		{
		    for(int j=i; j<str.length(); j++){
		        if(palin(str.substring(i,j+1)))
		        System.out.println(str.substring(i,j+1));
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}

