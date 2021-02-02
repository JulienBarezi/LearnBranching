import time
import memory_profiler
from memory_profiler import profile
import matplotlib.pyplot as plt

@profile
def FindLargestNumber(list):
    uniqueSet = set(list)
    sort = sorted(uniqueSet)
    print(sort)
    return sort


#Time and space for length 1

start1 = time.time()
list1 = [1]

sort1 = FindLargestNumber(list1)
print("The largest number is", sort1[-1])

end1 = time.time()
print(f"Runtime of the program is at length of 1 is {end1 - start1}")

x1 = memory_profiler.memory_usage()

print(x1[-1])


#Time and space for length 50

start50 = time.time()
list50 = [1,34,234,35,34,78,356,908,453,345,234,6456,23,423,234,237,980,231,36,657,234,2345,97,321,9,346,6765,678,
          145,1234,4323,122,3,4355,5645,45645,2,3,4,5,6,7,8,9,10,1919,98774,54,564,4564]

sort50 = FindLargestNumber(list50)
print("The largest number is", sort50[-1])

end50 = time.time()
print(f"Runtime of the program is at length of 50 is {end50 - start50}")

x50 = memory_profiler.memory_usage()

print(x50[-1])
#
# #Time and space for length 100
#
start100 = time.time()
list100 = [1,34,234,35,34,78,356,908,453,345,234,6456,23,423,234,237,980,231,36,657,234,2345,97,321,9,346,6765,678,
          145,1234,4323,122,3,4355,5645,45645,2,3,4,5,6,7,8,9,10,1919,98774,54,564,4564,2342,5645,324,1233,435,7667
           ,3454,5367,879,2342,7567,23423,7658,3423434,57647,34234,765876,234324,74,2345,345,574,3452,45345,5435
           ,534,23423,656,2342,6456,7899,3523,1423,87978,32423,6769,452,67567,234,4636,234321,467,3243,235436,252,234
           ,3432,5654,878,63]

sort100 = FindLargestNumber(list100)
print("The largest number is", sort100[-1])

end100 = time.time()
print(f"Runtime of the program is at length of 50 is {end100 - start100}")

x100 = memory_profiler.memory_usage()

print(x100[-1])

time = [0.11206, 0.06247, 0.04652]
space = [18.35546, 18.29687, 18.29687]

plt.plot(time, space)
plt.title("Time and space from different lengths of input")
plt.xlabel("Time")
plt.ylabel("Space")
plt.show()
