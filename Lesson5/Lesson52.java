/*Дз No2
        Реализуйте программу, которая попросит пользователя ввести год
         и напечатать этот год isLeap (високосный) или нет.*/

import java.util.Scanner;

public class Lesson52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какой год начиная c 1584: ");
        int year = scanner.nextInt();
        if (year < 1584){
            System.out.println("Я же просил не меньше 1584");
        } else {
            System.out.println(year4(year));
        }

    }
    static String year4(int year) {
        String str = "";
        if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            str = "Год выскокосный";
        } else {
            str = "Год не высокосный";
        }
        return str;
    }
}
