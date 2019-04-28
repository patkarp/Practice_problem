import java.lang.*;
import java.util.LinkedList;
import java.util.*;
import java.io.*;
/**
 * Program to Find Maximum number of Combinations of alphabets when a number is Entered.
 *      0,""
        1,""
        2,"abc"
        3,"def"
        4,"ghi"
        5,"jkl"
        6,"mno"
        7,"pqrs"
        8,"tuv"
        9,"wxyz"
 * input: Enter Number: 234
 * After Empty Check: [abc, def, ghi]
 * Final Combinations:  *****Final Result: ********
 abc ,  abd ,  abe ,  abf ,  abg ,  abh ,  abi ,  acd ,  ace ,  acf ,  acg ,  ach ,  aci ,  ade ,  adf ,  adg ,  adh ,  adi ,  aef ,  aeg ,  aeh ,  aei ,  afg ,  afh ,  afi ,  agh ,  agi ,  ahi ,  bcd ,  bce ,  bcf ,  bcg ,  bch ,  bci ,  bde ,  bdf ,  bdg ,  bdh ,  bdi ,  bef ,  beg ,  beh ,  bei ,  bfg ,  bfh ,  bfi ,  bgh ,  bgi ,  bhi ,  cde ,  cdf ,  cdg ,  cdh ,  cdi ,  cef ,  ceg ,  ceh ,  cei ,  cfg ,  cfh ,  cfi ,  cgh ,  cgi ,  chi ,  def ,  deg ,  deh ,  dei ,  dfg ,  dfh ,  dfi ,  dgh ,  dgi ,  dhi ,  efg ,  efh ,  efi ,  egh ,  egi ,  ehi ,  fgh ,  fgi ,  fhi ,  ghi , 
 */
class NumericalAlphabets{
    /**
     * I Learned this from Online
     * @param e Arraylist of Alphabets
     * @param k k number of Combination
     * @param accumulated 
     */
    static void combination(List<String> e, int k, String accumulated){

        // stop
        if(e.size() < k)
        return;
        
        // add each element in e to accumulated
        if(k == 1)
            for(String s:e) System.out.print(accumulated+s + ", ");
         
        // add all elements in e to accumulated
        else if(e.size() == k){
            for(String s:e) accumulated+=s;
            System.out.print(accumulated + ", ");
        }
        
        //for each element, call combination
        else if(e.size() > k){
            for(int i = 0 ; i < e.size() ; i++) 
            {
                combination(e.subList(i+1, e.size()), k-1, accumulated+e.get(i));
            }
        }
    }

    /**
     * Break the number into different Array
     * @param n Number
     * @return int[]
     */ 
    static int[] breakNumber(int n){
        
        String temp = String.valueOf(n);
        int count = temp.length();
        int[] n_array = new int[count];
        for(int i= 0;i<count;i++){
            n_array[i] = temp.charAt(i) - '0';
        }
        //To check if the list is right
        // for(int x:n_array) System.out.println(x);
        return n_array;
        }
    
    /**
     * Find the element in Linkedlist
     * @param n
     * @param obj
     * @return
     */
    static String findElements(int n, LinkedList<String> obj ){

        String string = obj.get(n);
        return string;
    }
    public static void main(String[] args){
        LinkedList<String> obj = new LinkedList<String>();
        obj.add(0,"");
        obj.add(1,"");
        obj.add(2,"abc");
        obj.add(3,"def");
        obj.add(4,"ghi");
        obj.add(5,"jkl");
        obj.add(6,"mno");
        obj.add(7,"pqrs");
        obj.add(8,"tuv");
        obj.add(9,"wxyz");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = scan.nextInt();
        scan.close();
        
        // Break the The number:
        int[] n_array = breakNumber(n);
        

        //Now that we have the numbers, we will retrieve those numbers one by one and add them in the linkedlist
        LinkedList<String> result = new LinkedList<String>();
        for(int i=0;i<n_array.length;i++){
            result.add(findElements(n_array[i], obj));
            System.out.println("Result Op:"+ result);
        }
        //Removing the Empty elements So we dont have to deal with it later
        for(int i = 0; i<result.size();i++){
            if(result.get(i) == "" || result.get(i) == null){
                System.out.println("Removing 0, or 1 because it is null");
                result.remove(i);

            }
        }
        System.out.println("After Empty Check Result:"+ result);
        
        //Copy the linkedlist into String Array
        String[] str;
        str = result.toArray(new String[result.size()]);
        
        //Converting into a Single String
        String temp1 ="";
        for(int i=0;i<str.length;i++){
            temp1 += str[i];
        }
        //System.out.println("Temp1:"+ temp1);

        //Converting into Array List to take advantage of sublist feature.
        List<String> list = new ArrayList<String>();
        for(int i = 0;i<temp1.length();i++){
            list.add(temp1.substring(i,i+1));
        }

       //Now That we have numbers Lets find The maximum possibilities.
       System.out.println(" \n \n *****Final Result: ********");
       combination(list, 3, " ");
    }
}