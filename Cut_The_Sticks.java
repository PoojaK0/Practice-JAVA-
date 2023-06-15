 public static List<Integer> cutTheSticks(List<Integer> arr) {
List<Integer> li = new ArrayList<>();
        
        Collections.sort(arr);
                // System.out.println(arr);

        for(int i=0; i<arr.size(); i++){
            int count=0;
            int min=arr.get(i);
            if(min==0)
                continue;
            
            for(int j=i; j<arr.size(); j++){
                if(arr.get(j) !=0)
                    count++;
                arr.set(j,arr.get(j)-min);
            }
            li.add(count);
           
             // System.out.println(li);
             // System.out.println(arr);
        }
        return li;
    }
