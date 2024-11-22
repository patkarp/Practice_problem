
import java.util.ArrayList;

/**
 * Subarray with Given Sum
Last Updated : 16 Oct, 2024
Given a 1-based indexing array arr[] of integers and an integer sum. You mainly need to return the left and right indexes(1-based indexing) of that subarray. In case of multiple subarrays, return the subarray indexes which come first on moving from left to right. If no such subarray exists return an array consisting of element -1.

Examples: 

Input: arr[] = { 15, 2, 4, 8, 9, 5, 10, 23}, sum = 23
Output: 2 5
Explanation: Sum of elements between indices 2 and 5 is 2 + 4 + 8 + 9 = 23


Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Output: 2 5
Explanation: Sum of elements between indices 2 and 5 is 4 + 0 + 0 + 3 = 7


Input: arr[] = {1, 4}, sum = 0
Output: -1
Explanation: There is no subarray with 0 sum

 */

public class SubArraySum {

    static ArrayList<Integer> subArraySum(int[] arr, int n, int sum){
        ArrayList<Integer> res = new ArrayList<>();

        int start=0;
        int last=0;
        long currsum=0;
        boolean flag=false;

        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            // Check if current sum is greater than or equal to given number
            if(currsum>=sum){
                last =i;
                // Start from starting index till current index
                while(currsum<=sum && start<last){
                    //subract element from left
                    currsum-=arr[start];
                    ++start;

                }
                // If current sum becomes equal to given number
                if(currsum==sum){
                res.add(arr[start+1]);
                res.add(arr[last+1]);

                break;
                }   
            }
            
        }
        // If no subarray is found, store -1 in result
        if(!flag){
            res.add(-1);
        }

        // Return the result
        return res;

    }
    public static void main(String[] args){
        int arr[]= { 15, 2, 4, 8, 9, 5, 10, 23};
        int sum=23;
        int n = arr.length;
        ArrayList<Integer> res=subArraySum(arr,n,sum);
        System.out.println("Result:"+ res);



    }
    
}
