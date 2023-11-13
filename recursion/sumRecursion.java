package io.github.jiangdequan;

public class sumRecursion {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }
    
    static int sum(int n){
        if(n<1){
            return 0;
        }
         
        return n + sum(n-1);
    }
}