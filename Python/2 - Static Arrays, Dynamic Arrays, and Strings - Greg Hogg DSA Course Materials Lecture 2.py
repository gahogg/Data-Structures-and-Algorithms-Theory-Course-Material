# Static Arrays, Dynamic Arrays, and Strings - Greg Hogg DSA Course Materials Lecture 2

# The Colab Notebook can be viewed here: https://colab.research.google.com/drive/1U9tv4lgJ6HV-e_h4MdBlgqlbqw8IogSJ


A = [1, 2, 3]

# Append - Insert element at end of array - On average: O(1)
A.append(5)

# Pop - Deleting element at end of array - O(1)
A.pop()

# Insert (not at end of array) - O(n)
A.insert(2, 5)

# Modify an element - O(1)
A[0] = 7

# Accessing element given index i - O(1)
print(A[2])

# Checking if array has an element - O(n)
if 7 in A:
  print(True)

# Checking length - O(1)
print(len(A))



# Strings

# Append to end of string - O(n)
s = 'hello'

b = s + 'z'

# Check if something is in string - O(n)
if 'f' in s:
  print(True)

# Access positions - O(1)
print(s[2])

# Check length of string - O(1)
print(len(s))

