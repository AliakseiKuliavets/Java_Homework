package org.telran.lesson15New;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

       int sec;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на часах ");
        sec = scanner.nextInt();


       if ( sec > 0 && sec < 28_800 ) {
           howManyHors(sec);
       } else {
           System.out.println("У тебя плохое зрение, или попроси у начальника выше ЗП");
       }
    }
    public  static void howManyHors(int sec) {
        int hour = sec / (60 * 60);
        System.out.println("До конца рабочего дня осталось полных часов: " + hour);
        System.out.println("Количество секунд до конца рабочего дня: " + sec);
    }
}
