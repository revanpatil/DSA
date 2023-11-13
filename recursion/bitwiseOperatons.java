package io.github.jiangdequan;

public class bitwiseOperatons {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(findithBit(10,2)));
    }

    
    public static int findithBit(int num, int n){
         int output = num & 1<<n-1 ;
         return n;
    }
}