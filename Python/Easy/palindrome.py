'''You are given a string s. Your task is to determine if the string is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.

Examples :

Input: s = "abba"
Output: true
Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
Input: s = "abc" 
Output: false
Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome.
Input: s = "a"
Output: true
Explanation: A single-character string is always a palindrome.
Input: s = "acbca"
Output: true
Explanation: "acbca" reads the same forwards and backwards, so it is a palindrome.
Constraints:
1 ≤ s.size() ≤ 106
The string s contains only lowercase letters (a-z).
'''


class Palindrome:
    def isPalindrome( s: str) -> bool:
        reverse=s[::-1]
        if s==reverse: 
            return True
        else: 
            return False
    def isPalindrome2( s: str) -> bool:
        res=''
        for char in s:
            res=char+res
        if s==res: 
            return True
        else: 
            return False

    print(isPalindrome("abc"))
    print(isPalindrome("aba"))

    print(isPalindrome2("abc"))
    print(isPalindrome2("aba"))