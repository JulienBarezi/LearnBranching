# Week 2
# Question 2

def char_occur(n):
    char_store = {}
    for i in n:
        char_store[i] = char_store.get(i, 0) + 1

    return str(char_store)


sample_text = "structures"
nbr_of_occ = char_occur(sample_text)
print("Number of occurences in " + sample_text + " is: " + nbr_of_occ)

# Time Complexity: o(n)
# Space Complexity: o(n)




