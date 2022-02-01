package com.company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("----- My Calculator -----");
        while(true) {
            System.out.println("Enter the operator:");
            char ch = in.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("Enter two operands");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (ch == '+') {
                    System.out.println(num1 + num2);
                } else if (ch == '-') {
                    System.out.println(num1 - num2);
                } else if (ch == '*') {
                    System.out.println(num1 * num2);
                } else if (ch == '/') {
                    if (num2 != 0) {
                        System.out.println(num1 / num2);
                    } else {
                        System.out.println("division cannot be performed");
                    }
                } else if (ch == '%') {
                    System.out.println(num1 % num2);
                }

            } else if (ch == 'x' || ch == 'X') {
                System.out.println("program finished");
                break;
            } else {
                System.out.println("invalid");
            }
        }
    }
}
