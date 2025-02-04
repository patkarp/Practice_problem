number=int(input("Enter number:"))
m=int(number/2)
flag=0

for i in range(2,m):
    if number%i==0:
        print("Not a Prime number")
        flag=1
        break

if flag==0:
    print("Prime number")
