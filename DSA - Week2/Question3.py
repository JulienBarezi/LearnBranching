# Week 2
# Question 3

def list_handle(elem):
    my_set = set()
    for i in range(len(elem)):
        for b in range(7):
            my_set.add(elem[i][b])

    return list(my_set)


list_elem = [[5, 3, 4, 6, 7, 6, 8], [20, 8, 49, 1, 31, 0, 9], [0, 85, 52, 4, 38, 1, 20]]

print(list_handle(list_elem))

# Time complexity: o(n)
# Space complexity: o(n)


