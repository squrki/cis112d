# Sample code to read input and write output:

'''
NAME = input()                # Read input from STDIN
print("Hello " + NAME)        # Write output to STDOUT

7
11 5 11 5 11 5 11

3 1


8
12 10 6 12 10 12 1 21 

2 4
'''

# Warning: Printing unwanted or ill-formatted
# data to output will cause the test cases to fail

# Write your code here


# size = input("size: ")
# numString = input("number:")
size = 7
# numString = "11 5 11 5 11 5 11"
# numString = "12 10 6 12 10 12 1 21"
numString = "4 12 7 3 15 4 9 1 12 8 4 7 3 15 14 9 1 12 8 2 4 7 3 15 14 9 1 12 8 2 4 7 3 15 14 9 1 12 8 2 4 7 3 15 14 9 1 12 8 2 4 7 3 15 14 9 1 12 8 2 4 7 3 15 14 9 1 12 8 2 4 7 3 15 14 9 1 12 8 2 4 7 3 15 14 9 1 12 8 2 4 7 3 15 14 9 1"
# 47 3
nums = numString.split(" ")
numList = []
remaining = 0
pairs = 0
for i, n in enumerate(nums):
    if n in numList:
        pairs += 1
        numList.remove(n)
    else:
        numList.append(n)
remaining = len(numList)
val = str(pairs) + " " + str(remaining)

print(val)
