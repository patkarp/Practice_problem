
'''/**
 * Find Max  elements
 * Input: [5, 5, 5, 2, 2, 3]
 Output: 5

Input: [2, 2, 2, 5, 5, 5, 3]
output: 2/5
'''

class Maxemlements:
    
#Problem with Approach is duplicate elements would not be listed
    def usingMaxvariable(arr):
        
        element=0
        elementCount=0
        for i in arr:
            tempCount=arr.count(i)
            if tempCount>elementCount:
                elementCount=tempCount
                element=i
        
        return element, elementCount
        
    
# To find max value, with mulitple elements
    def maxValue(arr):
        frequency = {}
        for item in arr:
            frequency[item]=frequency.get(item,0)+1
        
        print (frequency)
        frequency=dict(sorted(frequency.items(), key=lambda item:item[1], reverse=True))
        print(frequency)

        list_max_elements=list()


        maxvalue=max(frequency.values())
        maxelements={k for k, v in frequency.items() if v==maxvalue}
        return maxelements, maxvalue

        # # for k, v in frequency.items():
        # #     max=
        # #     if(max)


    

        return 0
            




    arr=[2, 2, 2, 5, 5, 5, 3]
    print("By using Max variable: ", usingMaxvariable(arr))
    print("By using Max Elements: ", maxValue(arr))