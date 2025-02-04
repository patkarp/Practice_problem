'''Given a list of string, or array of string. Reverse a string for number given index number number 

arr=["A", "B", "C", "D", "E", "F", "G"]
S=2
E=5
reverse(arr, S. E)

Output: ["A", "B", "E", "D", "C", "F", "G"]


'''
class reverseStringN2M:
    

    def reverse(arr,S,E):
        
        while S<E:
            # Swap the elements at S and E
            arr[S],arr[E] = arr[E],arr[S]
            # Move the pointers closer
            S += 1
            E -= 1
        return arr
    
    arr=["A", "B", "C", "D", "E", "F", "G"]
    print("array:",arr)
    S=2
    E=4
    print("reverse:",reverse(arr, S, E))

        

