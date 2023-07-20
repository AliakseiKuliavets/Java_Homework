/*1 уровень сложности: Дз No1
        Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
        Реализует логический метод canBuy,  возвращающий boolean
        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
        Отобразите строку «Я могу купить еду, это ……» и значение.

         Не понял сути задания реализовал как смог
        */

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько сейчас времени в часах: ");
        int hour = scanner.nextInt();


        // Режим работы Edeka start1 - начало работы, end1 - конец рабочего дня
        // Режим работы Rewe start2 - начало работы, end2 - конец рабочего дня

        int start1, start2, end1, end2;
        start1 = 9;
        end1 = 17;
        start2 = 12;
        end2 = 22;

        if (hour > end2 || hour < start1) {
            System.out.println("Все магазины закрыты");
        } else {
            System.out.println("Я могу купить еду в: \n"
            + "isEdekaOpen: " + canByEdeka(start1,end1,hour)
            + "\nisReweOpen: " + canByRewe(start2,end2,hour));
        }
    }
    static boolean canByEdeka(int start1, int end1, int hour) {
        if ( hour >= start1 && hour < end1) {
            return  true;
        } else {
            return false;
        }
    }
