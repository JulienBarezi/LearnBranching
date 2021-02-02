import time

start = time.time()


def FindLargestNumber(list):
    uniqueSet = set(list)
    sort = sorted(uniqueSet)
    print(sort)
    return sort

list=[]

for i in range (1000001):
    list.append(i)


sort1 = FindLargestNumber(list)
print("The largest number is " + str(sort1[-1]))


end = time.time()
print(f"Runtime of the program is {end - start}")