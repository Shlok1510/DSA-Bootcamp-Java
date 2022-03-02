package com.rahul;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>(10);
        ArrayList<Integer> li2 = new ArrayList<>(33);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            li.add(input.nextInt());
            for (int j = 0; j < 5; j++) {
                li.get(i);

            }

            System.out.println(li);

    }}
}
