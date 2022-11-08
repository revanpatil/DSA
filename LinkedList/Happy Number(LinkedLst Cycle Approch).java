Intuition :
LinkedList Cycle Theorem

Approach :
Here we are using linkedlist cycle theorem where we need to check if number sqaure is returning to the same previous number so used to pointer fast and slow which checks if it is in iterative cycle or else return true

Complexity
Time complexity: O(n)
Space complexity: O(1)
Code
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = square(slow);
            fast = square(square(fast));
        }
        while(slow != fast);
    
        if(slow == 1){
            return true;
        }
        return false;
    }

    public static int square(int number){
        int ans = 0;
        while(number > 0){
            int rem = number %10;
            ans = ans + rem * rem;
            number = number/10;
        }
        return ans;
    }
}
