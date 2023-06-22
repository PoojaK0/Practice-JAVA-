//Brute
class Solution {
    public String reverseWords(String s) {

        int i=0;

        List<String> arr= new ArrayList<>();
        StringBuilder sb=new StringBuilder();;

        while(i < si.length()){

            if(si.charAt(i) != ' '){
                sb.append(si.charAt(i));
            }else{
                arr.add(sb.toString());
                 sb=new StringBuilder();
            }
            
             //for last element where space may or may not be present
            if(i==si.length()-1){
                arr.add(sb.toString());
                sb=new StringBuilder();
            }
            
            i++;
        }

        for(int j=arr.size()-1; j>=0; j--){

            if(!arr.get(j).equals("")){
                sb.append(arr.get(j));
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }
}

//OR
class Solution {
    public String reverseWords(String s) {

        String si=s.trim();
        //Splits the string wherever " " is present 
        //" +" means spliting even if multiple spaces are present

        String[] arr= si.split(" +");
        StringBuilder sb=new StringBuilder();
        
        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
