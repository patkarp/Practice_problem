
class WordOccurence:
    #open the file
    text = open("/Users/patkarp/Documents/Coding/Practice_problem/Python/Medium/wordoccurence.txt","r")

    # print(text)

    #create an empty dictionary
    d=dict()

    for line in text:
        #Strip any newline and tabs and turn the words into lower letter
        line=line.strip().lower()

        #strip the lines into words
        words=line.split(" ")
        # Iterate over each word in line 
        for word in words:
            # Check if the word is already in dictionary 
            if word in d:
                d[word]=d[word]+1
            else:
                d[word]=1
    for key in list(d.keys()):
        print(key,":",d[key])
        

