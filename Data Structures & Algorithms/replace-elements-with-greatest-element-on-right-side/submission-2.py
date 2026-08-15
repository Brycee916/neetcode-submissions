class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        #from right to left
        greatest_right = arr[-1]
        res = [0] * len(arr)
        for i in range(len(arr)-1, 0, -1):
            #greatest element
            greatest_right = max(greatest_right, arr[i])
            res[i-1] = greatest_right

        #last element -1
        res[-1] = -1
        return res