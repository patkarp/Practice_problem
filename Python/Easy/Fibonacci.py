'''
Number 8
then 1,1,2,3,5,8

Fib
0 1 1 2 3 5 8 13 21....
n3=n1+n2
display n3
n1=n2
n2=n3
'''

def fibonacci(number):
    n1=0
    n2=1
    n3=0
    count=1
    print (n1)
    while count<=number:
        n3=n1+n2
        count+=1
        print(n3)
        n1=n2
        n2=n3

fibonacci(1)
