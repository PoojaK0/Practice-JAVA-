/*
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

 

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
*/


class Solution {
    public String frequencySort(String s) {
        if(s.length()==0 || s==null)
            return s;
       
        class Freq{
            char c;
            int freq;
            //constructor
            public Freq(char c, int freq){
                this.c=c;
                this.freq=freq;
            }
        }
        
        Map<Character,Freq> map=new HashMap<>();
        for(char c: s.toCharArray()){
            if(!map.containsKey(c))
                map.put(c,new Freq(c,1));
            else //getting the value(Freq class) thru get function, and increasing freq(not Freq) of Freq we got
                map.get(c).freq++;    
        }
        
        List<Freq> list = new ArrayList<>(map.values());
      // sorting list, comparator(o1,o2) where o2(higher freq) is written first(for descending)
     
        Collections.sort(list,(o1,o2) -> o2.freq - o1.freq);
        
        
        StringBuilder sb=new StringBuilder();
        for(Freq f : list){
            while(f.freq-- > 0){
            sb.append(f.c);
            }
        }
        return sb.toString();
        
    }
}

