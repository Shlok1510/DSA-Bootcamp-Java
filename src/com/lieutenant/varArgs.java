package com.lieutenant;

import java.util.Arrays;
import java.util.Scanner;

public class varArgs {
    public static void main(String[] args) {
        fun(22,22,22,22,33,3444,33,99,999,99);
        multiple(33,33,"Shlok","Rupesh","Agarwal");

trial(22);
trial(555);
        Scanner input = new Scanner(System.in);
                int n = input.nextInt();
boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static void trial(int a){
        System.out.println(a);
    }
     static  void multiple(int a , int b ,String ...v){
         System.out.println(Arrays.toString(v));
     }
    public static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static boolean isPrime(int n){
        int num=n;
        int sum = 0;
        while (n > 0) {
           int d=n%10;
            int t=d*d*d;
n=n/10;
             sum = sum + t;

        }
        return sum == num;

    }
}
