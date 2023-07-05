/*№1

        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
        Числа могут быть, как целочисленные, так и дробные.

        Например :
        ввод : m=10.5, n=10.45
        вывод: Число 10.45 ближе к 10.*/


import java.util.Scanner;


public class Lesson4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое положительное число m: ");
        double m = sc.nextDouble();

        System.out.println("Введите второе положительное число n: ");
        double n = sc.nextDouble();

        if (m == 10 || n == 10){
            equal(n,m);
        } else if ( m > 10 && n > 10) {
            ifElse(n,m);
        } else if (m < 10 && n < 10 ) {
            if (m == 10 || n == 10) {
                equal(n,m);
            } else {
                ifElseSmall(n,m);
            }
        } else if (m < n){
            ifLess(m,n);
        } else {
            ifMore(m,n);
        }

    }



    static void ifElse(double m, double n) {
        if (m > n){
            System.out.println("Число " + n + " ближе к 10");
        } else  {
            System.out.println("Число " + m + " ближе к 10");
        }
    }
    static void ifElseSmall(double m, double n) {
        if (m < n){
            System.out.println("Число " + n + " ближе к 10");
        } else  {
            System.out.println("Число " + m + " ближе к 10");
        }
    }

    static void equal(double m, double n) {
        if (m == n) {
            System.out.println("Оба числа " + n + " и " + m + " равны 10");
        } else if (m == 10) {
            System.out.println("Число " + m + " ближе к 10");
        } else {
            System.out.println("Число " + n + " ближе к 10");
        }
    }

    static void dif(double dif1, double dif2, double m, double n) {
        if (dif1 > dif2) {
            System.out.println("Число " + m + " ближе к 10");
        } else {
            System.out.println("Число " + n + " ближе к 10");
        }
    }

    static void ifLess(double m, double n) {
        double dif1 = m - 10;
        double dif2 = 10 - n;
        dif(dif1, dif2, m , n);
    }
    static void ifMore(double m, double n) {
        double dif1 = 10 - m;
        double dif2 = n - 10;
        dif(dif1, dif2, m , n);
    }
}
