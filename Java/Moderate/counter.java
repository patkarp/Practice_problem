import java.util.*;

class Counter{
    public HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm){
        HashMap<String, Integer> result = new HashMap<String, Integer>();
         // Sorting the list using Collections.sort() method
        // using Comparator
        List<Map.Entry<String, Integer>> list = new java.util.LinkedList<Map.Entry<String, Integer>>(
                hm.entrySet());

        Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> object1, Map.Entry<String, Integer> object2){
                    return(object2.getValue()).compareTo(object1.getValue());
                }
            }
        );
        
        for(Map.Entry<String, Integer> me:list){
            result.put(me.getKey(), me.getValue());
        }
    
        System.out.println("Sorted List(Descending order): "+list+"\n");
  
        System.out.println("Top 5 Sorted list: "+list.subList(0, 3));
  
        return result;

    }
    public static void main(String args[]){
        String s1[]={"banana","apple","banana", "orange", "orange"};

        HashMap<String, Integer> wordcount=new HashMap<>();

        for(String s:s1){
            if(wordcount.get(s)==null){
                wordcount.put(s,wordcount.getOrDefault(s, 0)+1);
            }
            else{
                wordcount.put(s, wordcount.get(s)+1);
            }
        }
        Counter c1 = new Counter();
        HashMap<String, Integer> Sorted=c1.sortByValue(wordcount);

        System.out.println(wordcount);
        System.out.println(Sorted);
            




    }

}