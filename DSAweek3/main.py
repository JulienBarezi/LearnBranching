#Week 3 Question 4

students = {"Julien": 4, "Diane": 4, "Hubert": 3, "Kenny": 3, "Jane": 2,"Peter": 4}
tv = {"LG": 4000, "Startimes": 3000, "Samsung": 4500, "Sony": 6500}
phones = {"iPhone": 1200, "Tecno": 120, "Samsung": 800, "Itel": 80}
juices = {"apple": 1000, "orange": 600, "pineapple": 600, "mango": 900}


#Adding Key and value
students["Chris"] = (3)

print(students)

#remove key
del tv["Startimes"]
print(tv)

#modify key(new value)
phones.update({"Alcatel": 300})
print(phones)

#lookup(key)
x = juices.get("mango")
print(x)



#Time complexity is O(1)
#Space complexity is O(1)
