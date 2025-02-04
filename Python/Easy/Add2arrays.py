'''Given two arrays a[] and b[], the task is to find the number of elements in the union between these two arrays.

The Union of the two arrays can be defined as the set containing distinct elements from both arrays. If there are repetitions, then only one element occurrence should be there in the union.
Note: Elements are not necessarily distinct.

Examples

Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3]
Output: 5
Explanation: 1, 2, 3, 4 and 5 are the elements which comes in the union setof both arrays. So count is 5.
Input: a[] = [85, 25, 1, 32, 54, 6], b[] = [85, 2] 
Output: 7
Explanation: 85, 25, 1, 32, 54, 6, and 2 are the elements which comes in the union set of both arrays. So count is 7.
Input: a[] = [1, 2, 1, 1, 2], b[] = [2, 2, 1, 2, 1] 
Output: 2
Explanation: We need to consider only distinct. So count is 2.
Constraints:
1 ≤ a.size(), b.size() ≤ 106
0 ≤ a[i], b[i] < 105'''
class Add2Arrays:
    def Add2arrays(a,b):
        newset=set()

        for i in range(len(a)):
            newset.add(a[i])
        
        for i in range(len(b)):
            newset.add(b[i])
        return len(newset)
    def Add2arrays2(a,b):
        #res=set(a).union(set(b))
        res=set(a+b)
        return len(res)
    a=[5,3,2,1,4]
    b=[1,4,1,4,2]
    print(Add2arrays(a,b))
    print(Add2arrays2(a,b))

