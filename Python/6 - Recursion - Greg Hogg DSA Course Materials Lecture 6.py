# Recursion - Greg Hogg DSA Course Materials Lecture 6

# The Colab Notebook can be viewed here: https://colab.research.google.com/drive/1qdUMlMleXTlObv-r-jdJj6tR2Vmes5AF


# Fibonacci
# F(0) = 0
# F(1) = 1
# n > 1: F(n) = F(n-1) + F(n-2)

# Time: O(2^n), Space: O(n)
def F(n):
  if n == 0:
    return 0
  elif n == 1:
    return 1
  else:
    return F(n-1) + F(n-2)

print(F(10))


# Linked Lists

class SinglyNode:

  def __init__(self, val, next=None):
    self.val = val
    self.next = next

  def __str__(self):
    return str(self.val)

Head = SinglyNode(1)
A = SinglyNode(3)
B = SinglyNode(4)
C = SinglyNode(7)

Head.next = A
A.next = B
B.next = C

print(Head)

# Time: O(n), Space: O(n)
def reverse(node):
  if not node:
    return

  reverse(node.next)
  print(node)


reverse(Head)

