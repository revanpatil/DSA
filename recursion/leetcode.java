/*
509. Fibonacci Number

https://leetcode.com/problems/fibonacci-number/
*/

package io.github.jiangdequan;

public class fibonacci {
 public static void main(String[] args) {
    int ans = fibo(10);
    System.out.println(ans);
 }  
 static int fibo(int n){
    if(n<2){
        return n;
    }
    return fibo(n-1) + fibo(n-2);
 } 
}
