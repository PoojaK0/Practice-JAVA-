  //Given a time in -hour AM/PM format, convert it to military (24-hour) time.
public static String timeConversion(String s) {
    // Write your code here
    System.out.println(s.substring(8,10));
    
    if(s.substring(8,10).equals("AM")){
        int h=Integer.parseInt(s.substring(0,2));
        if(h==12){
            StringBuilder a=new StringBuilder();
            a.append("00"+s.substring(2,8));
            return a.toString();
            
        }else{
            return s.substring(0,8);
            
        }
    }
    else{
        int h=Integer.parseInt(s.substring(0,2));
        if(h==12){
             return s.substring(0,8);
        }else{
            h=h+12;
            StringBuilder a=new StringBuilder();
            a.append(h+s.substring(2,8));
            return a.toString();
        }
    }
}
