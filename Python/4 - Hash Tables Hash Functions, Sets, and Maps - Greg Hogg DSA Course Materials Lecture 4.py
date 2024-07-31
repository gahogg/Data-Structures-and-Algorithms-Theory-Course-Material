# Hash Tables - Hash Functions, Sets & Maps - Greg Hogg DSA Course Materials Lecture 4

# The Colab Notebook can be viewed here: https://colab.research.google.com/drive/1Xr2RWAepxR1NVLQ3CoAq9rG8RQqiue-L


# Hashsets

s = set()
print(s)

# Add item into Set - O(1)
s.add(1)
s.add(2)
s.add(3)

print(s)

# Lookup if item in set - O(1)
if 1 not in s:
  print(True)

# Remove item from set - O(1)
s.remove(3)

print(s)

# Set construction - O(S) - S is the length of the string
string = 'aaaaaaabbbbbbbbbbbccccccccceeeeeeeee'
sett = set(string)

sett

# Loop over items in set - O(n)
for x in s:
  print(x)

# Hashmaps - Dictionaries

d = {'greg': 1, 'steve': 2, 'rob': 3}

print(d)

# Add key:val in dictionary: O(1)
d['arsh'] = 4

print(d)

# Check for presence of key in dictionary: O(1)
if 'greg' in d:
  print(True)

# Check the value corresponding to a key in the dictionary: O(1)
print(d['greg'])

# Loop over the key:val pairs of the dictionary: O(n)
for key, val in d.items():
  print(f'key {key}: val {val}')

# Defaultdict

from collections import defaultdict

default = defaultdict(list)

default[2]

default

# Counter
from collections import Counter

counter = Counter(string)

print(counter)

