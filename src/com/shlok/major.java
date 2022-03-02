package com.shlok;

import java.util.Scanner;

public class major {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        //String fruit = input.nextLine();
        String a = "kunal";
        String b = "kunal";
        String tom = input.nextLine();
       // System.out.println(a==b);
        switch (tom) {
            case "kunalll":
                System.out.println("kunal is smart");
                break;
            case "kunal":
                System.out.println("got it");
                break;
            default:
                System.out.println("default");

        }
        int day = input.nextInt();
        if (day == 1) {
            System.out.println("monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("shlok agarwal");
        }
        int emp = input.nextInt();
        String dep = input.nextLine();
        switch (emp){
            case 1:
                System.out.println("nested switch");
                break;
            case 2:
                System.out.println("random");
                break;
            case 3:
                System.out.println("enter department");
                switch (dep) {
                    case "instru":
                        System.out.println("bakwas");
                        break;
                    case "ads":
                        System.out.println("nice");
                        break;
                    case "cs":
                        System.out.println("dammmmm");
                        break;
                    default:
                        System.out.println("wrong department");
                }
                }

        }

    }



/*
syntax of if statements
 */

