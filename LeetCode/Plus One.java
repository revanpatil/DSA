https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length-1;
        for(int i =length;i>=0;i--){
            if(digits[i] < 9){
                digits[i] = digits[i] +1;
                return digits;
            }
            digits[i] = 0;
            
        }
        int newdigits[] = new int[digits.length+1];
        newdigits[0] = 1;
        return newdigits;
    }
}
