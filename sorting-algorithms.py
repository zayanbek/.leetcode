
from typing import List
import random

# time: O(n) -> O(n^2)
# spac: O(1)
# stable
def bubble(a: List[int]) -> List[int]:
    n = len(a)
    
    for i in range(n - 1):
        swapped = False
        for j in range(n-i-1):
            if a[j] > a[j+1]:
                a[j],a[j+1]=a[j+1],a[j]
                swapped = True
        
        if not swapped:
            break
    
    return a

# O(n^2) -> O(n^2)
# O(1)
# unstable
def selection(a: List[int]) -> List[int]:
    return [1]

#
#
#
def insertion(nums: List[int]) -> List[int]:
    return [1]

#
#
#
def merge(nums: List[int]) -> List[int]: 
    return [1]

# time:
# spac:
# unstable
def iter_quick(nums: List[int]) -> List[int]:
    
    
    
    
    
    return [1]










nums = [5, 4, 90, 4, 13, 67, 100, 67]

bubble(nums)
print(nums)