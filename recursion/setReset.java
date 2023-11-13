package io.github.jiangdequan;

public class setReset {
    public static void main(String[] args) {
       System.out.println(Integer.toBinaryString(setResetZero(3,10)));
       System.out.println(Integer.toBinaryString(reset(2,10)));
       System.out.println(Integer.toBinaryString(rightMostSetBit(3)));
    }
    public static int setResetZero(int n, int bit){
        int output = 0;
        output = bit | (1 << (n-1));
        return output;
    }

    public static int reset(int n, int bit){
        int output = 0;
        output = bit & ~(1 << (n-1));
        return output;
    }

    public static int rightMostSetBit(int K){
        int output = 0;
        output = K & -K;  
        return output;
    }
}

