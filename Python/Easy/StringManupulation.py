text = "Geeks for Geeks"

#Upper String:
print("\n Upper String:", text.upper())

#Lower String:
print("\n Lower String:", text.lower())

#Capitalize
print("\n Capitalize String:", text.capitalize())

#Swapcase
print("\n SwapCase String:", text.swapcase())

#Length
print("\n Length of String:", len(text))

#Title
print("\n Title String:", text.title())

#Center: Pad the string with specified character
print("\n Center String:", text.center(24))
print("\n Center String with character:", text.center(24,"#"))


#Casefold: Python String Casefold method is used to convert string to lowercase. It is similar to lower() string method
#but removes all the case distinction present in string
print("\n Casefold String:", text.casefold())

#Count: Return number of occurence of a substring in the string
print("\n Count String 'e':", text.count("e"))
#syntax: string.count(substring, startindex,endindex) or string.count(substring, startindex,len(text))
print("\n Count Substring 'ee':", text.count("ee",1,len(text)))

#Encode: encode('utf-8')
print("\n Encode Substring:", text.encode('latin9'))
from encodings.aliases import aliases
# print("The available encoding are:")
# print(aliases.keys())

#Endswith:  endswith()
#syntax str.endswith(suffix,start, end)
print("\n Endswith String:", text.endswith("geeks"))
print("\n Endswith String:", text.endswith("geeks", 5)) #first 5
print("\n Endswith String:", text.endswith("Geeks", 1, 10))

#str.startswith()
#Syntax: str.startswith(prefix, start, end)
#email checker with endswith
print("\n startswith String:", text.startswith("Geeks"))

#ExtendTabs:Python String expandtabs() Method specifies the amount of space to be substituted with the “\t” symbol in the string.
#Syntax: expandtabs() or expandtabs(spacingdigit)
print("\n Expandtabs String:", text.expandtabs())
print("\n Expandtabs custom spacing String:", text.expandtabs(2))


#The find() method in Python returns the index of the first occurrence of a substring within a given string. 
# If the substring is not found, it returns -1.
#Syntax: s.find(substring, start, end)) or s.find("Stringname")

print("\n Find String:", text.find("Geek"))
print("\n Find String:", text.find("for", 3, len(text)))

#rfind:
print("\n  Rfind String:", text.rfind("Geek", 0, len(text)))

'''find() vs index()
find(): Returns the index or -1 if not found
index(): Same as find(), but raises a ValueError if not found'''

#index()
#syntax: s.index(substring, start=0, end=len(s))
print("\n String Index", text.lower().index("geeks"))

#rindex():Returns highest index
print("\n String R - Index", text.lower().rindex("geeks"))



# Format()
'''The format() method is a powerful tool that allows developers to create formatted strings by embedding variables and values into placeholders within a template string. '''
'''Syntax
Syntax: { }.format(value)


Parameters: 


value : Can be an integer, floating point numeric constant, string, characters or even variables.
Returntype: Returns a formatted string with the value passed as parameter in the placeholder position. 

'''

print("\n Format String:{} = {} ".format(text, text))

text2="I have {an: .2f} Rupees"
print(text2.format(an=4))

# Keyword arguments are called
# by their keyword name
print("{gfg} is a {0} science portal for {1}"
      .format("computer", "geeks", gfg="GeeksforGeeks"))



 #replace()     

 #replace()
'''Syntax of String replace() Method
string.replace(old, new, count)

Parameters

old: The substring we want to replace.
new: The new substring that we want to replace with old substring.
count (optional): Specifies the maximum number of replacements to perform. If omitted, all occurrences are replaced.'''     

print("\n Replace String:", text.replace("for", "A"))




# maketrans() and translate() 
# Python3 code to demonstrate    

  
# specify to translate chars 
str1 = "wy"
  
# specify to replace with 
str2 = "gf"
  
# delete chars 
str3 = "u"
  
# target string  
trg = "weeksyourweeks"
  
# using maketrans() to  
# construct translate 
# table 
table = trg.maketrans(str1, str2, str3) 
  
# Printing original string  
print ("The string before translating is : ", end ="") 
print (trg) 
  
# using translate() to make translations. 
print ("The string after translating is : ", end ="") 
print (trg.translate(table))

#splitlines
# Python code to illustrate splitlines() 
string = "Welcome everyone to\rthe world of Geeks\nGeeksforGeeks"

# No parameters has been passed 
print (string.splitlines( )) 

# A specified number is passed 
print (string.splitlines(0)) 

# True has been passed 
print (string.splitlines(True))


#split(delimiter): Splits the string at the specified delimiter and returns a list of substrings. There is also rsplit and lsplit
# str.split(separator, maxsplit)

print ("String Split:", string.split("k",2))


#join(stringname)
a = ['Hello', 'world', 'from', 'Python']
res = ' '.join(a)
print("Join: ",res)
res1 = '-'.join(a)
print("Join",res1)
'''
isalnum()	Checks whether all the characters in a given string is alphanumeric or not
isalpha()	Returns “True” if all characters in the string are alphabets
isdecimal()	Returns true if all characters in a string are decimal
isdigit()	Returns “True” if all characters in the string are digits
isidentifier()	Check whether a string is a valid identifier or not
islower()	Checks if all characters in the string are lowercase
isnumeric()	Returns “True” if all characters in the string are numeric characters
isprintable()	Returns “True” if all characters in the string are printable or the string is empty
isspace()	Returns “True” if all characters in the string are whitespace characters
istitle()	Returns “True” if the string is a title cased string
isupper()	Checks if all characters in the string are uppercase
join()	Returns a concatenated String
ljust()	Left aligns the string according to the width specified
lower()	Converts all uppercase characters in a string into lowercase
lstrip()	Returns the string with leading characters removed
maketrans()	 Returns a translation table
partition()	Splits the string at the first occurrence of the separator 
replace()	Replaces all occurrences of a substring with another substring
rfind()	Returns the highest index of the substring
rindex()	Returns the highest index of the substring inside the string
rjust()	Right aligns the string according to the width specified
rpartition()	Split the given string into three parts
rsplit()	Split the string from the right by the specified separator
rstrip()	Removes trailing characters
splitlines()	Split the lines at line boundaries
startswith()	Returns “True” if a string starts with the given prefix
strip()	Returns the string with both leading and trailing characters
swapcase()	Converts all uppercase characters to lowercase and vice versa
title()	Convert string to title case
translate()	Modify string according to given translation mappings
upper()	Converts all lowercase characters in a string into uppercase
zfill()	Returns a copy of the string with ‘0’ characters padded to the left side of the string'''
