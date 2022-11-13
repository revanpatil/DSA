# Intuition
https://www.youtube.com/watch?v=70tx7KcMROc&t=7765s&ab_channel=KunalKushwaha
<!-- Describe your first thoughts on how to solve this problem. -->

# Approach
![image.png](https://assets.leetcode.com/users/images/24f66aa2-6d3e-4f76-9cf9-9c88d1661973_1668333150.393077.png)
![image.png](https://assets.leetcode.com/users/images/4f863450-a79b-4e03-a21b-f700aa97227b_1668333178.6062489.png)

CC :  KunalKushwaha.
1. Here we first skip till left -1 using first for loop where we get our current to 2 and prev = 1 from where we need to reverse our linkedlist.
Here we create two important variable last == prev i.e 1 
and newWnd == current which will point towards end at last.
2. We run for loop which will reverse our linkedList.
3. After reversal from left to right we have our linkedlist as 
 1-->2-->3--->4-->5
But 1 should point to 4 and 2 should point to 5 
so now we use last to point towards prev where prev is at 4 
and we point newEnd towards current where current is at 5
So are linkedList becomes 
 1-->4-->3--->2-->5
 

<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: Constant O(1)
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;
        // To skip till left we iterate till where we want our          reverse our linkedList
        for(int i =0;current != null && i<left-1;i++){
            prev = current;
            current = current.next;
        }

        ListNode last = prev;  // store this values which helps to point at the end which is 1 
        ListNode newEnd = current;  newEnd = 2

        // reverse the linkedList 
        ListNode next = current.next;
        for(int i =0;current != null && i<right - left +1;i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }

        if(last!= null){
            last.next = prev;  // point last to prev which is 4 at this poiny
        }else{
            head = prev;
        }

        newEnd.next = current;  // point newEnd to current which is 5 at this point.
        return head;
    }
}
```
