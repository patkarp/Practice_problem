// quick brown fox quid <- qui 2, uic 1, ick 1, bro 1, row 1...

import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.LinkedList.*;
import java.util.List;



class SentenceSplitOccurences {
	
    static HashMap<String, Integer> occur(String s){
      
      HashMap<String, Integer> h1 = new HashMap<String, Integer>();
      //Split the string by spaces
  
      String s1_space=s.replaceAll("\\s+", "");
      System.out.println(s1_space);
  
      //Spliting by 3words
  
      // for(int i=0;i<s1_space.length;i++){//This is to iterate over s1_space[] 
      //   for(int j=0;j<s1_space[i].length()-2;j++){//This to split the word /3 and iterate char by char; 
      for(int i = 0;i<s1_space.length()-2;i++){
          String temp = s1_space.substring(i,i+3); //Temp String initialized to reduce complexity ; substring(j,j+3) 3 words sequences
          //Break it up and increase the count and add it into Hashmap
          if(h1.get(temp) == null){
            h1.put(temp,1);
          }
          else
          {
            h1.put(temp,h1.get(temp)+1);
          }
          
      }
      System.out.println("Collection of List:");
      System.out.println(h1+"\n");
      return h1;
    }
    public static void sortByValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
         List<Map.Entry<String, Integer>> list = new java.util.LinkedList<Map.Entry<String, Integer>>(
                hm.entrySet());
  
        // Sort the list descending order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o2.getValue()).compareTo(o1.getValue()); 
            } 
        }); 
        System.out.println("Sorted List(Descending order): "+list+"\n");
  
        System.out.println("Top 5 Sorted list: "+list.subList(0, 5));
  
       
    }
    public static void main (String[] args) {
      
     
          //input
          String s="quick brown fox quid fox3 fox4";
  
          //Adding String to hashmap Spliting into 3
          HashMap<String, Integer> h2 = occur(s);
          
          //Sort by Value
          sortByValue(h2);
  
      }
  }
  
  /**Output: 
  Collection of List:
  {ick=1, uid=1, qui=2, own=1, ox4=1, row=1, ox3=1, uic=1, bro=1, fox=3}
  
  Sorted List(Descending order): [fox=3, qui=2, ick=1, uid=1, own=1, ox4=1, row=1, ox3=1, uic=1, bro=1]
  
  Top 5 Sorted list: [fox=3, qui=2, ick=1, uid=1, own=1]
  **/
  
  