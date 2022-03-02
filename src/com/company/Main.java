package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("shlok");
        byte b = 3;
        char c = 'c';
        int e = 33;
        short s = 1024;
        float f = 77.88f;
        double d = 0.111;
        double result = (b * c / (e + b));

        //System.out.println(result);
        while (b <= 5) {
            System.out.println("pablo");
            b++;
        }
        for (int z =1; z<=5 ; z++){
            System.out.println("agarwal");
        }
        System.out.println("enter temprature in celsius");
        int celsius = input.nextInt();
        double farhenite = 9/5 *celsius +32;
        System.out.println(farhenite);


    }
    }

