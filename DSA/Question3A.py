
list = [1, 23, 34, 56, 53, 31, 78, 12, 45, 23, 12]


def FindLargestNumber(list):
    uniqueSet = set(list)
    sort = sorted(uniqueSet)
    print(sort)
    return sort

sort1 = FindLargestNumber(list)
print("The largest number is", sort1[-1])

