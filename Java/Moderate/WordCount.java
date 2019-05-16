// Input = ["banana", "apple", "banana"]
// Output: 
// banana 2
// apple 1

import java.io.*;
import java.util.*;
import java.lang.*;

class WordCount {
  public static void main(String[] args) {
        
    //Take Input Array
    
    //Process it 
    
    // output
    
    //Scanner in = new Scanner(System.in);
    String[] s1 = {"banana","apple","banana", "orange", "orange"};
    
    //will do hashmap
    HashMap<String, Integer> dist = new HashMap<String, Integer>();
    
    for(String s:s1){
      if(dist.get(s) == null){
        dist.put(s,1);
      }
      else{
        dist.put(s, dist.get(s)+1); //add +1 incase that String exist
      }
      
    }
    System.out.println(dist);
    
    /** Old Method
     * 
     String[] s1 = {"banana","apple","banana", "orange"};
    ArrayList loc =new ArrayList<Integer>();
    for(int i=0;i<s1.length; i++){
      int count =0;
      if(!loc.contains(i)){
        for(int j =0;j<s1.length;j++){
          if(s1[i].equals(s1[j])){
              count ++;
              loc.add(j);
              //loc = j
          }  
         //print String name/ Return the outpu
        }
        System.out.println("String: "+s1[i] + " Count:"+count);
      }
    }
    */
    
  }
}