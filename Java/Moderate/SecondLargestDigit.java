import java.util.ArrayList;
import java.util.Collections;

/**
 * 
Leet Code
1796. Second Largest Digit in a String
Easy

Topics
Companies

Hint
Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

An alphanumeric string is a string consisting of lowercase English letters and digits.

 

Example 1:

Input: s = "dfa12321afd"
Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
Example 2:

Input: s = "abc1111"
Output: -1
Explanation: The digits that appear in s are [1]. There is no second largest digit. 
 

Constraints:

1 <= s.length <= 500
s consists of only lowercase English letters and digits.
 */
import java.io.*;
import java.util.*;

public class SecondLargestDigit {
    static public int secondHighest(String s) {
        HashSet<Integer> h=new HashSet<Integer>();
        for (char c:s.toCharArray()){
            if(Character.isDigit(c)){
                h.add(c - '0');
            
            }
        }
        if(h.size()<2) return -1;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i: h){
            arr.add(i);
        }
        Collections.sort(arr);
        return arr.get(arr.size()-2);
    }

    public static void main(String[] args){

        int number = secondHighest("dfa12321afd");
        System.out.println(number);
    


    }
}
