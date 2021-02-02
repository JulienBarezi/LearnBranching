# Week 2
# Question 4

def list_handle(listA, listB):
    if len(listA) > len(listB):
        return set(listA).difference(listB)
    else:
        return set(listB).difference(listA)


listA = [6, 7, 8, 9, 10]
listB = [6, 7, 9, 10]

missing_el = list(list_handle(listA, listB))

print(*missing_el)

# Time Complexity: o(1)
# Space Complexity: o(1)

