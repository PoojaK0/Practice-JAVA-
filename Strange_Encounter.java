//hackerrank problem
public static long strangeCounter(long t) {
    // Write your code here
       
        long x=3;
        long y=3;
        
        while(x<t){
            x=x+2*y;
           y=2*y;
        }
        return x-t+1;
    }
