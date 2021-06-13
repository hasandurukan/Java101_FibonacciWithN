package com.java101;

import java.util.Scanner;

public class Main {

    static int fibSeries(int n) {
        if (n <= 1)
            return n;
        return fibSeries(n - 1) + fibSeries(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please type a number :");
        int number = input.nextInt();

        System.out.println(fibSeries(number));
    }
}
