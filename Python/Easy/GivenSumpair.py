'''Given two unsorted arrays arr1[]  and arr2[], the task is to find all pairs whose sum equals x from both arrays.

Note: All pairs should be returned in increasing order of u. For eg. for two pairs (u1,v1) and (u2,v2), if u1 < u2 then (u1,v1) should be returned first else second.

Examples:

Input: target = 9, arr1[] = [1, 2, 4, 5, 7], arr2[] = [5, 6, 3, 4, 8]
Output: 
1 8
4 5 
5 4
Explanation: (1, 8), (4, 5), (5, 4) are the pairs which sum to 9.
Input: target = 8, arr1[] = [-1, -2, 4, -6, 5, 7], arr2[] = [6, 3, 4, 0]
Output:
4 4 
5 3
Input: target = 9, arr1[] = [1, 2, 4, 5, 7, 4], arr2[] = [5, 6, 3, 4, 8, 4]
Output:
1 8
4 5
4 5
5 4
5 4
Explanation: (1, 8), (4, 5), (4, 5), (5, 4) and (5, 4) are the pairs which sum to 9.'''

#User function Template for python3

class GivenSumpair:
    def allPairs(self, target, arr1, arr2):
        # Your code goes here 
        result=[]
        for a in arr1:
            diff=target-a
            for b in arr2:
                if diff==target:
                    result.append((a,diff))
        return sorted(result)
                    



    