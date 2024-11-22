class OddEven:
    try:
        x= int(input("Enter number:"))
        print (type(x))
        if(x%2==0):
            print ("Even")
        else:
            print ("Odd")
    except ValueError:
        print("Not Valid Input")
    
    



