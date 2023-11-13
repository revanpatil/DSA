package io.github.jiangdequan;

public class sumOfDigitsRec {
    public static void main(String[] args) {
        int out = sum(1234);
        System.out.println(out);
    }
    static int sum(int n){
        if(n == 0){
         return 0;
        }

        return n%10 + sum(n/10);
    }
}