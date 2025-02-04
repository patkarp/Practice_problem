'''

Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
'''

class longestSubstring:



    def Nonrepeatlength(str)->int:
        length=-1
        set1=set(str)
        return len(set1)








    s="abcabcbb"
    length=Nonrepeatlength(s)
    print(length)



