import time
import memory_profiler
from memory_profiler import profile
import matplotlib.pyplot as plt


@profile
def lowerCase(word):
    lowerWord = word.lower()
    return lowerWord


# Time and space for length 1

start1 = time.time()

finalWord1 = lowerCase("A")
print(finalWord1)

end1 = time.time()
print(f"Runtime of the program is at length of 1 is {end1 - start1}")


x1 = memory_profiler.memory_usage()

print(x1[-1])


# Time and space for length 50

start50 = time.time()

finalWord50 = lowerCase("RWANDAAAAAAAAAAARWANDAAAAAAAAARWANDAAAAAARWANDAAAA")
print(finalWord50)

end50 = time.time()
print(f"Runtime of the program is at length of 50 is {end50 - start50}")


x50 = memory_profiler.memory_usage()

print(x50[-1])


# Time and space for length 50

start100 = time.time()

finalWord100 = lowerCase("RWANDAAAAAAAAAAARWANDAAAAAAAAARWANDAAAAAARWANDAAAAODHDFBEVBSBFIIWHJFNDJGUSYETGFHGJD"
                         "FHGJDBGHDHSTRYYO")
print(finalWord100)

end100 = time.time()
print(f"Runtime of the program is at length of 50 is {end100 - start100}")


x100 = memory_profiler.memory_usage()

print(x100[-1])

time = [0.09378, 0.09372, 0.09365]
space = [51.34765, 51.35156, 51.37890]

plt.plot(time, space)
plt.title("Time and space from different lengths of input")
plt.xlabel("Time")
plt.ylabel("Space")
plt.show()