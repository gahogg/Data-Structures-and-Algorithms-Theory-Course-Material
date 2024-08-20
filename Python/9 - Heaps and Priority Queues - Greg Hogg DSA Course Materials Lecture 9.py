# Heaps and Priority Queues - Greg Hogg DSA Course Materials Lecture 9

# The Colab Notebook can be viewed here: https://colab.research.google.com/drive/1vUROF93_7r8hP3_Q9PjOWCgIEdiDpLae


# Build Min Heap (Heapify)
# Time: O(n), Space: O(1)

A = [-4, 3, 1, 0, 2, 5, 10, 8, 12, 9]

import heapq
heapq.heapify(A)

print(A)

# Heap Push (Insert element)
# Time: O(log n)

heapq.heappush(A, 4)

print(A)

# Heap Pop (Extract min)
# Time: O(log n)

minn = heapq.heappop(A)

print(A, minn)

# Heap Sort
# Time: O(n log n), Space: O(n)
# NOTE: O(1) Space is possible via swapping, but this is complex

def heapsort(arr):
  heapq.heapify(arr)
  n = len(arr)
  new_list = [0] * n

  for i in range(n):
    minn = heapq.heappop(arr)
    new_list[i] = minn

  return new_list

print(heapsort([1, 3, 5, 7, 9, 2, 4, 6, 8, 0]))

# Heap Push Pop: Time: O(log n)

heapq.heappushpop(A, 99)
print(A)

# Peak at Min: Time O(1)
print(A[0])

# Max Heap

B = [-4, 3, 1, 0, 2, 5, 10, 8, 12, 9]
n = len(B)

for i in range(n):
  B[i] = -B[i]

heapq.heapify(B)

print(B)

largest = -heapq.heappop(B)

print(largest)

heapq.heappush(B, -7) # Insert 7 into max heap

print(B)

# Build heap from scratch - Time: O(n log n)

C = [-5, 4, 2, 1, 7, 0, 3]

heap = []

for x in C:
  heapq.heappush(heap, x)
  print(heap, len(heap)) # Check size of heap

# Putting tuples of items on the heap

D = [5, 4, 3, 5, 4, 3, 5, 5, 4]

from collections import Counter

counter = Counter(D)

print(counter)

heap = []

for k, v in counter.items():
  heapq.heappush(heap, (v, k))

print(heap)
