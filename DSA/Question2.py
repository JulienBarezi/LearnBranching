#question2

import memory_profiler
from memory_profiler import profile

@profile
def lowerCase(word):
    lowerWord = word.lower()
    return lowerWord


finalWord = lowerCase("AMERICAAAAAA")


print(finalWord)

x = memory_profiler.memory_usage()

print(x[-1])