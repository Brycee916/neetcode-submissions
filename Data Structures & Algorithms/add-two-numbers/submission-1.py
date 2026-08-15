# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        s1 = ""
        s2 = ""
        answerStr = ""
        while l1 != None:
            s1 = str(l1.val) + s1
            l1 = l1.next
        while l2 != None:
            s2 = str(l2.val) + s2
            l2 = l2.next
        answerStr = str(int(s1) + int(s2))
        answerStr = answerStr[::-1]
        #print(answerStr, type(answerStr))
        head = ListNode()
        dummyHead = head
        for char in answerStr:
            curr = ListNode(int(char))
            dummyHead.next = curr
            dummyHead = dummyHead.next
        return head.next
            
