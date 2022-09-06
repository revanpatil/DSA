class Solution {
    public boolean isHappy(int n) {  
       if(n == 1){
            return true;
        }
        if(n<=4){
            return false;
        }
        int ans = 0;
        while(n>0){
            ans += (int)Math.pow(n%10,2);
            n = n/10;
        }
        if(ans !=1){
            return isHappy(ans);
        }
        return true;
    }
}
