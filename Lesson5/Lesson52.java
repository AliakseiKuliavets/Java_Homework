/*Дз No2
        Реализуйте программу, которая попросит пользователя ввести год
         и напечатать этот год isLeap (високосный) или нет.*/

package org.telran.lesson15New;

import java.util.Scanner;

    public class Lesson52 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите какой год начиная c 1584: ");
            int year = scanner.nextInt();
            if (year < 1584){
                System.out.println("Я же просил не меньше 1584");
            } else {
                year4(year);
            }

        }
        static void year4(int year) {
            if ((( year % 4 == 0) && (year % 100 != 0 ))|| year % 400 == 0) {
                System.out.println("Год высокосный");
            } else  {
                System.out.println("Не высокосный");
            }
        }
    }
