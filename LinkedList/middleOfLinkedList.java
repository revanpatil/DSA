# Intuition 
LinkedList Cycle Theorem
<!-- Describe your first thoughts on how to solve this problem. -->

# Approach
When fast pointer reaches end then slow is going to be at middle.
<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity: O(n/2)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while(f !=null && f.next !=null){
            s = s.next;
            f = f.next.next;
        }

        return s;
    }
}
```
