class reverseStringMethod:
    def reverseString(s:str)->str:
        res=''
        for i in range(len(s)-1,-1,-1):
            res=''.join(s[i])
        return res

    def reverseString2(str)->str:
        res=''
        for char in str:
            res=char+res

        return res

    def reverseString3(s:str)->str:
        return s[::-1]
    str="GeeksforGeeks"
    print (reverseString(str))
    print (reverseString2(str))
   # print (reverseString3(str))

