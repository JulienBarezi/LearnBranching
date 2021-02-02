import random
import time

start = time.time()


random_string = ''

for _ in range(1000000):
    # Considering only upper and lowercase letters
    random_integer = random.randint(97, 97 + 26 - 1)
    flip_bit = random.randint(0, 1)
    # Convert to lowercase if the flip bit is on
    random_integer = random_integer - 32 if flip_bit == 1 else random_integer
    # Keep appending random characters using chr(x)
    random_string += (chr(random_integer))



def lowerCase(word):
    lowerWord = word.lower()
    return lowerWord


finalWord = lowerCase(random_string.upper())


print(finalWord)
end = time.time()


print(f"Runtime of the program is {end - start}")