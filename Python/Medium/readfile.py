class readfile:
    text=open("/Users/patkarp/Documents/Coding/Practice_problem/Python/Medium/wordoccurence.txt","r")
    for line in text:
        line=line.strip()
        word=line.split(" ")
        print(len(word))