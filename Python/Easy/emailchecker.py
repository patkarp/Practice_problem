print("Emailer CHecker \n")
useremail=input("Enter you email:").casefold()
if useremail.endswith("@patkar.com"):
    print("email valid")
else:
    print("invalid")