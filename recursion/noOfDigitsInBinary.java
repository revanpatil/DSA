package io.github.jiangdequan;

public class noOfDigitsInBinary {
    public static void main(String[] args) {
        int base = 2;
        int n = 1456;
        int ans = (int)((Math.log(n)/Math.log(base)) +1);
        System.out.println(ans);
    }
}