// Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

 

// Example 1:

// Input: c = 5
// Output: true
// Explanation: 1 * 1 + 2 * 2 = 5
// Example 2:

// Input: c = 3
// Output: false
 

// Constraints:

// 0 <= c <= 231 - 1

class Solution {
    public boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long)Math.sqrt(c);
        while(start <=end){
            long ans = start*start + end*end;
            if(ans == c){
                return true;
            }
            else if(ans<c){
                start++;
            }
            else{
                end--;
            }
        }
        return false;
        
        
    }
}
