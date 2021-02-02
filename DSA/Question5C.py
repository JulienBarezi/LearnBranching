import random
import time

start = time.time()

randomlist = []


for i in range(1000000):
    n = random.randint(1, 10000000)
    randomlist.append(n)
print(randomlist)

def sortList(list):
    return sorted(list)



sorted = sortList(randomlist)


print(sorted)


end = time.time()
print(f"Runtime of the program is {end - start}")