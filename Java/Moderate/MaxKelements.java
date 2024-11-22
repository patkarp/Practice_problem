/**
 * Find Max K elements
 * Input: [5, 5, 5, 2, 2, 3]
 Output: 5

Input: [2, 2, 2, 5, 5, 5, 3]
output: 2/5

 */

import java.util.*;
import java.io.*;

public class MaxKelements {


  public static HashMap<Integer, Integer> mostFreq(int arr[]) {


    HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
    for(int i= 0;i<arr.length;i++){
      if(freq.get(arr[i])==null){
        freq.put(arr[i], 1);
      }
      else{
        freq.put(arr[i],freq.get(arr[i])+1);
      }

    }
    System.out.println("Hashmap:"+ freq);
    int max=0,key=0;
    HashMap<Integer, Integer> maxK = new HashMap<Integer, Integer>();

    for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
     if(entry.getValue()>max){
       key=entry.getKey();
       max=entry.getValue();
      }
     if(max==entry.getValue()){
       maxK.put(entry.getKey(), entry.getValue());
     }
    }
    return maxK;



  }

  public static void main (String[] args) {

    int arr[] = {2, 2, 2, 5, 5, 5, 3};

    HashMap<Integer, Integer> freq= mostFreq(arr);
    System.out.println("Most Frequently used number are:"+freq);

  }

}

/*
 * Output:
 * Hashmap:{2=3, 3=1, 5=3}
 *  Most Frequently used number are:{2=3, 5=3}
 */

