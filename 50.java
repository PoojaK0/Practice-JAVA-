//brute
class Solution {
    public double myPow(double x, int n) {
        double res=1;
        if(n>0){
        for(int i=1; i<=n; i++)
            res*=x;
        }else{
            for(int i=1; i<=Math.abs(n); i++)
            res/=x;
        }

        return res;
       
    }
}

//function
class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x,n);
    }
}

//recursion
class Solution {
    public double myPow(double x, long n) {
        if(n==0 || x==1)
            return 1;
        if(x==0)
            return 0;

        if(n<0)
            return myPow(1/x,Math.abs(n));

        return (n%2==0 ? myPow(x*x,n/2) : x*myPow(x*x,n/2));
    }
}
