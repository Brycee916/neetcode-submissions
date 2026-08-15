class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        # or every element starting left
        for i in range(0, len(arr)):
            # find greatest element to the right
            greatest_right = 0
            for j in range(i+1, len(arr)):
                greatest_right = max(greatest_right, arr[j])
                # replace current element with that greatest
            arr[i] = greatest_right
        arr[-1] = -1
        return arr