//  https://www.hackerrank.com/challenges/halloween-sale/problem
 public static int howManyGames(int p, int d, int m, int s) {
    // Return the number of games you can buy
        int count=0;
      
        while(s >= p){
            s=s-p;
            if(p-d > m)
                p=p-d;
            else 
                p=m;
            
            // System.out.println(s+" "+p);
            count++;
            
        }
        return count;
    }
