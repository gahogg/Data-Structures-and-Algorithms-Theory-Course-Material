# Sorting Algorithms - Greg Hogg DSA Course Materials Lecture 10

# The Colab Notebook can be viewed here: https://colab.research.google.com/drive/1dk8Nch71bZpt9Mpi_E4NurxrpIh0jZhS


# Bubble Sort
# Time: O(n^2)
# Space: O(1)

A = [-5, 3, 2, 1, -3, -3, 7, 2, 2]

def bubble_sort(arr):
  n = len(arr)
  flag = True
  while flag:
    flag = False
    for i in range(1, n):
      if arr[i-1] > arr[i]:
        flag = True
        arr[i-1], arr[i] = arr[i], arr[i-1]

bubble_sort(A)
print(A)

# Insertion Sort
# Time: O(n^2)
# Space: O(1)

B = [-5, 3, 2, 1, -3, -3, 7, 2, 2]

def insertion_sort(arr):
  n = len(arr)
  for i in range(1, n):
    for j in range(i, 0, -1):
      if arr[j-1] > arr[j]:
        arr[j-1], arr[j] = arr[j], arr[j-1]
      else:
        break

insertion_sort(B)
print(B)

# Selection Sort
# Time: O(n^2)
# Space: O(1)

C = [-3, 3, 2, 1, -5, -3, 7, 2, 2]

def selection_sort(arr):
  n = len(arr)
  for i in range(n):
    min_index = i
    for j in range(i+1, n):
      if arr[j] < arr[min_index]:
        min_index = j
    arr[i], arr[min_index] = arr[min_index], arr[i]

selection_sort(C)
print(C)

# Merge Sort
# Time: O(n log n)
# Space: O(n) - Note: can be Log n, but this is harder to write


D = [-5, 3, 2, 1, -3, -3, 7, 2, 2]

def merge_sort(arr):
  n = len(arr)

  if n == 1:
    return arr

  m = len(arr) // 2
  L = arr[:m]
  R = arr[m:]

  L = merge_sort(L)
  R = merge_sort(R)
  l, r = 0, 0
  L_len = len(L)
  R_len = len(R)

  sorted_arr = [0] * n
  i = 0

  while l < L_len and r < R_len:
    if L[l] < R[r]:
      sorted_arr[i] = L[l]
      l += 1
    else:
      sorted_arr[i] = R[r]
      r += 1

    i += 1

  while l < L_len:
    sorted_arr[i] = L[l]
    l += 1
    i += 1

  while r < R_len:
    sorted_arr[i] = R[r]
    r += 1
    i += 1

  return sorted_arr

print(merge_sort(D))

# Quick Sort
# Time: O(n log n) (Average case, technically Worst case is O(n^2))
# Space: O(n)

E = [-5, 3, 2, 1, -3, -3, 7, 2, 2]

def quick_sort(arr):
  if len(arr) <= 1:
    return arr

  p = arr[-1]

  L = [x for x in arr[:-1] if x <= p]
  R = [x for x in arr[:-1] if x > p]

  L = quick_sort(L)
  R = quick_sort(R)

  return L + [p] + R

print(quick_sort(E))

# Counting Sort
# Time: O(n + k) where k is the range of data

# Note - This can be written with negative arrays, but we'll stick to positive arrays,
# so k is the max of the array

# Space: O(k)

F = [5, 3, 2, 1, 3, 3, 7, 2, 2]

def counting_sort(arr):
  n = len(arr)
  maxx = max(arr)
  counts = [0] * (maxx + 1)

  for x in arr:
    counts[x] += 1

  i = 0
  for c in range(maxx + 1):
    while counts[c] > 0:
      arr[i] = c
      i += 1
      counts[c] -= 1

counting_sort(F)
print(F)

# What we usually do in practice

# Time complexity is O(n log n) from using Tim Sort

G = [-5, 3, 2, 1, -3, -3, 7, 2, 2]

# In place (constant space)
G.sort()

print(G)

# Get new sorted array - O(n) space

H = [-5, 3, 2, 1, -3, -3, 7, 2, 2]

sorted_H = sorted(H)

print(H, sorted_H)

# Sort array of tuples

I = [(-5, 3), (2, 1), (-3, -3), (7, 2), (2, 2)]

sorted_I = sorted(I, key = lambda t: -t[1])

print(sorted_I)

