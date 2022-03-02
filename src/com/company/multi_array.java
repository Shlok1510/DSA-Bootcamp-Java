package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class multi_array {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int col = 0; col < a[i].length; col++) {
                a[i][col] = input.nextInt();

            }
        }
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
        System.out.println(Arrays.toString(a[2]));
    }
}