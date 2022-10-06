//https://leetcode.com/problems/valid-palindrome/submissions/
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.


class Solution {
     public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        for(int i = 0, j = sb.length() - 1; i < sb.length() - 1;){
            if((sb.charAt(i) >= 97 && sb.charAt(i) <= 122) || (sb.charAt(i) >= 48 && sb.charAt(i) <=57)){
                if( (sb.charAt(j) >= 97 &&  sb.charAt(j) <= 122) || (sb.charAt(j) >= 48 && sb.charAt(j) <=57)){
                    if(sb.charAt(i) != sb.charAt(j)){
                        return false;
                    }
                    i++;
                    j--;
                }else{
                    j--;
                }
            }else{
                i++;
            }
        }
        return true;
    }
}
