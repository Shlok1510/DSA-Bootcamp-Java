package com.lieutenant;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {

        sum();
        int ans =sum2();
        System.out.println(ans);
        String seq2 = seq();
        System.out.println(seq2);
        val(33,33);
        String greet = mygreet("shlok");
        System.out.println(greet);
    }

    private static String mygreet(String name) {
        return name;
    }

    public static void sum(){
        Scanner input = new Scanner(System.in);
         System.out.println("enter the numbers");
         int  ans = 33;
        System.out.println(ans);
        int n1,n2,sum33;
        n1= input.nextInt();
        n2= input.nextInt();
        sum33=n1+n2;
         System.out.println(sum33);

    }
    public static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("numbers");
         int n1=input.nextInt();
        int n2 = input.nextInt();
        int sum22= n1+n2;
        return sum22;

    }
    public static String seq(){
        return "lorem";
    }
    public static void val(int a,int b){
        int s=a+b;
        System.out.println(s);
    }
}
