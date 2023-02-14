/*
1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.

Constraints
1 <= length of string <= 1000

Sample Input
pepCODinG
Sample Output

PEPcodINg
*/

import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		//write your code here
		StringBuilder sb=new StringBuilder();
		for(char c : str.toCharArray())
{
    if(c<='Z' && c>='A')
    sb.append((char)(c+32));
    else
    sb.append((char)(c-32));
}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
