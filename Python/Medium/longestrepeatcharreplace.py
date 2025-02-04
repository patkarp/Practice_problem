'''You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.

 

Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
Example 2:

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.'''
import random
class longestrepeatcharreplace:
    def replace(string, k)-> int: 
        r1=random.randint(0, len(string)-1)
        print(r1)
        distinct=set(string)
        newstring=""
        maxlength=-1
        maxstring=""
        for d in distinct:
            if d!=string[r1]:
                newstring=string.replace(string[r1],d,k)

        print(newstring)
        #count the frequencey
        for d in distinct:
            if newstring.count(d) >= maxlength:
                maxlength=newstring.count(d)



        return maxlength


    s1 = "AABABBA"
    k1 = 1
    longestcharlength=replace(s1,k1)
    print("Longest Chars:", longestcharlength)
