package org.telran.lesson15New;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double m;
        double n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число");
        m = scanner.nextDouble();

        System.out.print("Введите второе число");
        n = scanner.nextDouble();

        double mPos = m - 10;  //1
        double nPos = n - 10; // 6

        if (mPos<0) {
            mPos = -mPos;
        }

        if (nPos < 0) {
            nPos = -nPos;
        }

        if (mPos < nPos) {
            System.out.println("Число " + m + " ближе к 10");
        } else if (nPos < mPos) {
            System.out.println("Число " + n + " ближе к 10");
        } else {
            System.out.println("Два числа одинаково ближе к 10");
        }
    }
}
