//Brute
class Solution {
    public String reverseWords(String s) {
      
        String si=s.trim();
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

            if(i==si.length()-1){
            arr.add(sb.toString());
            sb=new StringBuilder();
            }
            i++;
        }
        System.out.println(arr);
        // System.out.println(arr.get(arr.size()-1));

        for(int j=arr.size()-1; j>=0; j--){

            if(!arr.get(j).equals("")){
                sb.append(arr.get(j));
                sb.append(" ");
                }
            // System.out.println(!arr.get(j).equals(" "));
        }

        return sb.toString().trim();
    }
}
