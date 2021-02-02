# Week 2
# Question 5

def outtimes(n):
    numlist = []
    for i in range(1, n + 1):
        for b in range(i):
            numlist.append(i)

    return numlist


ntimes = 5
print(outtimes(ntimes))


# Time Complexity: o(n)
# Space Complexity: o(n)

