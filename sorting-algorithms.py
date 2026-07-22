
from typing import List
import random

# O(n) -> O(n^2)
# stable
def bubble(a: List[int]) -> List[int]:
    n = len(nums)
    
    for i in range(n - 1):
        swapped = False
        for j in range(n-i-1):
            if a[j] > a[j+1]:
                a[j],a[j+1]=a[j+1],a[j]
                swapped = True
        
        if not swapped:
            break
    
    return nums

#
#
def selection(nums: List[int]) -> List[int]:
    
    
    
    return [1]

def insertion(nums: List[int]) -> List[int]:
    return [1]

def merge(nums: List[int]) -> List[int]:
    return [1]

def quick(nums: List[int]) -> List[int]:
    return [1]



nums = [random.randint(1, 100) for _ in range(10)]

sorted = bubble(nums)
nums.sort()

print(sorted == nums)