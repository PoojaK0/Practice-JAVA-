/*
1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Sample Input
abc
Sample Output
[, c, b, bc, a, ac, ab, abc]
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        ArrayList<String> list = gss(s);
        System.out.println(list);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> l= new ArrayList<>();
            l.add("");
            return l;
        }
        
        char st=str.charAt(0);
        String last=str.substring(1);
        List<String> ans=gss(last);
        
        ArrayList<String> fin= new ArrayList<>();
        for(String n :ans){
            fin.add(""+n);
            fin.add(st + n);
        }
        return fin;
    }

}

