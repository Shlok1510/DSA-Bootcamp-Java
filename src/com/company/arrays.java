package com.company;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a;//declaration of a vairable , a(reference variable) is added in the stack
        a= new int[5];//initialisation that is object is being created in heap
        a[4]=44;
        a[3]=33;
        for (int i=0;i<a.length;i++)
        {
            a[i]=input.nextInt();
        }
        for (int j : a) {
            System.out.println(j);
        }
        String[] s = new String[4];
        for (int i =0;i< s.length;i++){
            s[i]= input.nextLine();
        }for (int i =0;i< s.length;i++){
            System.out.println(s[i]);
        }

            }
}
