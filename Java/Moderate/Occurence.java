import java.lang.*;
import java.util.*;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;

class Occurence{
    public static HashMap<String, Integer> occur(String s){
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        String sentence=s.replaceAll("\\s+", "");
        for(int i=0;i<sentence.length()-2;i++){
            String s1 = sentence.substring(i, i+3);
            if(hm.get(s1)==null){
                hm.put(s1, 1);

            }else{
                hm.put(s1, hm.get(s1)+1);
            }
            

        }
        return hm;
    }
    public void Sorted(HashMap<String, Integer> count){
        List<Map.Entry<String, Integer>> list = new java.util.LinkedList<Map.Entry<String, Integer>>(count.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2){
                return (o2.getValue().compareTo(o1.getValue()));
            }
        });
        System.out.println("Sorted List(Descending order): "+list+"\n");
  
        System.out.println("Top 5 Sorted list: "+list.subList(0, 5));

    }
    public static void main(String args[]){
        Occurence o1= new Occurence();
        String s="quick brown fox quid fox3 fox4";
        HashMap<String, Integer> count = occur(s);
        System.out.println(count);
        

        o1.Sorted(count);

    }
}