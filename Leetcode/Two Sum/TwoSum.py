from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        length = len(nums)
        result = []
        i = 0
        while i < length:
            num1 = nums[i]
            j = i + 1
            while j < length + 1:
                if (j == length):
                    j = 0
                if (i == j):
                    break
                num2 = nums[j]
                if ((num1 + num2) == target):
                    result.append(i)
                    result.append(j)
                    return result
                j += 1
            i += 1
        return result


                
                
        